package steps;

import pages.CheckoutProcedure;
import pages.CheckoutProcedureResult;

public class CheckoutProcedureSteps {
    private CheckoutProcedure checkoutProcedure = new CheckoutProcedure();

    public CheckoutProcedureStepsResult addProductAndRedirectToCartPage(){
        checkoutProcedure.addRandomProductToCart();
        checkoutProcedure.redirectToCartPage();
        checkoutProcedure.clickCheckoutButton();
        return new CheckoutProcedureStepsResult();
    }

    public CheckoutProcedureStepsResult cancelCheckout(){
        checkoutProcedure.clickCancelButton();
        return new CheckoutProcedureStepsResult();
    }

    public  CheckoutProcedureStepsResult continueCheckout(){
        checkoutProcedure.clickContinueButton();
        return new CheckoutProcedureStepsResult();
    }

    public CheckoutProcedureStepsResult finishCheckout(){
        checkoutProcedure.clickFinishButton();
        return new CheckoutProcedureStepsResult();
    }

    public CheckoutProcedureStepsResult backHomeButton(){
        checkoutProcedure.clickBackToProductsButton();
        return new CheckoutProcedureStepsResult();
    }

    public CheckoutProcedureStepsResult fillCheckoutInfoBoxWithoutLastName(String firstName, String postalCode) {
        checkoutProcedure.enterFirstName(firstName);
        checkoutProcedure.enterPostalCode(postalCode);
        return new CheckoutProcedureStepsResult();
    }

    public CheckoutProcedureStepsResult fillCheckoutInfoBoxWithoutPostalCode(String firstName, String lastName) {
        checkoutProcedure.enterFirstName(firstName);
        checkoutProcedure.enterLastName(lastName);
        return new CheckoutProcedureStepsResult();
    }

    public CheckoutProcedureStepsResult fillCheckoutInfoBoxWithoutFirstName(String lastName, String postalCode) {
        checkoutProcedure.enterLastName(lastName);
        checkoutProcedure.enterPostalCode(postalCode);
        return new CheckoutProcedureStepsResult();
    }

    public CheckoutProcedureStepsResult completeCheckoutProcedure(String firstName, String lastName, String postalCode){
        checkoutProcedure.enterFirstName(firstName);
        checkoutProcedure.enterLastName(lastName);
        checkoutProcedure.enterPostalCode(postalCode);
        return new CheckoutProcedureStepsResult();
    }
}
