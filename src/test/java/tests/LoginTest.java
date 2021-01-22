package tests;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
public class LoginTest extends BaseTest{
    @DataProvider(name = "login test")
    public Object[][] inputForITechTask() {
        return new Object[][]{
                {"standard_user", "secret_sauce","good"}
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