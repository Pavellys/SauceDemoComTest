package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CartTests extends BaseTest{
    @Test
    public void buttonCheckout(){
        cartPage.openPage()
                .clickToCheckoutButton();
        checkoutPage.waitForPageCheckOutOpened();
        Assert.assertEquals(cartPage.getURL(), CHECKOUT_URL,"error");
    }
    @Test
    public void buttonContinueShopping(){
        cartPage.openPage()
                .clickToContinueButton();
        checkoutPage.waitForPageContinueOpened();
        Assert.assertEquals(cartPage.getURL(), PRODUCTS_URL,"error");
    }
}