package pages;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Log4j2
public class CartPage extends BasePage {
    @FindBy(xpath = "//*[@class='btn_action checkout_button']")
    WebElement buttonCheckout;
    @FindBy(xpath = "//*[@class='btn_secondary']")
    WebElement buttonContinueShopping;
    String CART_PRICE = "//*[text() = '%s']/ancestor::*[@class='cart_item']//*[@class='inventory_item_price']";
    String CART_QUANTITY = "//*[text() = '%s']/ancestor::*[@class='cart_item']//*[@class='cart_quantity']";


    public CartPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public void isPageOpened() {
        //TODO: Implement this method
    }


    public CartPage openPage() {
        driver.get(CART_URL);
        log.info("Opening cart page: " + CART_URL);
        return this;
    }

    public CartPage clickToCheckoutButton() {
        buttonCheckout.click();
        log.info("Clicking on button 'Checkout' ");
        return this;
    }

    public CartPage clickToContinueButton(){
        buttonContinueShopping.click();
        log.info("Clicking on button 'Continue'");
        return this;
    }

    public String getURL() {
        log.info("Getting current URL'");
        return driver.getCurrentUrl();
    }

    public String getPrice(String product){
        log.info("Getting product price");
        return driver.findElement(By.xpath(String.format(CART_PRICE, product))).getText();
    }

    public String getQuantity(String product){
        log.info("Getting product quantity");
        return driver.findElement(By.xpath(String.format(CART_QUANTITY, product))).getText();
    }
}