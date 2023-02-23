package steps;

import pages.CheckoutProcedureResult;

public class CheckoutProcedureStepsResult {
    private CheckoutProcedureResult checkoutProcedureResult = new CheckoutProcedureResult();

    public void verifyThatCheckOutInfoIsDisplayed(){
        checkoutProcedureResult.assertThatCheckOutInfoIsDisplayed();
    }

    public void verifyThatRedirectionToCartPageIsCompleted(){
        checkoutProcedureResult.assertThatRedirectionToCartPageIsCompleted();
    }

    public void verifyThatValidationMessageIsDisplayed(){
        checkoutProcedureResult.assertThatValidationMessageIsDisplayed();
    }

    public void verifyThatCheckoutOverviewPageIsOpened(){
        checkoutProcedureResult.assertThatCheckoutOverviewPageIsOpened();
    }

    public void verifyThatCheckoutCompletePageIsOpened(){
        checkoutProcedureResult.assertThatCheckoutCompletePageIsOpened();
    }

    public void verifyThatAllItemsPageIsOpenedAfterClickingBackHomeButton(){
        checkoutProcedureResult.assertThatAllItemsPageIsOpenedAfterClickingBackHomeButton();
    }

    public void verifyThatAllItemsPageIsOpenedAfterClickingCancelButtonOnCheckoutOverviewPage(){
        checkoutProcedureResult.assertThatAllItemsPageIsOpenedAfterClickingCancelButtonOnCheckoutOverviewPage();
    }
}
