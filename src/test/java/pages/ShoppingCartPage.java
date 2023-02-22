package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ShoppingCartPage extends BasePage{
    @FindBy(xpath = "//*[@id=\"shopping_cart_container\"]")
    WebElement shoppingCartIcon;
    @FindBy(id = "add-to-cart-sauce-labs-backpack")
    WebElement addToCartButtonForSauceLabsBackpack;
    @FindBy(xpath = "//*[@id=\"item_4_title_link\"]/div")
    WebElement itemNameBackpack;
    @FindBy(xpath = "//*[@id=\"header_container\"]")
    WebElement shoppingCartHeader;
    @FindBy(xpath = "//*[@id=\"continue-shopping\"]")
    WebElement continueShoppingButton;
    @FindBy(id = "remove-sauce-labs-backpack")
    WebElement removeBackpackButton;
    public ShoppingCartPage() {
        super();
    }

    public void removeBackpackFromTheList(){
        removeBackpackButton.click();
    }

    public void redirectToAllItemsPage(){
        continueShoppingButton.click();
        new WebDriverWait(driver, Duration.ofSeconds(3));
    }

    public void redirectToShoppingCartPage(){
        shoppingCartIcon.click();
        new WebDriverWait(driver, Duration.ofSeconds(5))
                .until(ExpectedConditions.visibilityOf(shoppingCartHeader));
    }

    public void addToCart(){
        addToCartButtonForSauceLabsBackpack.click();
    }

    public String nameOfTheProduct(){
        return itemNameBackpack.getText();
    }
}
