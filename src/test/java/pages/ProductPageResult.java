package pages;

import lombok.SneakyThrows;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.assertj.core.api.Assertions.assertThat;
import static org.testng.Assert.assertEquals;

public class ProductPageResult extends BasePage {
    @FindBy(xpath = "//*[@class='inventory_details_desc large_size']")
    WebElement descriptionOfTheProduct;
    @FindBy(xpath = "//*[@class='header_secondary_container']")
    WebElement allItemsPageHeader;
    @FindBy(xpath = "//*[@class='btn btn_primary btn_small btn_inventory']")
    WebElement addToCartButtonOnTheProductPage;
    @FindBy(xpath = "//*[@class='shopping_cart_badge']")
    WebElement shoppingCartBadge;
    ProductPage productPage = new ProductPage();

    public ProductPageResult() {
        super();
    }

    public void assertThatBackToProductsButtonRedirectsToAllItemsPage() {
        assertThat(allItemsPageHeader.isDisplayed()).isTrue();
    }

    public void assertThatShoppingCartBadgeIsDisplayed() {
        assertThat(shoppingCartBadge.isDisplayed()).isTrue();
    }

    public void assertThatAddToCartButtonIsDisplayed(){
        assertThat(addToCartButtonOnTheProductPage.isDisplayed()).isTrue();
    }
}
