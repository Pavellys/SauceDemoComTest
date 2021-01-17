package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductsPage extends BasePage {
    String ADD_PRODUCT_TO_CART = "//*[text() = '%s']/ancestor::*[@class='inventory_item']//button\n";
    String PRODUCTS_ELEMENTS = "//*[@class='inventory_item_name']";
    @FindBy(xpath = "//*[@value='lohi']")
    WebElement productSortPanelLowHigh;
    @FindBy(xpath = "//*[@value='hilo']")
    WebElement productSortPanelHighLow;
    @FindBy(xpath = "//*[@value='za']")
    WebElement productSortPanelZA;
    @FindBy(xpath = "//*[@value='az']")
    WebElement productSortPanelAZ;
    @FindBy(xpath = "/html/body/div[1]/div[1]/div/div[3]/div/button")
    WebElement buttonSideBar;
    @FindBy(id = "inventory_sidebar_link")
    WebElement allItemSideBar;
    @FindBy(id = "about_sidebar_link")
    WebElement aboutSideBar;
    @FindBy(id = "logout_sidebar_link")
    WebElement logoutSideBar;

    public ProductsPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public void isPageOpened() {
        //TODO: implement this method
    }

    public ProductsPage openPage(){
        driver.get(PRODUCTS_URL);
        return this;
    }

    public ProductsPage addProductToCart(String productName) {
        driver.findElement(By.xpath(String.format(ADD_PRODUCT_TO_CART, productName))).click();
        return this;
    }

    public ProductsPage changeSortLowHigh() {
        productSortPanelLowHigh.click();
        return this;
    }

    public ProductsPage changeSortHighLow() {
        productSortPanelHighLow.click();
        return this;
    }

    public ProductsPage changeSortZ_A() {
        productSortPanelZA.click();
        return this;
    }

    public ProductsPage changeSortA_Z() {
        productSortPanelAZ.click();
        return this;
    }

    public String checkingFirstProduct() {
        return driver.findElements(By.xpath(PRODUCTS_ELEMENTS)).get(0).getText();
    }

    public String checkingLastProduct() {
        return driver.findElements(By.xpath(PRODUCTS_ELEMENTS)).get(5).getText();
    }

    public ProductsPage clickSideBar(){
        buttonSideBar.click();
        return this;
    }

    public ProductsPage clickAllItemFromSideBar(){
        allItemSideBar.click();
        return this;
    }

    public ProductsPage clickAboutFromSideBar(){
        aboutSideBar.click();
        return this;
    }

    public ProductsPage clickLogoutFromSideBar(){
        logoutSideBar.click();
        return this;
    }

    public String getActualURL(){
        return driver.getCurrentUrl();
    }
}