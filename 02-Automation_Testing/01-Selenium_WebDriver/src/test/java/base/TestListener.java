package com.amr.automation.base;

import com.amr.automation.utils.ScreenshotUtil;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListener implements ITestListener {
    @Override
    public void onTestFailure(ITestResult result) {
        Object obj = result.getInstance();
        try {
            var driverField = obj.getClass().getField("driver");
            var driver = (org.openqa.selenium.WebDriver) driverField.get(obj);
            var path = ScreenshotUtil.takeScreenshot(driver, result.getName());
            if (path != null) {
                System.out.println("Screenshot saved: " + path.toAbsolutePath());
            }
        } catch (Exception e) {
            // fallback: nothing to do
            e.printStackTrace();
        }
    }

    @Override public void onStart(ITestContext context) {}
    @Override public void onFinish(ITestContext context) {}
    @Override public void onTestStart(ITestResult result) {}
    @Override public void onTestSuccess(ITestResult result) {}
    @Override public void onTestSkipped(ITestResult result) {}
    @Override public void onTestFailedButWithinSuccessPercentage(ITestResult result) {}
}
