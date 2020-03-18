package alerts;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class AlertTests extends BaseTests {

    @Test
    public void testAcceptAlert() {
        var acceptPage = homePage.clickJavaScriptAlerts();
        acceptPage.triggerAlert();
        acceptPage.alert_clickToAccept();
        assertEquals(acceptPage.getResult(), "You successfuly clicked an alert", "Result text incorrect");
    }

    @Test
    public void testGetTextFromAlert() {
        var alertPage = homePage.clickJavaScriptAlerts();
        alertPage.triggerConfirm();
        String text = alertPage.alert_getText();
        alertPage.alert_clickToDismiss();
        assertEquals(text, "I am a JS Confirm", "Text not correct");
    }
}
