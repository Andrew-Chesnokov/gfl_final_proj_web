package loginPage.steps;

import loginPage.pages.LoginPageResult;

public class LoginStepsResult {
    private LoginPageResult loginPageResult = new LoginPageResult();

    public void verifyThatMainPageIsOpened() {
        loginPageResult.assertThatMainPageIsLoaded();
    }

    public void verifyThatValidationMessageIsReceived() {
        loginPageResult.assertThatValidationMessageIsDisplayed();
    }
}
