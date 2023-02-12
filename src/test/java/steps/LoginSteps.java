package steps;

import pages.LoginPage;

public class LoginSteps {
    private LoginPage loginPage = new LoginPage();

    public LoginStepsResult loginIntoTheStore(String username,String password){
        loginPage.fillUserNameField(username);
        loginPage.fillPasswordField(password);
        loginPage.pressLoginButton();
        return new LoginStepsResult();
    }
}
