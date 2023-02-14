package loginPage.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import loginPage.steps.LoginSteps;
import utils.Browser;
import utils.DriverFactory;

import java.time.Duration;

public class BaseLoginChromeTest {
    private static WebDriver driver;
    protected WebDriverWait wait;

    LoginSteps steps;

    public static WebDriver getDriver() {
        return driver;
    }

    @BeforeMethod
    public void beforeMethod() {
        driver = DriverFactory.getDriver(Browser.CHROME);
        driver.navigate().to("https://www.saucedemo.com/");
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        steps = new LoginSteps();
    }

    @AfterMethod
    public void afterMethod() {
        driver.quit();
    }
}
