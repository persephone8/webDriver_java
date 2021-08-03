package horizontalSlider;

import base.BaseTests;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import pages.HorizontalSlider;

import static org.testng.Assert.assertEquals;

public class HorizontalSliderTests extends BaseTests {

    @Test

    public void testSlider4 (){
       var horizontalSliderPage = homePage.clickSlider();
       horizontalSliderPage.ClickOnRange(Keys.chord(Keys.ARROW_RIGHT,Keys.ARROW_RIGHT,Keys.ARROW_RIGHT,
               Keys.ARROW_RIGHT,Keys.ARROW_RIGHT,Keys.ARROW_RIGHT,Keys.ARROW_RIGHT,Keys.ARROW_RIGHT));
       assertEquals (horizontalSliderPage.getRangeResult(),"4");
    }

}
