package steps;

import pages.ShoppingCartPage;

public class ShoppingCartPageSteps {
    private ShoppingCartPage shoppingCartPage = new ShoppingCartPage();

    public ShoppingCartPageStepsResult addAndRedirectToTheCartPage(){
        shoppingCartPage.addToCart();
        shoppingCartPage.redirectToShoppingCartPage();
        return new ShoppingCartPageStepsResult();
    }

    public ShoppingCartPageStepsResult continueShoppingButton(){
        shoppingCartPage.redirectToShoppingCartPage();
        shoppingCartPage.redirectToAllItemsPage();
        return new ShoppingCartPageStepsResult();
    }

    public  ShoppingCartPageStepsResult deleteBackpackFromTheList(){
        shoppingCartPage.redirectToShoppingCartPage();
        shoppingCartPage.removeBackpackFromTheList();
        shoppingCartPage.redirectToAllItemsPage();
        return new ShoppingCartPageStepsResult();
    }
}
