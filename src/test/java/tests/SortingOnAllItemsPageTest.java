package tests;

import org.testng.annotations.Test;
import pages.SortingOnAllItemsPageResult;
import steps.SortingOnAllItemsPageStepsResult;

public class SortingOnAllItemsPageTest extends BaseParametersForTest{
    @Test(groups = {"SortingOnAllItemsPage"})
    public void testOfZtoASortingOption(){
        SortingOnAllItemsPageStepsResult sortingOnAllItemsPageStepsResult = sortingOnAllItemsPageSteps.itemsDisplayedInZtoAOrder();
        sortingOnAllItemsPageStepsResult.verifyThatItemsAreSortedInZToAOrder();
    }

    @Test(groups = {"SortingOnAllItemsPage"})
    public void testOfAtoZSortingOption(){
        SortingOnAllItemsPageStepsResult sortingOnAllItemsPageStepsResult = sortingOnAllItemsPageSteps.itemsDisplayedInAtoZOrder();
        sortingOnAllItemsPageStepsResult.verifyThatItemsAreSortedInAToZOrder();
    }

    @Test(groups = {"SortingOnAllItemsPage"})
    public void testOfLowToHighPriceOrder(){
        SortingOnAllItemsPageStepsResult sortingOnAllItemsPageStepsResult = sortingOnAllItemsPageSteps.itemsDisplayedInLowToHighPriceOrder();
        sortingOnAllItemsPageStepsResult.verifyThatItemsAreSortedInLowToHighPriceOrder();
    }

    @Test(groups = {"SortingOnAllItemsPage"})
    public void testOfHighToLowPriceOrder(){
        SortingOnAllItemsPageStepsResult sortingOnAllItemsPageStepsResult = sortingOnAllItemsPageSteps.itemsDisplayedInHighToLowPriceOrder();
        sortingOnAllItemsPageStepsResult.verifyThatItemsAreSortedInHighToLowPriceOrder();
    }
}
