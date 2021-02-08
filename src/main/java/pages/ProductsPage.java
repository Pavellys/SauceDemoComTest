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
        driver.get(PRODUCTS_URL);
        log.info("Opening web page 'Products' " + PRODUCTS_URL);
        return this;
    }

    public ProductsPage addProductToCart(String productName) {
        driver.findElement(By.xpath(String.format(ADD_PRODUCT_TO_CART, productName))).click();
        log.info("Clicking on  button 'Add products to cart'");
        return this;
    }

    public ProductsPage changeSortLowHigh() {
        productSortPanelLowHigh.click();
        log.info("Clicking in sort panel on field 'Low-High'");
        return this;
    }

    public ProductsPage changeSortHighLow() {
        productSortPanelHighLow.click();
        log.info("Clicking in sort panel on field 'High-Low'");
        return this;
    }

    public ProductsPage changeSortZ_A() {
        productSortPanelZA.click();
        log.info("Clicking in sort panel on field 'Z-A'");
        return this;
    }

    public ProductsPage changeSortA_Z() {
        productSortPanelAZ.click();
        log.info("Clicking in sort panel on field 'A-Z'");
        return this;
    }

    public String checkingFirstProduct() {
        log.info("Getting first product");
        return driver.findElements(By.xpath(PRODUCTS_ELEMENTS)).get(0).getText();
    }

    public String checkingLastProduct() {
        log.info("Getting last product");
        return driver.findElements(By.xpath(PRODUCTS_ELEMENTS)).get(5).getText();
    }

    public ProductsPage clickSideBar(){
        buttonSideBar.click();
        log.info("Opening sidebar on " + PRODUCTS_URL);
        return this;
    }

    public ProductsPage clickAllItemFromSideBar(){
        allItemSideBar.click();
        log.info("Clicking on button 'All item' from sidebar");
        return this;
    }

    public ProductsPage clickAboutFromSideBar(){
        aboutSideBar.click();
        log.info("Clicking on button 'About' from sidebar");
        return this;
    }

    public ProductsPage clickLogoutFromSideBar(){
        logoutSideBar.click();
        log.info("Clicking on button 'Logout' from sidebar");
        return this;
    }

    public String getActualURL(){
        log.info("Getting current url");
        return driver.getCurrentUrl();
    }

    public ProductsPage clickButtonCart(){
        buttonCart.click();
        return this;
    }
}