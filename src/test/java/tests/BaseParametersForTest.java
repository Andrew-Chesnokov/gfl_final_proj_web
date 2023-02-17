package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;
import steps.AllItemsSteps;
import steps.LoginSteps;
import utils.Browser;
import utils.DriverFactory;
import utils.PropertyReader;

import java.time.Duration;

public class BaseParametersForTest {
    private static WebDriver driver;
    protected WebDriverWait wait;

    LoginSteps steps;
    AllItemsSteps allItemsSteps;

    public static WebDriver getDriver() {
        return driver;
    }

//    @BeforeClass(groups = {"ShoppingCartCounter"})
//    public void beforeGroups() {
//        driver = DriverFactory.getDriver(Browser.CHROME);
//        driver.navigate().to(PropertyReader.getInstance().getURL());
//        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
//        LoginSteps loginSteps = new LoginSteps();
//        loginSteps.loginIntoTheStore("standard_user", "secret_sauce");
//
//        allItemsSteps = new AllItemsSteps();
//    }
    @BeforeGroups(groups = {"ShoppingCartCounter"})
    public void beforeShoppingCartTest(){
        driver = DriverFactory.getDriver(Browser.CHROME);
        driver.navigate().to(PropertyReader.getInstance().getURL());
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        LoginSteps loginSteps = new LoginSteps();
        loginSteps.loginIntoTheStore("standard_user", "secret_sauce");

        allItemsSteps = new AllItemsSteps();
    }

    @BeforeMethod(onlyForGroups = {"LoginPageTest", "AllItemsPageTest"})
    public void beforeMethodDriverLaunch() {
        driver = DriverFactory.getDriver(Browser.CHROME);
        driver.navigate().to(PropertyReader.getInstance().getURL());
    }

    @BeforeMethod(onlyForGroups = {"AllItemsPageTest"})
    public void beforeMethodForAllItems() {
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        LoginSteps loginSteps = new LoginSteps();
        loginSteps.loginIntoTheStore("standard_user", "secret_sauce");

        allItemsSteps = new AllItemsSteps();
    }

    @BeforeMethod(onlyForGroups = {"LoginPageTest"})
    public void beforeMethodForLoginPage() {
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        steps = new LoginSteps();
    }

    @AfterMethod(onlyForGroups = {"AllItemsPageTest", "LoginPageTest"})
    public void afterMethod() {
        driver.quit();
    }

    @AfterGroups(groups = {"ShoppingCartCounter"})
    public void afterShoppingCartTest() {
        driver.quit();
    }

    @DataProvider(name = "testValidLoginData")
    public Object[][] testValidLoginData() {
        return new Object[][]{
                {"standard_user", "secret_sauce"},
                {"problem_user", "secret_sauce"},
                {"performance_glitch_user", "secret_sauce"}
        };
    }

    @DataProvider(name = "testInvalidLoginData")
    public Object[][] testInvalidLoginData() {
        return new Object[][]{
                {"locked_out_user", "secret_sauce"},
                {"123$%@#", "123"}
        };
    }
}
