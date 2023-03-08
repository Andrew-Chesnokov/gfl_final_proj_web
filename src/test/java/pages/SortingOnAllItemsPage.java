package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SortingOnAllItemsPage extends BasePage {
    @FindBy(xpath = "//*[@class='inventory_item_name']")
    WebElement inventoryItemNames;
    @FindBy(xpath = "//*[@class='product_sort_container']/option[1]")
    WebElement aToz;
    @FindBy(xpath = "//*[@class='product_sort_container']/option[2]")
    WebElement zToA;
    @FindBy(xpath = "//*[@class='product_sort_container']/option[3]")
    WebElement lowToHigh;
    @FindBy(xpath = "//*[@class='product_sort_container']/option[4]")
    WebElement highToLow;

    public SortingOnAllItemsPage() {
        super();
    }

    public void clickOnNameZToASortingOption() {
        zToA.click();
        new WebDriverWait(driver, Duration.ofSeconds(3))
                .until(ExpectedConditions.visibilityOf(inventoryItemNames));
    }

    public void clickOnPriceLowToHighSortingOption() {
        lowToHigh.click();
        new WebDriverWait(driver, Duration.ofSeconds(3))
                .until(ExpectedConditions.visibilityOf(inventoryItemNames));
    }

    public void clickOnPriceHighToLowSortingOption() {
        highToLow.click();
        new WebDriverWait(driver, Duration.ofSeconds(3))
                .until(ExpectedConditions.visibilityOf(inventoryItemNames));
    }

    public void clickOnNameAToZSortingOption() {
        aToz.click();
        new WebDriverWait(driver, Duration.ofSeconds(3))
                .until(ExpectedConditions.visibilityOf(inventoryItemNames));
    }
}
