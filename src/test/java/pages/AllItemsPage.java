package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



import java.time.Duration;


public class AllItemsPage extends BasePage {
    @FindBy(xpath = "//*[@id=\"react-burger-menu-btn\"]")
    WebElement burgerMenu;
    @FindBy(xpath = "//*[@id=\"shopping_cart_container\"]")
    WebElement shoppingCart;
    @FindBy(xpath = "//*[@id=\"header_container\"]/div[2]/div[2]/span")
    WebElement sortingSelection;
    @FindBy(xpath = "//*[@id=\"page_wrapper\"]/footer/ul/li[1]")
    WebElement twitterLinkInFooter;
    @FindBy(xpath = "//*[@id=\"page_wrapper\"]/footer/ul/li[2]")
    WebElement facebookLinkInFooter;
    @FindBy(xpath = "//*[@id=\"page_wrapper\"]/footer/ul/li[3]")
    WebElement linkedinLinkInFooter;


    public AllItemsPage() {
        super();
    }

    public void callBurgerMenu() {
        burgerMenu.click();
        new WebDriverWait(driver, Duration.ofSeconds(2))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"menu_button_container\"]/div/div[2]/div[1]")));
    }

    public void redirectToCartPage() {
        shoppingCart.click();
    }

    // TODO:     Has to be List of elements...
    public void sortingSelectionButton() {
        sortingSelection.click();
    }

    public void twitterLinkInFooter() {
        twitterLinkInFooter.click();
    }

    public void facebookLinkInFooter() {
        facebookLinkInFooter.click();
    }

    public void linkedinLinkInFooter() {
        linkedinLinkInFooter.click();
    }
}
