package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ProductPage extends BasePage {
    @FindBy(xpath = "//*[@class='inventory_item_name']")
    List<WebElement> listOfItemNames;
    @FindBy(xpath = "//*[@class='inventory_item_desc']")
    List<WebElement> listOfDescriptionsOfTheProduct;
    @FindBy(id = "back-to-products")
    WebElement backToProductsButton;
    @FindBy(xpath = "//*[@class='btn btn_primary btn_small btn_inventory']")
    WebElement addToCartButtonOnTheProductPage;
    @FindBy(xpath = "//*[@class='btn btn_secondary btn_small btn_inventory']")
    WebElement removeButtonOnTheProductPage;

    public ProductPage() {
        super();
    }

    private int randomNumber() {
        return (int) (Math.random() * 6);
    }

    private int number = randomNumber();

    public void redirectToRandomProductPage() {
        listOfItemNames.get(number).click();
    }

    public void clickBackToProductsButton(){
        backToProductsButton.click();
    }

    public void clickAddToCartButtonOnProductPage(){
        addToCartButtonOnTheProductPage.click();
    }

    public void clickRemoveButtonOnTheProductPage(){
        removeButtonOnTheProductPage.click();
    }
}
