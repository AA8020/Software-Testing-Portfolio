package com.amr.automation.base;

import com.amr.automation.utils.ConfigReader;
import com.amr.automation.utils.DriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public abstract class BaseTest {
    protected WebDriver driver;
    private boolean headless = false;

    @BeforeMethod(alwaysRun = true)
    public void setUp() {
        String browser = ConfigReader.get("browser", "chrome");
        headless = Boolean.parseBoolean(ConfigReader.get("headless", "false"));
        driver = DriverFactory.createDriver(browser, headless);
        // Only maximize when not running headless; headless runs set window-size in options.
        if (!headless) {
            driver.manage().window().maximize();
        }
    // Small implicit wait to handle very short timing differences (prefer explicit waits in pages).
    driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(5));
        driver.get(ConfigReader.get("base.url", "https://www.saucedemo.com/"));
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

    // Public getter used by TestListeners and utilities to retrieve the driver instance.
    public WebDriver getDriver() {
        return driver;
    }
}
