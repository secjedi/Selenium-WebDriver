package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlertsPage {
    private WebDriver driver;
    private By result = By.id("result");
    private By triggerConfirmButton = By.xpath("//button[text()='I am a JS Confirm']");//I am a JS Confirm'
    private By triggerAlertButton = By.xpath("//button[contains(text(),'Click for JS Alert')]");

    public AlertsPage(WebDriver driver) {
        this.driver = driver;
    }
    public void triggerAlert(){
        driver.findElement(triggerAlertButton).click();
    }
    public void triggerConfirm(){
        driver.findElement(triggerConfirmButton).click();
    }

    public void alert_clickToAccept(){
        //switchTo method switches from the current context of the DOM
        // to another one
        driver.switchTo().alert().accept();
    }
    public void alert_clickToDismiss(){
        driver.switchTo().alert().dismiss();
    }

    public String alert_getText(){
        return driver.switchTo().alert().getText();
    }


    public String getResult(){
        return driver.findElement(result).getText();
    }

}
