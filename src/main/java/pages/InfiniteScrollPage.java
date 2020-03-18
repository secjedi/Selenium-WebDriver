package pages;

import org.openqa.selenium.*;

public class InfiniteScrollPage {
    private WebDriver driver;
    By textBlocks =  By.className("jscroll-added");

    public InfiniteScrollPage(WebDriver driver) {
        this.driver = driver;
    }

    /**
     * Scrolls until paragraph with index specified is in view
     * @param index 1-based
     */

    public void scrollToParagraph(int index){
        //the scrollTo function can scroll horizontally and vertically
        // here, we are not interested in scrolling horizontally hence
        // the value 0 for x attribute
        // document.body.scrollHeight will do a normal scroll
        // to test if we've got to the paragragh, we use loops
        // check out automating in the browser using js

        String script = "window.scrollTo(0, document.body.scrollHeight)";
        var jsExecutor = (JavascriptExecutor)driver;
        while (getNumberOfParagraphsOnPage() < index){
            jsExecutor.executeScript(script);
        }
    }
    private int getNumberOfParagraphsOnPage(){
        return driver.findElements(textBlocks).size();
    }


}
