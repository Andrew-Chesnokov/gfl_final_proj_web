package loginPage.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.testng.Assert.assertTrue;

public class LoginPageResult extends BasePage {
    @FindBy(xpath = "//*[@id=\"header_container\"]/div[2]")
    WebElement secondaryHeader;

    @FindBy(xpath = "//*[@id=\"login_button_container\"]/div/form/div[3]/h3")
    WebElement validationLoginMessage;

    public LoginPageResult() {
        super();
    }

    public void assertThatMainPageIsLoaded() {
        assertTrue(secondaryHeader.isDisplayed());
    }

    public void assertThatValidationMessageIsDisplayed(){
        assertTrue(validationLoginMessage.isDisplayed());
    }
}
