package tests;

import org.testng.annotations.Test;
import steps.AllItemsStepsResult;

public class ShoppingCartCounterTest extends BaseParametersForTest{
    @Test(groups = {"ShoppingCartCounter"},priority = 1)
    public void testDisplayOfShoppingCartCounter(){
        AllItemsStepsResult allItemsStepsResult = allItemsSteps.displayShoppingCartCounter();
        allItemsStepsResult.verifyThatShoppingCartCounterIsDisplayed();
    }
    @Test(groups = {"ShoppingCartCounter"},priority = 2)
    public void testOfRemovingShoppingCartCounter(){
        AllItemsStepsResult allItemsStepsResult = allItemsSteps.shoppingCartCounterIsRemoved();
        allItemsStepsResult.verifyThatShoppingCartCounterIsRemoved();
    }
}
