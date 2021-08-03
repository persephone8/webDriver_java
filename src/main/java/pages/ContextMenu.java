package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;


public class ContextMenu {
    private  WebDriver driver;
    private By triggerHotSpotRectangle = By.id("hot-spot");



    public ContextMenu(WebDriver driver) {
        this.driver = driver;

    }

    public void triggerHotSpot() {
        Actions act = new Actions(driver);
        act.contextClick(driver.findElement(triggerHotSpotRectangle)).perform();
    }

    public void alert_clickToAccept() {
        driver.switchTo().alert().accept();
    }

    public String alert_read() {
        return driver.switchTo().alert().getText();
    }
}
