package loginPage.tests;

import loginPage.steps.LoginStepsResult;
<<<<<<< HEAD
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseLoginChromeTest {
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
        LoginStepsResult step = steps.loginIntoTheStore(username, password);
        step.verifyThatMainPageIsOpened();
    }

    @Test(dataProvider = "testInvalidLoginData")
    public void testLoggingWithInvalidData(String username, String password) {
        LoginStepsResult step = steps.loginIntoTheStore(username, password);
=======
import org.testng.annotations.Test;

public class LoginPageTest extends BaseLoginChromeTest {

    @Test
    public void testLoggingOfStandardUser() {
        LoginStepsResult step = steps.loginIntoTheStore("standard_user", "secret_sauce");
        step.verifyThatMainPageIsOpened();
    }

    @Test
    public  void testLoggingOfLockedOutUser(){
        LoginStepsResult step = steps.loginIntoTheStore("locked_out_user", "secret_sauce");
        step.verifyThatValidationMessageIsReceived();
    }

    @Test
    public void testLoggingOfProblemUser(){
        LoginStepsResult step = steps.loginIntoTheStore("problem_user","secret_sauce");
        step.verifyThatMainPageIsOpened();
    }

    @Test
    public void testLoggingOfPerformanceGlitchUser(){
        LoginStepsResult step = steps.loginIntoTheStore("performance_glitch_user","secret_sauce");
        step.verifyThatMainPageIsOpened();
    }

    @Test
    public void testLoggingOfInvalidUser(){
        LoginStepsResult step = steps.loginIntoTheStore("123","123");
>>>>>>> github/master
        step.verifyThatValidationMessageIsReceived();
    }
}
