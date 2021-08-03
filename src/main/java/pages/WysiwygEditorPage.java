package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WysiwygEditorPage {
    private WebDriver driver;
    private String editorIframeId = "mce_0_ifr";
    private By textArea = By.id("tinymce");
    private By increaseIndent = By.xpath("/html/body/div[2]/div/div/div/div[1]/div[1]/div[2]/div/div[5]/button[2]");


    public WysiwygEditorPage(WebDriver driver) {
        this.driver = driver;
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
    public String gettextFromEditor (){
        switchToEditArea();
        String text = driver.findElement(textArea).getText();
        switchToMainArea();
        return text;
    }
    public void increaseIndention (){
        driver.findElement(increaseIndent).click();
    }
    private void switchToEditArea (){
        driver.switchTo().frame(editorIframeId);

    }
    private void switchToMainArea (){
        driver.switchTo().parentFrame();
    }
}
