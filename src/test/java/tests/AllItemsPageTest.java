package tests;

import steps.AllItemsStepsResult;
import org.testng.annotations.Test;

public class AllItemsPageTest extends BaseParametersForTest {
    @Test(priority = 1,groups = {"AllItemsPageTest"})
    public void testOfTwitterLinkInFooter() {
        AllItemsStepsResult allItemsStepsResult = allItemsSteps.openTwitterLink();
        allItemsStepsResult.verifyThatTwitterLogoIsDisplayed();
    }

    @Test(priority = 1,enabled = true,groups = {"AllItemsPageTest"})
    public void testOfFacebookLinkInFooter() {
        AllItemsStepsResult allItemsStepsResult = allItemsSteps.openFacebookLink();
        allItemsStepsResult.verifyThatFacebookLogoIsDisplayed();
    }

    @Test(priority = 1,groups = {"AllItemsPageTest"})
    public void testOfLinkedinKinkInFooter() {
        AllItemsStepsResult allItemsStepsResult = allItemsSteps.openLinkedinLink();
        allItemsStepsResult.verifyThatLinkedinLogoIsDisplayed();
    }

    @Test(priority = 2,groups = {"AllItemsPageTest"})
    public void testDisplayOfSideBarMenu() {
        AllItemsStepsResult allItemsStepsResult = allItemsSteps.openBurgerMenu();
        allItemsStepsResult.verifyThatBurgerMenuIsOpened();
    }

    @Test(priority = 2,groups = {"AllItemsPageTest"})
    public void testShoppingCartPageIsOpened() {
        AllItemsStepsResult allItemsStepsResult = allItemsSteps.openShoppingCartPage();
        allItemsStepsResult.verifyThatShoppingCartPageIsOpened();
    }
}
