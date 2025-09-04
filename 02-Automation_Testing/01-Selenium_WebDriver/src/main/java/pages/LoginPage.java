package com.amr.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage {
	private final WebDriver driver;
	private final WebDriverWait wait;
	private final By username = By.id("user-name");
	private final By password = By.id("password");
	private final By loginButton = By.id("login-button");

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	}

	public void login(String user, String pass) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(username)).clear();
		driver.findElement(username).sendKeys(user);
		wait.until(ExpectedConditions.visibilityOfElementLocated(password)).clear();
		driver.findElement(password).sendKeys(pass);
		wait.until(ExpectedConditions.elementToBeClickable(loginButton)).click();
	}
}
