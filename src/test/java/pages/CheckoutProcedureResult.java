package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.assertj.core.api.Assertions.assertThat;
import static org.testng.Assert.assertTrue;

public class CheckoutProcedureResult extends BasePage{
    @FindBy(xpath = "//*[@class=\"cart_item\"]")
    WebElement productInCart;
    @FindBy(xpath = "//*[@class=\"checkout_info\"]")
    WebElement checkoutInfo;
    @FindBy(xpath = "//*[@class=\"error-message-container error\"]")
    WebElement validationMessage;
    @FindBy(xpath = "//*[@class=\"complete-header\"]")
    WebElement completeHeader;
    @FindBy(id = "inventory_container")
    WebElement allItemsPage;
    public CheckoutProcedureResult() {
        super();
    }

    public void assertThatCheckOutInfoIsDisplayed(){
        assertThat(checkoutInfo.isDisplayed()).isTrue();
    }

    public void assertThatRedirectionToCartPageIsCompleted(){
        assertThat(productInCart.isDisplayed()).isTrue();
    }

    public void assertThatValidationMessageIsDisplayed(){
        assertTrue(validationMessage.isDisplayed());
    }

    public void assertThatCheckoutOverviewPageIsOpened(){
        assertTrue(productInCart.isDisplayed());
    }

    public void assertThatCheckoutCompletePageIsOpened(){
        assertTrue(completeHeader.isDisplayed());
    }

    public void assertThatAllItemsPageIsOpenedAfterClickingBackHomeButton(){
        assertTrue(allItemsPage.isDisplayed());
    }

    public void assertThatAllItemsPageIsOpenedAfterClickingCancelButtonOnCheckoutOverviewPage(){
        assertTrue(allItemsPage.isDisplayed());
    }
}
