package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class HorizontalSliderPage {
    private WebDriver driver;
    private By checkText = By.tagName("h3");
    private By slider = By.tagName("input");
    private By limit = By.id("range");

    public HorizontalSliderPage(WebDriver driver) {
        this.driver = driver;
    }

    public void slideThrough(){
        driver.findElement(slider).sendKeys(Keys.ARROW_RIGHT);
    }

    public String checkRange(){
        return driver.findElement(limit).getText();
    }

    public String checkTextPage(){
        return driver.findElement(checkText).getText();
    }

}
