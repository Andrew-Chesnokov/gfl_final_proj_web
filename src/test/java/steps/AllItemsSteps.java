package steps;

import pages.AllItemsPage;

public class AllItemsSteps {
    private AllItemsPage allItemsPage = new AllItemsPage();

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
