package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
    @FindBy(xpath = "//*[@id=\"user-name\"]")
    WebElement userNameField;
    @FindBy(xpath = "//*[@id=\"password\"]")
    WebElement passwordField;
    @FindBy(xpath = "//*[@id=\"login-button\"]")
    WebElement loginButton;

    public LoginPage() {
        super();
    }

    public void fillUserNameField(String username){
        userNameField.clear();
        userNameField.sendKeys(username);
    }

    public void fillPasswordField(String password){
        passwordField.clear();
        passwordField.sendKeys(password);
    }

    public void pressLoginButton(){
        loginButton.click();
    }
}
