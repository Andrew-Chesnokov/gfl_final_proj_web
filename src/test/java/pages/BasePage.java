package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import tests.BaseParametersForTest;

public abstract class BasePage {
    protected WebDriver driver;


    public BasePage() {
        driver = BaseParametersForTest.getDriver();
        PageFactory.initElements(driver, this);
    }
}
