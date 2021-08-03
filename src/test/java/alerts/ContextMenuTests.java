package alerts;

import base.BaseTests;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;



import static org.testng.Assert.assertEquals;

public class ContextMenuTests extends BaseTests {

    @Test
    public void contextMenuTry () {
        var contextMenuPage = homePage.clickContextMenu();
        contextMenuPage.triggerHotSpot();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        contextMenuPage.alert_clickToAccept();
        assertEquals (contextMenuPage.alert_read(),"You selected a context menu","wrong text!");

    }
}
