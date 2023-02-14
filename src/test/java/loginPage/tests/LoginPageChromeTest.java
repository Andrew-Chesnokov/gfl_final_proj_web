package loginPage.tests;

import loginPage.steps.LoginStepsResult;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginPageChromeTest extends BaseLoginChromeTest {
    @DataProvider(name = "testValidLoginData")
    public Object[][] testValidLoginData() {
        return new Object[][]{
                {"standard_user", "secret_sauce"},
                {"problem_user", "secret_sauce"},
                {"performance_glitch_user", "secret_sauce"}
        };
    }

    @DataProvider(name = "testInvalidLoginData")
    public Object[][] testInvalidLoginData() {
        return new Object[][]{
                {"locked_out_user", "secret_sauce"},
                {"123$%@#", "123"}
        };
    }

    @Test(dataProvider = "testValidLoginData")
    public void testLoggingWithValidData(String username, String password) {
        LoginStepsResult stepLogging = steps.loginIntoTheStore(username, password);
        stepLogging.verifyThatMainPageIsOpened();
    }

    @Test(dataProvider = "testInvalidLoginData")
    public void testLoggingWithInvalidData(String username, String password) {
        LoginStepsResult stepLogging = steps.loginIntoTheStore(username, password);
        stepLogging.verifyThatValidationMessageIsReceived();
    }
}
