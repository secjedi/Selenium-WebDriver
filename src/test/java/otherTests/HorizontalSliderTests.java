package otherTests;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class HorizontalSliderTests extends BaseTests {
    @Test
    public void testSlider() {
        String number = "4";
        var sliderPage = homePage.clickHorizontalSlider();
        sliderPage.slideThrough();

        assertEquals(sliderPage.checkRange(), number, "not equals 4");
        assertEquals(sliderPage.checkTextPage(), "Horizontal Slider");


    }
}
