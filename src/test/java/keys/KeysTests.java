package keys;

import base.BaseTests;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class KeysTests extends BaseTests {
    @Test(priority = 1)
    public void testBackSpace() {
        var keyPage = homePage.clickKeyPresses();
        keyPage.enterText("A" + Keys.BACK_SPACE);
        assertEquals(keyPage.checkText(), "You entered: BACK_SPACE");
    }

    @Test(priority = 2)
    public void testPi() {
        var keyPage1 = homePage.clickKeyPresses();
        keyPage1.enterPi();
    }

    @Test(priority = 3)
    public void testCapS() {
        var keyPage2 = homePage.clickKeyPresses();
        keyPage2.enterCapS();
    }
}
