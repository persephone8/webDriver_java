package alerts;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FileUploadTests extends BaseTests {
    @Test
    public void testFileUpload(){
        var uploadPage = homePage.clickFileUpload();
        uploadPage.uploadFile("C:\\Users\\sophi\\IdeaProjects\\webDriver_java\\src\\test\\java\\alerts\\FileUploadTests.java");
        assertEquals (uploadPage.getUploadedFiles(),"FileUploadTests.java","Uploaded files incorrect");
    }
}
