package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class HorizontalSlider {
    private WebDriver driver;
    private By sliderCircle = By.cssSelector(".sliderContainer input");
    private By rangeResult = By.id("range");


    public HorizontalSlider(WebDriver driver) {
        this.driver = driver;
    }
    public void ClickOnRange (String keys){
      driver.findElement(sliderCircle).sendKeys(keys);
    }
    public String getRangeResult (){
        return driver.findElement(rangeResult).getText();
    }

}
