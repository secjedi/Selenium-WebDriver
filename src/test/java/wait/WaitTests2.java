package wait;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class WaitTests2 extends BaseTests {
    @Test
    public void testLoadedPage(){
        var loadedPage = homePage.clickDynamicLoading().clickExample2();
        loadedPage.clickStartButton();
        assertEquals(loadedPage.getLoadedText(), "Hello World!", "incorret text");
    }
}
