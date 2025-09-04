package com.amr.automation.utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.time.Duration;

public final class DriverFactory {

    private DriverFactory() {}

    public static WebDriver createDriver(String browser, boolean headless) {
        browser = (browser == null) ? "chrome" : browser.toLowerCase();
        switch (browser) {
            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                FirefoxOptions ff = new FirefoxOptions();
                if (headless) ff.addArguments("-headless");
                return new FirefoxDriver(ff);
            case "chrome":
            default:
                WebDriverManager.chromedriver().setup();
                ChromeOptions co = new ChromeOptions();
                if (headless) co.addArguments("--headless=new");
                // Common CI-friendly flags and window size for headless runs
                co.addArguments("--window-size=1920,1080");
                co.addArguments("--disable-gpu");
                co.addArguments("--no-sandbox");
                co.addArguments("--disable-dev-shm-usage");
                return new ChromeDriver(co);
        }
    }
}
