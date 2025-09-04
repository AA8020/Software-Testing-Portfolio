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
        try {
            File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            String ts = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
            Path dst = Path.of("target", "screenshots", name + "_" + ts + ".png");
            Files.createDirectories(dst.getParent());
            Files.copy(src.toPath(), dst);
            return dst;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
