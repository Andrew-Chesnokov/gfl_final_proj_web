package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class SortingOnAllItemsPageResult extends BasePage{
    @FindBy(xpath = "//*[@class='inventory_item_name']")
    List<WebElement> itemNames;
    public SortingOnAllItemsPageResult() {
        super();
    }

    public void assertThatTheItemsInZtoAOrder(){
        List<String> list = new ArrayList<>();
        for (int i = 0; i < itemNames.size(); i++) {
            list.add(i,itemNames.get(i).getText());
        }
        Collections.sort(list);
        int listSize = list.size()-1;
        assertEquals(list.get(listSize), itemNames.get(0).getText());
    }

    public  void assertThatTheItemsInAtoZOrder(){
        List<String> list = new ArrayList<>();
        for (int i = 0; i < itemNames.size(); i++) {
            list.add(i,itemNames.get(i).getText());
        }
        Collections.sort(list);
        assertEquals(list.get(0),itemNames.get(0).getText());
    }
}
