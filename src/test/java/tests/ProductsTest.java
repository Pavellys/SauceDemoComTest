package tests;

import test_data.ExpResConst;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ProductsTest extends BaseTest {
    @Test
    public void addProductToCartTest() {
        productsPage.openPage()
                .addProductToCart(TEST_PRODUCT);
        cartPage.openPage();
        Assert.assertEquals(cartPage.getQuantity(TEST_PRODUCT), ExpResConst.QUANTITY_IN_CART, "Quantity not right");
        Assert.assertEquals(cartPage.getPrice(TEST_PRODUCT), ExpResConst.PRICE_IN_CART, "Price not right");
    }

    @Test
    public void checkingSortPanelLowHigh() {
        productsPage.openPage()
                .changeSortLowHigh();
        Assert.assertEquals(productsPage.checkingFirstProduct(), ExpResConst.FIRST_PRODUCT_HL, "error");
        Assert.assertEquals(productsPage.checkingLastProduct(), ExpResConst.LAST_PRODUCT_HL, "error");
    }

    @Test
    public void checkingSortPanelHighLow() {
        productsPage.openPage()
                .changeSortHighLow();
        Assert.assertEquals(productsPage.checkingLastProduct(), ExpResConst.FIRST_PRODUCT_HL, "error");
        Assert.assertEquals(productsPage.checkingFirstProduct(), ExpResConst.LAST_PRODUCT_HL, "error");
    }

    @Test
    public void checkingSortPanelZ_A() {
        productsPage.openPage()
                .changeSortZ_A();
        Assert.assertEquals(productsPage.checkingFirstProduct(), ExpResConst.LAST_PRODUCT_AZ, "error");
        Assert.assertEquals(productsPage.checkingLastProduct(), ExpResConst.FIRST_PRODUCT_AZ, "error");
    }

    @Test
    public void checkingSortPanelA_Z() {
        productsPage.openPage()
                .changeSortA_Z();
        Assert.assertEquals(productsPage.checkingFirstProduct(), ExpResConst.FIRST_PRODUCT_AZ, "error");
        Assert.assertEquals(productsPage.checkingLastProduct(), ExpResConst.LAST_PRODUCT_AZ, "error");
    }

    @Test
    public void sideBarCheckingAllItems() {
        productsPage.openPage()
                .clickSideBar()
                .clickAllItemFromSideBar();
        Assert.assertEquals(productsPage.getActualURL(), PRODUCTS_URL);
    }

    @Test
    public void sideBarCheckingAbout() {
        productsPage.openPage()
                .clickSideBar()
                .clickAboutFromSideBar();
        Assert.assertEquals(productsPage.getActualURL(), ABOUT_LINK_URL);
    }

    @Test
    public void sideBarCheckingLogout() {
        productsPage.openPage()
                .clickSideBar()
                .clickLogoutFromSideBar();
        Assert.assertEquals(productsPage.getActualURL(), LOGOUT_LINK_URL);
    }
}