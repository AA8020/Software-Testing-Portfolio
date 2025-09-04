package com.amr.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InventoryPage {
    private WebDriver driver;
    private By title = By.className("title");
    private By addBackpack = By.id("add-to-cart-sauce-labs-backpack");
    private By cartIcon = By.className("shopping_cart_link");

    public InventoryPage(WebDriver driver) { this.driver = driver; }

    public String getTitle() { return driver.findElement(title).getText(); }

    public void addBackpackToCart() { driver.findElement(addBackpack).click(); }

    public void openCart() { driver.findElement(cartIcon).click(); }
}
