package steps;

import pages.SortingOnAllItemsPageResult;

public class SortingOnAllItemsPageStepsResult {
    private SortingOnAllItemsPageResult sortingOnAllItemsPageResult= new SortingOnAllItemsPageResult();

    public void verifyThatItemsAreSortedInZToAOrder(){
        sortingOnAllItemsPageResult.assertThatTheItemsInZtoAOrder();
    }

    public void verifyThatItemsAreSortedInAToZOrder(){
        sortingOnAllItemsPageResult.assertThatTheItemsInAtoZOrder();
    }

    public void verifyThatItemsAreSortedInLowToHighPriceOrder(){
        sortingOnAllItemsPageResult.assertThatTheItemsInLowToHighPriceOrder();
    }

    public void verifyThatItemsAreSortedInHighToLowPriceOrder(){
        sortingOnAllItemsPageResult.assertThatTheItemsInHighToLowPriceOrder();
    }
}
