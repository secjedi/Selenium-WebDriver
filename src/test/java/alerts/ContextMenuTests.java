package alerts;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class ContextMenuTests extends BaseTests {

    @Test
    public void rightClick(){
        var contextMenu = homePage.clickContextMenu();
        contextMenu.boxHover();
        String text = contextMenu.getResult();
        contextMenu.clickOK();
        assertEquals(text, "You selected a context menu", "Incorrect text");
    }
}
