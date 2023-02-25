package steps;

import pages.ProductPageResult;

public class ProductPageStepsResult {
    private ProductPageResult productPageResult = new ProductPageResult();

    public void verifyThatBackToProductsButtonRedirectsToAllItemsPage(){
        productPageResult.assertThatBackToProductsButtonRedirectsToAllItemsPage();
    }

    public void verifyThatShoppingCartBadgeIsDisplayed(){
        productPageResult.assertThatShoppingCartBadgeIsDisplayed();
    }

    public void verifyThatAddToCartButtonIsDisplayed(){
        productPageResult.assertThatAddToCartButtonIsDisplayed();
    }
}
