package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;
import pages.ProductPage;
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
    CheckoutProcedureSteps checkoutProcedureSteps;
    ProductPageSteps productPageSteps;

    public static WebDriver getDriver() {
        return driver;
    }

    // Added for Chrome 111. version
    @BeforeTest
    public void beforeAllTests(){
        System.setProperty("webdriver.http.factory", "jdk-http-client");
    }

    @BeforeGroups(groups = {"ShoppingCartCounter", "SortingOnAllItemsPage", "ShoppingCartPageProductIsAdded", "ProductPage"})
    public void beforeShoppingCartTest() {
        driver = DriverFactory.getDriver(Browser.CHROME);
        driver.navigate().to(PropertyReader.getInstance().getURL());
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        LoginSteps loginSteps = new LoginSteps();
        loginSteps.loginIntoTheStore(PropertyReader.getInstance().getStandardUser(), PropertyReader.getInstance().getPassword());

        productPageSteps = new ProductPageSteps();
        shoppingCartPageSteps = new ShoppingCartPageSteps();
        allItemsSteps = new AllItemsSteps();
        sortingOnAllItemsPageSteps = new SortingOnAllItemsPageSteps();
    }

    @BeforeMethod(onlyForGroups = {"LoginPageTest", "AllItemsPageTest", "BurgerMenu", "CheckoutProcedure"})
    public void beforeMethodDriverLaunch() {
        driver = DriverFactory.getDriver(Browser.CHROME);
        driver.navigate().to(PropertyReader.getInstance().getURL());
    }

    @BeforeMethod(onlyForGroups = {"AllItemsPageTest", "BurgerMenu", "CheckoutProcedure"})
    public void beforeMethodForAllItemsStandardUser() {
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        LoginSteps loginSteps = new LoginSteps();
        loginSteps.loginIntoTheStore(PropertyReader.getInstance().getStandardUser(), PropertyReader.getInstance().getPassword());

        checkoutProcedureSteps = new CheckoutProcedureSteps();
        burgerMenuSteps = new BurgerMenuSteps();
        allItemsSteps = new AllItemsSteps();
    }

    @BeforeMethod(onlyForGroups = {"LoginPageTest"})
    public void beforeMethodForLoginPage() {
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        steps = new LoginSteps();
    }

    @AfterMethod(onlyForGroups = {"AllItemsPageTest", "LoginPageTest", "BurgerMenu", "CheckoutProcedure"})
    public void afterMethod() {
        driver.quit();
    }

    @AfterGroups(groups = {"ShoppingCartCounter", "SortingOnAllItemsPage", "ShoppingCartPageProductIsAdded", "ProductPage"})
    public void afterShoppingCartTest() {
        driver.quit();
    }

    @DataProvider(name = "testValidLoginData")
    public Object[][] testValidLoginData() {
        return new Object[][]{
                {PropertyReader.getInstance().getStandardUser(), PropertyReader.getInstance().getPassword()},
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
