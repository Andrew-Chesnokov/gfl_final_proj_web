package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.assertj.core.api.Assertions.assertThat;
import static org.testng.Assert.assertTrue;

public class ShoppingCartPageResult extends BasePage {
    @FindBy(xpath = "//*[@id=\"item_4_title_link\"]/div")
    WebElement itemNameForBackpack;
    @FindBy(xpath = "//*[@id=\"header_container\"]")
    WebElement allItemsPageHeader;
    @FindBy(id = "add-to-cart-sauce-labs-backpack")
    WebElement addToCartBackpackButton;
    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();

    public ShoppingCartPageResult() {
        super();
    }

    public void assertThatItemNamesAreMatched() {
        assertThat(itemNameForBackpack.getText().equalsIgnoreCase(shoppingCartPage.nameOfTheProduct())).isTrue();
    }

    public void assertThatContinueShoppingButtonRedirectsToAllItemsPage() {
        assertTrue(allItemsPageHeader.isDisplayed());
    }

    public void assertThatBackpackIsRemoved() {
        assertTrue(addToCartBackpackButton.isEnabled());
    }
}