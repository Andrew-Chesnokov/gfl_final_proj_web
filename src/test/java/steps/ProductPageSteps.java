package steps;

import pages.ProductPage;

public class ProductPageSteps {

    private ProductPage productPage = new ProductPage();

    public ProductPageStepsResult redirectToRandomProductPage() {
        productPage.redirectToRandomProductPage();
        return new ProductPageStepsResult();
    }

    public ProductPageStepsResult backToProductButton() {
        productPage.clickBackToProductsButton();
        return new ProductPageStepsResult();
    }

    public ProductPageStepsResult addItemToCart() {
        productPage.clickAddToCartButtonOnProductPage();
        return new ProductPageStepsResult();
    }

    public ProductPageStepsResult removeItemFromTheCart(){
        productPage.clickRemoveButtonOnTheProductPage();
        return new ProductPageStepsResult();
    }
}
