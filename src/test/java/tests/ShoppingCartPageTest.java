package tests;

import org.testng.annotations.Test;
import steps.ShoppingCartPageStepsResult;

public class ShoppingCartPageTest extends BaseParametersForTest {
    @Test(groups = "ShoppingCartPageProductIsAdded",priority = 1)
    public void testOfAddedProductNameIsMatchedWithChosen() {
        ShoppingCartPageStepsResult shoppingCartPageStepsResult = shoppingCartPageSteps.addAndRedirectToTheCartPage();
        shoppingCartPageStepsResult.verifyThatItemNamesAreMatched();
    }

    @Test(groups = "ShoppingCartPageProductIsAdded",priority = 2)
    public void testOfContinueShoppingButton(){
        ShoppingCartPageStepsResult shoppingCartPageStepsResult = shoppingCartPageSteps.continueShoppingButton();
        shoppingCartPageStepsResult.verifyThatContinueShoppingButtonRedirectsToAllItemsPage();
    }

    @Test(groups = "ShoppingCartPageProductIsAdded",priority = 3)
    public void testOfRemoveButton(){
        ShoppingCartPageStepsResult shoppingCartPageStepsResult = shoppingCartPageSteps.deleteBackpackFromTheList();
        shoppingCartPageStepsResult.verifyThatBackpackIsRemoved();
    }
}
