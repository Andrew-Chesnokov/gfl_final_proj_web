package tests;

import org.testng.annotations.Test;
import steps.BurgerMenuStepsResult;

public class BurgerMenuTest extends BaseParametersForTest {
    @Test(groups = {"BurgerMenu"})
    public void testOfAboutButtonInBurgerMenu() {
        BurgerMenuStepsResult burgerMenuStepsResult = burgerMenuSteps.redirectToSauceLabsPage();
        burgerMenuStepsResult.verifyThatSauceLabsPageIsOpened();
    }

    @Test(groups = {"BurgerMenu"})
    public void testOfLogoutButtonInBurgerMenu() {
        BurgerMenuStepsResult burgerMenuStepsResult = burgerMenuSteps.logoutFromCurrentUser();
        burgerMenuStepsResult.verifyThatLoggingPageIsOpened();
    }

    @Test(groups = {"BurgerMenu"})
    public void testOfAllItemsButtonInBurgerMenu() {
        BurgerMenuStepsResult burgerMenuStepsResult = burgerMenuSteps.moveToAllItemsPage();
        burgerMenuStepsResult.verifyThatAllItemsPageIsOpened();
    }
}
