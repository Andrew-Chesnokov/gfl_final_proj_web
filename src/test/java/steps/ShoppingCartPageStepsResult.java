package steps;

import pages.ShoppingCartPageResult;

public class ShoppingCartPageStepsResult {
    private ShoppingCartPageResult shoppingCartPageResult = new ShoppingCartPageResult();

    public void verifyThatItemNamesAreMatched(){
        shoppingCartPageResult.assertThatItemNamesAreMatched();
    }

    public void verifyThatContinueShoppingButtonRedirectsToAllItemsPage(){
        shoppingCartPageResult.assertThatContinueShoppingButtonRedirectsToAllItemsPage();
    }

    public void verifyThatBackpackIsRemoved(){
        shoppingCartPageResult.assertThatBackpackIsRemoved();
    }
}
