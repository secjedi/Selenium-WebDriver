package hover;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class HoverTests extends BaseTests {
    @Test
    public void testHoverUser1() {
        var hoversPage = homePage.clickHovers();
        var caption = hoversPage.hoverOverFigure(1);
        //We are not sure assertTrue will always return true
        assertTrue(caption.isCaptionDisplayed(), "Caption not displayed");

        //Making sure the title is correct
        assertEquals(caption.getTitle(), "name: user1", "Caption title is incorrect");
        // Make sure the link text is right
        assertEquals(caption.getLinkText(), "View profile", "Caption link is incorrect");
        // If something changes, we must not hardcode so we use a relative path
        assertTrue(caption.getLink().endsWith("/users/1"));
    }
}
