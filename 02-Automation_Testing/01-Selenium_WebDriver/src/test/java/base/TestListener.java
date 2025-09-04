package com.amr.automation.base;

import com.amr.automation.utils.ScreenshotUtil;
import io.qameta.allure.Allure;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.ByteArrayInputStream;
import java.nio.file.Files;
import java.nio.file.Path;

public class TestListener implements ITestListener {
    @Override
    public void onTestFailure(ITestResult result) {
        Object obj = result.getInstance();
        try {
            org.openqa.selenium.WebDriver driver = null;
            if (obj instanceof BaseTest) {
                driver = ((BaseTest) obj).getDriver();
            } else {
                // try to retrieve driver reflectively in case tests use a different base
                try {
                    var f = obj.getClass().getDeclaredField("driver");
                    f.setAccessible(true);
                    driver = (org.openqa.selenium.WebDriver) f.get(obj);
                } catch (Exception ignored) {
                }
            }

            Path path = null;
            if (driver != null) {
                path = com.amr.automation.utils.ScreenshotUtil.takeScreenshot(driver, result.getName());
            }

            if (path != null && Files.exists(path)) {
                byte[] bytes = Files.readAllBytes(path);
                Allure.addAttachment(result.getName() + "-artifact", new ByteArrayInputStream(bytes));
                System.out.println("Artifact saved: " + path.toAbsolutePath());
            } else {
                // fallback: save a small text file with the failure message and stack trace
                try {
                    Files.createDirectories(Path.of("target", "screenshots"));
                    Path txt = Path.of("target", "screenshots", result.getName() + "_error.txt");
                    StringBuilder sb = new StringBuilder();
                    sb.append("Test: ").append(result.getName()).append("\n");
                    sb.append("Throwable: ").append(result.getThrowable()).append("\n");
                    if (result.getThrowable() != null) {
                        for (StackTraceElement el : result.getThrowable().getStackTrace()) {
                            sb.append(el.toString()).append("\n");
                        }
                    }
                    Files.writeString(txt, sb.toString());
                    Allure.addAttachment(result.getName() + "-error", new ByteArrayInputStream(sb.toString().getBytes()));
                    System.out.println("Saved failure details: " + txt.toAbsolutePath());
                } catch (Exception ignored) {
                }
            }
        } catch (Exception e) {
            // Do not spam logs; print concise message.
            System.err.println("Failed to capture screenshot for " + result.getName() + ": " + e.getMessage());
        }
    }

    @Override public void onStart(ITestContext context) {}
    @Override public void onFinish(ITestContext context) {}
    @Override public void onTestStart(ITestResult result) {}
    @Override public void onTestSuccess(ITestResult result) {}
    @Override public void onTestSkipped(ITestResult result) {}
    @Override public void onTestFailedButWithinSuccessPercentage(ITestResult result) {}
}
