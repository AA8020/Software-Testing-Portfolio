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
                if (obj instanceof BaseTest) {
                    var driver = ((BaseTest) obj).getDriver();
                    Path path = ScreenshotUtil.takeScreenshot(driver, result.getName());
                    if (path != null && Files.exists(path)) {
                        byte[] bytes = Files.readAllBytes(path);
                        Allure.addAttachment(result.getName() + "-screenshot", new ByteArrayInputStream(bytes));
                        System.out.println("Screenshot saved: " + path.toAbsolutePath());
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
