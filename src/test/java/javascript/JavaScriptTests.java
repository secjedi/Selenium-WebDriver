package javascript;

import base.BaseTests;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.*;

public class JavaScriptTests extends BaseTests {
    @Test
    public void testScrollToTable(){
        homePage.clickLargeAndDeepDom().scrollToTable();
    }

    @Test
    public void testScrollToFifthParagraph(){
        homePage.clickInfiniteScroll().scrollToParagraph(5);
    }
    @Test
    public void testAddMultipleAttributeToDropdown(){
        var dropDDownPage = homePage.clickDropdown();
        dropDDownPage.addMultipleAttribute();

        var optionToSelect = List.of("Option 1", "Option 2");
        optionToSelect.forEach(dropDDownPage::selectFromDropdown);

        var selectedOptions = dropDDownPage.getSelectedOptions();
        assertTrue(selectedOptions.containsAll(optionToSelect), "All options were not selected");
        assertEquals(selectedOptions.size(), optionToSelect.size(), "Number of selected items");
    }
}
