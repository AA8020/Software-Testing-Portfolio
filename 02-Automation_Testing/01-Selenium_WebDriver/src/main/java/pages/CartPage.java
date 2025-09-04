package com.amr.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {
    private WebDriver driver;
    private By itemName = By.className("inventory_item_name");

    public CartPage(WebDriver driver) { this.driver = driver; }

    public String getFirstItemName() { return driver.findElement(itemName).getText(); }
}
