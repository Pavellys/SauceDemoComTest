package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CheckoutPage extends BasePage{
    @FindBy(className = "product_label")
    WebElement continueWait;
    @FindBy(className = "subheader")
    WebElement checkOutWait;

    public CheckoutPage(WebDriver driver) {
        super(driver);
    }

    @Override
    void isPageOpened() {

    }
    public CheckoutPage waitForPageCheckOutOpened() {
        wait.until(ExpectedConditions.visibilityOf(checkOutWait)).isDisplayed();
        return this;
    }

    public CheckoutPage waitForPageContinueOpened() {
        wait.until(ExpectedConditions.visibilityOf(continueWait)).isDisplayed();
        return this;
    }
}
