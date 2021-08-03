package base;

import com.google.common.io.Files;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.HomePage;
import utils.WindowManager;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class BaseTests {
    public WebDriver driver;
    protected HomePage homePage;


    @BeforeMethod
    public void goHome (){
        driver.get("https://the-internet.herokuapp.com/");
    }
    @BeforeClass
    public void setUp (){
        System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
        driver = new ChromeDriver();
       // driver.manage().timeouts().pageLoadTimeout();
       // driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        goHome();
        driver.get("https://the-internet.herokuapp.com/");

        homePage = new HomePage(driver);

    }
    @AfterClass
    public void tearDown (){
        driver.quit();
    }

    @AfterClass
    public void recordFailure (ITestResult result){
        if (ITestResult.FAILURE== result.getStatus()){
    var camera = (TakesScreenshot)driver;
        File screenshot = camera.getScreenshotAs(OutputType.FILE);
        try {
            Files.move(screenshot, new File("resources/screenshots/test.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }}
        // System.out.println("Screenshot taken: " + screenshot.getAbsolutePath());
    }

    public WindowManager getWindowManager (){
        return new WindowManager(driver);
    }

}
