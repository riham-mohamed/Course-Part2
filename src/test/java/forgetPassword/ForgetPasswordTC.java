package forgetPassword;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.ForgotPasswordPage;
import pages.InternalServerErrorPage;

import static org.testng.Assert.assertEquals;

public class ForgetPasswordTC extends BaseTests {
    @Test
    public void testForgetPassword()
    {

        ForgotPasswordPage forgotPasswordPage = forgotpasswordlink.clickOnForgetPasswordLink();
      //  driver.findElement(By.linkText("Forgot Password")).click();
        forgotPasswordPage.Insertemail("ABC");
       // driver.findElement(By.cssSelector("#email")).sendKeys("ABC");
       // driver.findElement(By.cssSelector(".icon-2x")).click();
        InternalServerErrorPage internalServerErrorPage = forgotPasswordPage.clickOnRetrievePasswordButton();
      //  String expectederror = driver.findElement(By.xpath("//h1[contains(text(),'Internal')]")).getText();
String expectederror = internalServerErrorPage.getInternalServerErrorMessage();
        String actualtext = "Internal Server Error";
assertEquals(actualtext,expectederror);
    }

}
