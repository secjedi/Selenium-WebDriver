package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WysiwygEditorPage {
    private WebDriver driver;
    //We use String instead of a webElement
    private String editorIframeId = "mce_0_ifr";
    private By textArea = By.id("tinymce");
    private By button = By.cssSelector("#mceu_12 button");

    public WysiwygEditorPage(WebDriver driver) {
        this.driver = driver;
    }
    // To get to the iFrame
    private void switchToEditArea(){
        driver.switchTo().frame(editorIframeId);
    }
    public void clearTextArea(){
        switchToEditArea();
        driver.findElement(textArea).clear();
        switchToMainArea();
    }

    public void setTextArea(String text){
        switchToEditArea();
        driver.findElement(textArea).sendKeys(text);
        switchToMainArea();
    }
    public String getTextFromEditor(){
        switchToEditArea();
        String text = driver.findElement(textArea).getText();
        switchToMainArea();
        return text;
    }

    public void clickButton(){
        driver.findElement(button).click();
    }

    public void switchToMainArea(){
        driver.switchTo().parentFrame();
    }
}
