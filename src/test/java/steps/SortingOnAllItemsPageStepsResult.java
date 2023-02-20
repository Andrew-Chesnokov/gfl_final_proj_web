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
}
