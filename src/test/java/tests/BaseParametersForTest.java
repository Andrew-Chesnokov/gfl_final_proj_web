package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;
import steps.*;
import utils.Browser;
import utils.DriverFactory;
import utils.PropertyReader;

import java.time.Duration;

public class BaseParametersForTest {
    private static WebDriver driver;
    protected WebDriverWait wait;

    LoginSteps steps;
    AllItemsSteps allItemsSteps;
    BurgerMenuSteps burgerMenuSteps;
    SortingOnAllItemsPageSteps sortingOnAllItemsPageSteps;
    ShoppingCartPageSteps shoppingCartPageSteps;

    public static WebDriver getDriver() {
        return driver;
    }

    @BeforeGroups(groups = {"ShoppingCartCounter","SortingOnAllItemsPage","ShoppingCartPageProductIsAdded"})
    public void beforeShoppingCartTest() {
        driver = DriverFactory.getDriver(Browser.CHROME);
        driver.navigate().to(PropertyReader.getInstance().getURL());
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        LoginSteps loginSteps = new LoginSteps();
        loginSteps.loginIntoTheStore("standard_user", PropertyReader.getInstance().getPassword());

        shoppingCartPageSteps = new ShoppingCartPageSteps();
        allItemsSteps = new AllItemsSteps();
        sortingOnAllItemsPageSteps = new SortingOnAllItemsPageSteps();
    }

    @BeforeMethod(onlyForGroups = {"LoginPageTest", "AllItemsPageTest", "BurgerMenu"})
    public void beforeMethodDriverLaunch() {
        driver = DriverFactory.getDriver(Browser.CHROME);
        driver.navigate().to(PropertyReader.getInstance().getURL());
    }

    @BeforeMethod(onlyForGroups = {"AllItemsPageTest", "BurgerMenu"})
    public void beforeMethodForAllItems() {
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        LoginSteps loginSteps = new LoginSteps();
        loginSteps.loginIntoTheStore("standard_user", PropertyReader.getInstance().getPassword());

        burgerMenuSteps = new BurgerMenuSteps();
        allItemsSteps = new AllItemsSteps();
    }

    @BeforeMethod(onlyForGroups = {"LoginPageTest"})
    public void beforeMethodForLoginPage() {
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        steps = new LoginSteps();
    }

    @AfterMethod(onlyForGroups = {"AllItemsPageTest", "LoginPageTest", "BurgerMenu"})
    public void afterMethod() {
        driver.quit();
    }

    @AfterGroups(groups = {"ShoppingCartCounter","SortingOnAllItemsPage","ShoppingCartPageProductIsAdded"})
    public void afterShoppingCartTest() {
        driver.quit();
    }

    @DataProvider(name = "testValidLoginData")
    public Object[][] testValidLoginData() {
        return new Object[][]{
                {"standard_user", PropertyReader.getInstance().getPassword()},
                {"problem_user", PropertyReader.getInstance().getPassword()},
                {"performance_glitch_user", PropertyReader.getInstance().getPassword()}
        };
    }

    @DataProvider(name = "testInvalidLoginData")
    public Object[][] testInvalidLoginData() {
        return new Object[][]{
                {"locked_out_user", PropertyReader.getInstance().getPassword()},
                {"123$%@#", "123"}
        };
    }
}
