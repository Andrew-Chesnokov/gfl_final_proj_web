package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BurgerMenu extends BasePage {
    @FindBy(xpath = "//*[@id='about_sidebar_link']")
    WebElement aboutButton;
    @FindBy(xpath = "//*[@id=\"logout_sidebar_link\"]")
    WebElement logoutButton;
    @FindBy(xpath = "//*[@id=\"inventory_sidebar_link\"]")
    WebElement allItemsButton;

    private AllItemsPage allItemsPage = new AllItemsPage();

    public BurgerMenu() {
        super();
    }

    public void clickAboutButton() {
        allItemsPage.callBurgerMenu();
        new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.elementToBeClickable(aboutButton));
        aboutButton.click();
        new WebDriverWait(driver, Duration.ofSeconds(3));
    }

    public void clickLogoutButton() {
        allItemsPage.callBurgerMenu();
        new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.elementToBeClickable(logoutButton));
        logoutButton.click();
        new WebDriverWait(driver, Duration.ofSeconds(3));
    }

    public void clickAllItemsButton() {
        allItemsPage.callBurgerMenu();
        new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.elementToBeClickable(allItemsButton));
        allItemsButton.click();
        new WebDriverWait(driver, Duration.ofSeconds(3));
    }
}
