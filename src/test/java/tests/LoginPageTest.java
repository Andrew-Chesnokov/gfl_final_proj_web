package tests;

import steps.LoginStepsResult;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseParametersForTest {

    @Test(dataProvider = "testValidLoginData",groups = {"LoginPageTest"})
    public void testLoggingWithValidData(String username, String password) {
        LoginStepsResult stepLogging = steps.loginIntoTheStore(username, password);
        stepLogging.verifyThatMainPageIsOpened();
    }

    @Test(dataProvider = "testInvalidLoginData",groups = {"LoginPageTest"})
    public void testLoggingWithInvalidData(String username, String password) {
        LoginStepsResult stepLogging = steps.loginIntoTheStore(username, password);
        stepLogging.verifyThatValidationMessageIsReceived();
    }
}
