package otherTests;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.ForgotPasswordPage;
import pages.RetrievePage;

import static org.testng.Assert.assertTrue;


public class ForgotPasswordTests extends BaseTests {

    @Test
    public void RetrivePageLoaded(){
        ForgotPasswordPage forgotPasswordPage = homePage.clickForgot();
        forgotPasswordPage.setEmail("tau@example.com");
        RetrievePage retrievePage = forgotPasswordPage.clickRetrieveButton();
        assertTrue(retrievePage.checkPageInfo()
                .contains("Your e-mail's been sent!"), "Wrong page");
    }
}
