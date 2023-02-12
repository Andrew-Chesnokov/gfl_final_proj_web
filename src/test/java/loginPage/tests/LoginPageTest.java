package loginPage.tests;

import loginPage.steps.LoginStepsResult;
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
        step.verifyThatValidationMessageIsReceived();
    }
}
