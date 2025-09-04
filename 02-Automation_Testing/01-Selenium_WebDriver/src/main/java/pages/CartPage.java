package com.amr.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CartPage {
	private final WebDriver driver;
	private final WebDriverWait wait;
	private final By itemName = By.className("inventory_item_name");

	public CartPage(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	}

	public String getFirstItemName() {
		return wait.until(ExpectedConditions.visibilityOfElementLocated(itemName)).getText();
	}
}
