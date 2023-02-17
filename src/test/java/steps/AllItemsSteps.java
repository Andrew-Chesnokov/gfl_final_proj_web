package steps;

import pages.AllItemsPage;

public class AllItemsSteps {
    private AllItemsPage allItemsPage = new AllItemsPage();

    public AllItemsStepsResult displayShoppingCartCounter(){
        allItemsPage.clickSauceLabsBackPackAddToCartButton();
        return new AllItemsStepsResult();
    }

    public AllItemsStepsResult shoppingCartCounterIsRemoved(){
        allItemsPage.clickSauceLabsBackPackRemoveToCartButton();
        return new AllItemsStepsResult();
    }

    public AllItemsStepsResult openTwitterLink(){
        allItemsPage.twitterLinkInFooter();
        return new AllItemsStepsResult();
    }

    public AllItemsStepsResult openFacebookLink(){
        allItemsPage.facebookLinkInFooter();
        return new AllItemsStepsResult();
    }

    public AllItemsStepsResult openLinkedinLink(){
        allItemsPage.linkedinLinkInFooter();
        return new AllItemsStepsResult();
    }

    public AllItemsStepsResult openBurgerMenu(){
        allItemsPage.callBurgerMenu();
        return new AllItemsStepsResult();
    }

    public AllItemsStepsResult openShoppingCartPage(){
        allItemsPage.redirectToCartPage();
        return new AllItemsStepsResult();
    }
}
