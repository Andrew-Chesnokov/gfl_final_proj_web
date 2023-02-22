package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.assertj.core.api.Assertions.assertThat;
import static org.testng.Assert.assertTrue;

public class BurgerMenuResult extends BasePage {
    @FindBy(xpath = "//*[@id=\"__next\"]/header/div/div/div[1]")
    WebElement sauceLabsHeader;

    @FindBy(xpath = "//*[@id=\"user-name\"]")
    WebElement userNameField;
    @FindBy(xpath = "//span[text()='Products']")
    WebElement allItemsMainPage;

    public BurgerMenuResult() {
        super();
    }

    public void assertThatSauceLabsPageIsOpenedAfterClickingAboutButton() {
        new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"__next\"]/header/div/div/div[1]")));
        assertThat(sauceLabsHeader.isDisplayed()).isTrue();
    }

    public void assertThatUserNameFieldIsDisplayedAfterClickingLogoutButton() {
        assertTrue(userNameField.isDisplayed());
    }

    public void assertThatAllItemsMainPageIsOpenedAfterClickingAllItemsButton() {
        assertTrue(allItemsMainPage.isDisplayed());
    }
}
