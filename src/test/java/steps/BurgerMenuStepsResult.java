package steps;

import pages.BurgerMenuResult;

public class BurgerMenuStepsResult {
    private BurgerMenuResult burgerMenuResult = new BurgerMenuResult();

    public void verifyThatSauceLabsPageIsOpened(){
        burgerMenuResult.assertThatSauceLabsPageIsOpenedAfterClickingAboutButton();
    }

    public void verifyThatLoggingPageIsOpened(){
        burgerMenuResult.assertThatUserNameFieldIsDisplayedAfterClickingLogoutButton();
    }

    public void verifyThatAllItemsPageIsOpened(){
        burgerMenuResult.assertThatAllItemsMainPageIsOpenedAfterClickingAllItemsButton();
    }
}
