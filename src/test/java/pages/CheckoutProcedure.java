package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class CheckoutProcedure extends BasePage {
    @FindBy(xpath = "//*[@class='btn btn_primary btn_small btn_inventory']")
    List<WebElement> listOfAddToCartButtons;
    @FindBy(xpath = "//*[@id=\"shopping_cart_container\"]")
    WebElement shoppingCartIcon;
    @FindBy(xpath = "//*[@id=\"checkout\"]")
    WebElement checkoutButton;
    @FindBy(xpath = "//*[@class=\"checkout_info\"]")
    WebElement checkoutInfo;
    @FindBy(name = "cancel")
    WebElement cancelButton;
    @FindBy(id = "continue")
    WebElement continueButton;
    @FindBy(id = "finish")
    WebElement finishButton;
    @FindBy(xpath = "//*[@class=\"complete-header\"]")
    WebElement completeHeader;
    @FindBy(id = "back-to-products")
    WebElement backToProductsButton;
    @FindBy(id = "inventory_container")
    WebElement allItemsPage;
    @FindBy(id = "first-name")
    WebElement firstNameField;
    @FindBy(id = "last-name")
    WebElement lastNameField;
    @FindBy(id = "postal-code")
    WebElement postalCodeField;

    public CheckoutProcedure() {
        super();
    }

    private int randomNumber() {
        return (int) (Math.random() * 6);
    }

    public void addRandomProductToCart() {
        listOfAddToCartButtons.get(randomNumber()).click();
    }

    public void redirectToCartPage() {
        shoppingCartIcon.click();
    }

    public void clickCheckoutButton() {
        checkoutButton.click();
        new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOf(checkoutInfo));
    }

    public void clickCancelButton() {
        cancelButton.click();
        new WebDriverWait(driver, Duration.ofSeconds(5));
    }

    public void enterFirstName(String firstName) {
        firstNameField.clear();
        firstNameField.click();
        firstNameField.sendKeys(firstName);
    }

    public void enterLastName(String lastName) {
        lastNameField.clear();
        lastNameField.click();
        lastNameField.sendKeys(lastName);
    }

    public void enterPostalCode(String postalCode) {
        postalCodeField.clear();
        postalCodeField.click();
        postalCodeField.sendKeys(postalCode);
    }

    public void clickContinueButton() {
        continueButton.click();
        new WebDriverWait(driver, Duration.ofSeconds(5));
    }

    public void clickFinishButton() {
        finishButton.click();
        new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOf(completeHeader));
    }

    public void clickBackToProductsButton() {
        backToProductsButton.click();
        new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOf(allItemsPage));
    }
}
