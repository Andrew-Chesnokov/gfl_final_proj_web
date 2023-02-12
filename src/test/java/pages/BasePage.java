package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import tests.BaseLoginChromeTest;

public abstract class  BasePage {
    protected WebDriver driver;

    public BasePage () {
    driver = BaseLoginChromeTest.getDriver();
        PageFactory.initElements(driver,this);
    }
}
