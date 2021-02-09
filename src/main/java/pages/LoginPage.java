package pages;

import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

@Log4j2
public class LoginPage extends BasePage {
    @FindBy(id = "user-name")
    WebElement usernameInput;
    @FindBy(id = "password")
    WebElement passwordInput;
    @FindBy(id = "login-button")
    WebElement loginButton;
    @FindBy(className = "product_label")
    WebElement productLabel;

    public  LoginPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public void isPageOpened() {
        //TODO: implement this method
    }

    public LoginPage login(String username, String password) {
        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        loginButton.click();
        log.info(String.format("Input %s and %s in the login fields, and click on the login button", username, password));
        return this;
    }

    public LoginPage openPage() {
        log.info("Opening web page: " + SAUCE_DEMO_URL);
        driver.get(SAUCE_DEMO_URL);
        return this;
    }

    public String getURL() {
        return driver.getCurrentUrl();
    }

    public LoginPage waitForPageOpened(){
        wait.until(ExpectedConditions.visibilityOf(productLabel));
        return this;
    }
}