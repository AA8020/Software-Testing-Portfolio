package com.amr.automation.tests;

import com.amr.automation.base.BaseTest;
import com.amr.automation.pages.LoginPage;
import com.amr.automation.pages.InventoryPage;
import com.amr.automation.pages.CartPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SauceDemoTest extends BaseTest {

    @Test
    public void addToCartFlow() {
        LoginPage login = new LoginPage(driver);
        login.login("standard_user", "secret_sauce");

        InventoryPage inv = new InventoryPage(driver);
        Assert.assertEquals(inv.getTitle(), "Products");

        inv.addBackpackToCart();
        inv.openCart();

        CartPage cart = new CartPage(driver);
        Assert.assertEquals(cart.getFirstItemName(), "Sauce Labs Backpack");
    }
}
