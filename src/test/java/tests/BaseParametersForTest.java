package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import steps.AllItemsSteps;
import steps.LoginSteps;
import utils.Browser;
import utils.DriverFactory;

import java.time.Duration;

public class BaseParametersForTest {
    private static WebDriver driver;
    protected WebDriverWait wait;

    LoginSteps steps;
    AllItemsSteps allItemsSteps;

    public static WebDriver getDriver() {
        return driver;
    }

    @BeforeMethod
    public void beforeAllMethods() {
        driver = DriverFactory.getDriver(Browser.CHROME);
        driver.navigate().to("https://www.saucedemo.com/");
    }

    @BeforeMethod(onlyForGroups = {"AllItemsPageTest"})
    public void beforeMethodForAllItems() {
//        driver = DriverFactory.getDriver(Browser.CHROME);
//        driver.navigate().to("https://www.saucedemo.com/");
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        LoginSteps loginSteps = new LoginSteps();
        loginSteps.loginIntoTheStore("standard_user", "secret_sauce");

        allItemsSteps = new AllItemsSteps();
    }

    @BeforeMethod(onlyForGroups = {"LoginPageTest"})
    public void beforeMethodForLoginPage() {
//        driver = DriverFactory.getDriver(Browser.CHROME);
//        driver.navigate().to("https://www.saucedemo.com/");
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        steps = new LoginSteps();
    }

    @AfterMethod
    public void afterMethod() {
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
