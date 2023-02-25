package tests;

import org.testng.annotations.Test;
import steps.ProductPageStepsResult;

public class ProductPageTest extends BaseParametersForTest {

    @Test(groups = {"ProductPage"},priority = 3)
    public void testOfBackToProductsButton() {
        ProductPageStepsResult productPageStepsResult = productPageSteps.backToProductButton();
        productPageStepsResult.verifyThatBackToProductsButtonRedirectsToAllItemsPage();
    }

    @Test(groups = "ProductPage",priority = 2)
    public void testOfRemoveButton() {
        ProductPageStepsResult productPageStepsResult = productPageSteps.removeItemFromTheCart();
        productPageStepsResult.verifyThatAddToCartButtonIsDisplayed();
    }

    @Test(groups = "ProductPage",priority = 1)
    public void testOfAddToCartButton() {
        productPageSteps.redirectToRandomProductPage();
        ProductPageStepsResult productPageStepsResult = productPageSteps.addItemToCart();
        productPageStepsResult.verifyThatShoppingCartBadgeIsDisplayed();
    }
}
