package steps;

import pages.AllItemsPage;
import pages.BurgerMenu;

public class BurgerMenuSteps {
    private BurgerMenu burgerMenu = new BurgerMenu();

    private AllItemsPage allItemsPage = new AllItemsPage();

    public BurgerMenuStepsResult redirectToSauceLabsPage(){
        burgerMenu.clickAboutButton();
        return new BurgerMenuStepsResult();
    }

    public BurgerMenuStepsResult logoutFromCurrentUser(){
        burgerMenu.clickLogoutButton();
        return new BurgerMenuStepsResult();
    }

    public BurgerMenuStepsResult moveToAllItemsPage(){
        allItemsPage.redirectToCartPage();
        burgerMenu.clickAllItemsButton();
        return new BurgerMenuStepsResult();
    }
}
