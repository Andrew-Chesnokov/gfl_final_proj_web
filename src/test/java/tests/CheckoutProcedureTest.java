package tests;

import org.testng.annotations.Test;
import steps.CheckoutProcedureStepsResult;

public class CheckoutProcedureTest extends BaseParametersForTest {

    @Test(groups = "CheckoutProcedure")
    public void testOfCheckoutButton() {
        CheckoutProcedureStepsResult step = checkoutProcedureSteps.addProductAndRedirectToCartPage();
        step.verifyThatCheckOutInfoIsDisplayed();
    }

    @Test(groups = "CheckoutProcedure")
    public void testOfContinueButton(){
        checkoutProcedureSteps.addProductAndRedirectToCartPage();
        checkoutProcedureSteps.completeCheckoutProcedure("standard","user","02140");
        CheckoutProcedureStepsResult step = checkoutProcedureSteps.continueCheckout();
        step.verifyThatCheckoutOverviewPageIsOpened();
    }

    @Test(groups = "CheckoutProcedure")
    public void testOfCancelButtonAtCheckoutOverviewPage(){
        checkoutProcedureSteps.addProductAndRedirectToCartPage();
        checkoutProcedureSteps.completeCheckoutProcedure("standard","user","02140");
        checkoutProcedureSteps.continueCheckout();
        CheckoutProcedureStepsResult step = checkoutProcedureSteps.cancelCheckout();
        step.verifyThatAllItemsPageIsOpenedAfterClickingCancelButtonOnCheckoutOverviewPage();
    }

    @Test(groups = "CheckoutProcedure")
    public void testOfFinishButton(){
        checkoutProcedureSteps.addProductAndRedirectToCartPage();
        checkoutProcedureSteps.completeCheckoutProcedure("standard","user","02140");
        checkoutProcedureSteps.continueCheckout();
        CheckoutProcedureStepsResult step = checkoutProcedureSteps.finishCheckout();
        step.verifyThatCheckoutCompletePageIsOpened();
    }

    @Test(groups = "CheckoutProcedure")
    public void testOfBackToHomeButton(){
        checkoutProcedureSteps.addProductAndRedirectToCartPage();
        checkoutProcedureSteps.completeCheckoutProcedure("standard","user","02140");
        checkoutProcedureSteps.continueCheckout();
        checkoutProcedureSteps.finishCheckout();
        CheckoutProcedureStepsResult step = checkoutProcedureSteps.backHomeButton();
        step.verifyThatAllItemsPageIsOpenedAfterClickingBackHomeButton();
    }

    @Test(groups = "CheckoutProcedure")
    public void testOfCancelButtonAtCheckoutYourInformationPage() {
        checkoutProcedureSteps.addProductAndRedirectToCartPage();
        CheckoutProcedureStepsResult step = checkoutProcedureSteps.cancelCheckout();
        step.verifyThatRedirectionToCartPageIsCompleted();
    }

    @Test(groups = "CheckoutProcedure")
    public void testOfCheckoutInfoValidationMessageReceivedWithoutLastName() {
        checkoutProcedureSteps.addProductAndRedirectToCartPage();
        checkoutProcedureSteps.fillCheckoutInfoBoxWithoutLastName("standard", "02140");
        CheckoutProcedureStepsResult step = checkoutProcedureSteps.continueCheckout();
        step.verifyThatValidationMessageIsDisplayed();
    }

    @Test(groups = "CheckoutProcedure")
    public void testOfCheckoutInfoValidationMessageReceivedWithoutFirstName(){
        checkoutProcedureSteps.addProductAndRedirectToCartPage();
        checkoutProcedureSteps.fillCheckoutInfoBoxWithoutFirstName("user", "02140");
        CheckoutProcedureStepsResult step = checkoutProcedureSteps.continueCheckout();
        step.verifyThatValidationMessageIsDisplayed();
    }

    @Test(groups = "CheckoutProcedure")
    public void testOfCheckoutInfoValidationMessageReceivedWithoutPostalCode(){
        checkoutProcedureSteps.addProductAndRedirectToCartPage();
        checkoutProcedureSteps.fillCheckoutInfoBoxWithoutPostalCode("standard", "user");
        CheckoutProcedureStepsResult step = checkoutProcedureSteps.continueCheckout();
        step.verifyThatValidationMessageIsDisplayed();
    }
}
