package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.PropertyReader;


import java.time.Duration;
import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;
import static org.testng.Assert.assertTrue;

public class AllItemsPageResult extends BasePage {
    @FindBy(xpath = "//*[@id=\"menu_button_container\"]/div/div[2]/div[1]")
    WebElement sideBarMenu;
    @FindBy(xpath = "//*[@id=\"header_container\"]/div[2]")
    WebElement shoppingCartHeader;
    @FindBy(partialLinkText = "Sauce Labs")
    WebElement twitterLogo;
    @FindBy(xpath = "//*[@id=\"login_form\"]/div[2]/div[3]")
    WebElement facebookLogo;
    @FindBy(xpath = "//*[@id=\"organization_guest_contextual-sign-in\"]/div/section/main/div")
    WebElement linkedinMessage;
    @FindBy(xpath = "//span[text()='1']")
    WebElement shoppingCartCounter;
    @FindBy(xpath = "//*[@id=\"shopping_cart_container\"]")
    WebElement shoppingCartContainer;

    public AllItemsPageResult() {
        super();
    }

    public void switchToSecondTab() {
        JavascriptExecutor js = (JavascriptExecutor) driver;

        try {
            driver.get(PropertyReader.getInstance().getURL());
            Thread.sleep(3000);

            String window1 = driver.getWindowHandle();

            js.executeScript("window.open()");

            Set<String> currentWindows = driver.getWindowHandles();

            String window2 = null;

            for (String window : currentWindows) {
                if (!window.equals(window1)) {
                    window2 = window;
                    break;
                }
            }
            driver.switchTo().window(window2);

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void assertThatShoppingCartCounterIsDisplayed() {
        assertThat(shoppingCartCounter.isDisplayed()).isTrue();
    }

    public void assertThatShoppingCartCounterIsNotDisplayed(){
        assertThat(shoppingCartContainer.isDisplayed()).isTrue();
    }

    public void assertThatBurgerMenuIsOpened() {
        assertTrue(sideBarMenu.isDisplayed());
    }

    public void assertThatShoppingCartPageIsOpened() {
        assertTrue(shoppingCartHeader.isDisplayed());
    }

    public void assertThatTwitterLogoIsDisplayed() {
        switchToSecondTab();
        new WebDriverWait(driver, Duration.ofSeconds(10));
        assertTrue(twitterLogo.isDisplayed());
    }

    public void assertThatFacebookLogoIsDisplayed() {
        switchToSecondTab();
        assertTrue(facebookLogo.isDisplayed());
    }

    public void assertThatLinkedinLogoIsDisplayed() {
        switchToSecondTab();
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"organization_guest_contextual-sign-in\"]/div/section/main/div")));
        assertTrue(linkedinMessage.isDisplayed());
    }
}
