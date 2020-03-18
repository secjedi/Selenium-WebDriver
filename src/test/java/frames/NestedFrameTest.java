package frames;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class NestedFrameTest extends BaseTests {

    @Test
    public void testNestedFrameTest(){
        var nestedFrame = homePage.clickFrame().clickNestedLink();
        assertEquals(nestedFrame.getLeftFrameText(), "LEFT", "Left frame text incorrect");
        assertEquals(nestedFrame.getBottomFrameText(), "BOTTOM", "Bottom frame text incorrect");

    }
}
