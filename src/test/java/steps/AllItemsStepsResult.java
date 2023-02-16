package steps;

import pages.AllItemsPageResult;

public class AllItemsStepsResult {
    private AllItemsPageResult allItemsPageResult = new AllItemsPageResult();

    public void verifyThatBurgerMenuIsOpened() {
        allItemsPageResult.assertThatBurgerMenuIsOpened();
    }

    public void verifyThatShoppingCartPageIsOpened(){
        allItemsPageResult.assertThatShoppingCartPageIsOpened();
    }

    public void verifyThatTwitterLogoIsDisplayed(){
        allItemsPageResult.assertThatTwitterLogoIsDisplayed();
    }

    public void verifyThatFacebookLogoIsDisplayed(){
        allItemsPageResult.assertThatFacebookLogoIsDisplayed();
    }

    public void verifyThatLinkedinLogoIsDisplayed(){
        allItemsPageResult.assertThatLinkedinLogoIsDisplayed();
    }
}
