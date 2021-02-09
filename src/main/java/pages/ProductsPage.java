package pages;

import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Log4j2
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
    @FindBy(className = "shopping_cart_link")
    WebElement buttonCart;

    public ProductsPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public void isPageOpened() {
        //TODO: implement this method
    }

    public ProductsPage openPage(){
        log.info("Opening web page 'Products' " + PRODUCTS_URL);
        driver.get(PRODUCTS_URL);
        return this;
    }

    public ProductsPage addProductToCart(String productName) {
        log.info("Clicking on  button 'Add products to cart' " + productName);
        driver.findElement(By.xpath(String.format(ADD_PRODUCT_TO_CART, productName))).click();
        return this;
    }

    public ProductsPage changeSortLowHigh() {
        log.info("Clicking in sort panel on field 'Low-High'");
        productSortPanelLowHigh.click();
        return this;
    }

    public ProductsPage changeSortHighLow() {
        log.info("Clicking in sort panel on field 'High-Low'");
        productSortPanelHighLow.click();
        return this;
    }

    public ProductsPage changeSortZ_A() {
        log.info("Clicking in sort panel on field 'Z-A'");
        productSortPanelZA.click();
        return this;
    }

    public ProductsPage changeSortA_Z() {
        log.info("Clicking in sort panel on field 'A-Z'");
        productSortPanelAZ.click();
        return this;
    }

    public String checkingFirstProduct() {
        String firstProduct = driver.findElements(By.xpath(PRODUCTS_ELEMENTS)).get(0).getText();
        log.info("Getting first product " + firstProduct);
        return firstProduct;
    }

    public String checkingLastProduct() {
        String lastProduct = driver.findElements(By.xpath(PRODUCTS_ELEMENTS)).get(5).getText();
        log.info("Getting last product " + lastProduct);
        return lastProduct;
    }

    public ProductsPage clickSideBar(){
        log.info("Opening sidebar on " + PRODUCTS_URL);
        buttonSideBar.click();
        return this;
    }

    public ProductsPage clickAllItemFromSideBar(){
        log.info("Clicking on button 'All item' from sidebar");
        allItemSideBar.click();
        return this;
    }

    public ProductsPage clickAboutFromSideBar(){
        log.info("Clicking on button 'About' from sidebar");
        aboutSideBar.click();
        return this;
    }

    public ProductsPage clickLogoutFromSideBar(){
        log.info("Clicking on button 'Logout' from sidebar");
        logoutSideBar.click();
        return this;
    }

    public String getActualURL(){
        String actualUrl = driver.getCurrentUrl();
        log.info("Getting current url " + actualUrl);
        return actualUrl;
    }

    public ProductsPage clickButtonCart(){
        log.info("Clicking on button 'Cart'");
        buttonCart.click();
        return this;
    }
}