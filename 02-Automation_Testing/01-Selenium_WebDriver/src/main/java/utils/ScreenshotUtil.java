package com.amr.automation.utils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ScreenshotUtil {
    public static Path takeScreenshot(WebDriver driver, String name) {
        if (driver == null) return null;
        String ts = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
        try {
            if (driver instanceof TakesScreenshot) {
                File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
                Path dst = Path.of("target", "screenshots", name + "_" + ts + ".png");
                Files.createDirectories(dst.getParent());
                Files.copy(src.toPath(), dst);
                return dst;
            } else {
                // fallback: save page source as HTML
                String page = driver.getPageSource();
                Path dst = Path.of("target", "screenshots", name + "_" + ts + ".html");
                Files.createDirectories(dst.getParent());
                Files.writeString(dst, page);
                return dst;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
