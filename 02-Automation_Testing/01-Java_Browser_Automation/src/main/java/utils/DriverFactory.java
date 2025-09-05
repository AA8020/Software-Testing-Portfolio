package com.amr.automation.utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.time.Duration;
import java.nio.file.Files;
import java.nio.file.Path;
import java.io.IOException;

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

                // If running in CI, force headless mode for stability unless explicitly requested.
                boolean inCI = System.getenv("GITHUB_ACTIONS") != null || System.getenv("CI") != null;
                if (inCI) {
                    headless = true;
                }

                if (headless) co.addArguments("--headless=new");
                // Common CI-friendly flags and window size for headless runs
                co.addArguments("--window-size=1920,1080");
                co.addArguments("--disable-gpu");
                co.addArguments("--no-sandbox");
                co.addArguments("--disable-dev-shm-usage");
                co.addArguments("--no-first-run");
                co.addArguments("--no-default-browser-check");
                co.addArguments("--disable-extensions");
                co.addArguments("--disable-translate");
                co.addArguments("--disable-background-networking");

                // Create unique user-data and cache dirs with UUID to avoid collisions across processes
                try {
                    String uuid = java.util.UUID.randomUUID().toString();
                    Path userData = Files.createTempDirectory("chrome-user-data-" + uuid + "-");
                    Path cacheDir = Files.createTempDirectory("chrome-cache-" + uuid + "-");
                    co.addArguments("--user-data-dir=" + userData.toAbsolutePath().toString());
                    co.addArguments("--disk-cache-dir=" + cacheDir.toAbsolutePath().toString());
                    // attempt best-effort cleanup on JVM exit
                    Runtime.getRuntime().addShutdownHook(new Thread(() -> {
                        try {
                            if (Files.exists(userData)) Files.walk(userData).map(Path::toFile).forEach(java.io.File::delete);
                            if (Files.exists(cacheDir)) Files.walk(cacheDir).map(Path::toFile).forEach(java.io.File::delete);
                        } catch (Exception ignored) {
                        }
                    }));
                } catch (IOException ignored) {
                    // if temp dirs can't be created, continue without them
                }

                return new ChromeDriver(co);
        }
    }
}
