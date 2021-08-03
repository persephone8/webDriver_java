package hw;

import base.BaseTests;
import pages.ForgotPass;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ForgotPassword extends BaseTests {
    @Test
    public void testSuccessfulForgotPassword (){
        var forgetPasswordPage = homePage.clickForgotPassword();
      var emailSentPage =  forgetPasswordPage.retrievePassword("tau@example.com");
        assertEquals(emailSentPage.getMessage(), "Your e-mail's been sent!", "Message is incorrect");


    }
}