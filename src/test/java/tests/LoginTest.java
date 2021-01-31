package tests;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import utils.PropertyReader;

public class LoginTest extends BaseTest{
    @DataProvider(name = "login test")
    public Object[][] inputForITechTask() {
        return new Object[][]{
                {System.getenv().getOrDefault("username", PropertyReader.getProperty("username")),
                        System.getenv().getOrDefault("password", PropertyReader.getProperty("password"))}
        };
    }

    @Test(dataProvider = "login test", retryAnalyzer = Retry.class)
    public void loginTest(String username, String password, String massage){
        loginPage.openPage()
                .login(username, password)
                .waitForPageOpened();
        Assert.assertEquals(loginPage.getURL(), PRODUCTS_URL, massage);
    }
}