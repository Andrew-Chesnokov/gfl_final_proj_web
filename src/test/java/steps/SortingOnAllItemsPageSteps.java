package steps;

import pages.SortingOnAllItemsPage;
import pages.SortingOnAllItemsPageResult;

public class SortingOnAllItemsPageSteps {
    private SortingOnAllItemsPage sortingOnAllItemsPage = new SortingOnAllItemsPage();

    public SortingOnAllItemsPageStepsResult itemsDisplayedInZtoAOrder(){
        sortingOnAllItemsPage.clickOnNameZToASortingOption();
        return new SortingOnAllItemsPageStepsResult();
    }

    public SortingOnAllItemsPageStepsResult itemsDisplayedInAtoZOrder(){
        sortingOnAllItemsPage.clickOnNameAToZSortingOption();
        return new SortingOnAllItemsPageStepsResult();
    }

    public SortingOnAllItemsPageStepsResult itemsDisplayedInLowToHighPriceOrder(){
        sortingOnAllItemsPage.clickOnPriceLowToHighSortingOption();
        return new SortingOnAllItemsPageStepsResult();
    }

    public SortingOnAllItemsPageStepsResult itemsDisplayedInHighToLowPriceOrder(){
        sortingOnAllItemsPage.clickOnPriceHighToLowSortingOption();
        return new SortingOnAllItemsPageStepsResult();
    }
}
