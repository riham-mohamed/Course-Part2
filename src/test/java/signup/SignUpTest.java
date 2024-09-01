package signup;

import base.BaseTest;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.SignupPage;

import java.io.FileNotFoundException;

import static org.testng.Assert.assertEquals;

public class SignUpTest extends BaseTest
{
    @Test
    public void testValidSignUp() throws FileNotFoundException {
        SignupPage signupPage = homePage.clickOnSign();
        signupPage.insertName(dataModel().SignUp.ValidSignUp.Username);
        signupPage.insertEmail(dataModel().SignUp.ValidSignUp.Email);
        signupPage.clickOnSignupButton();
        String expectedPageTitle = "ENTER ACCOUNT INFORMATION";
        String actualPageTitle = driver.findElement(By.xpath("//b[contains(text(), 'Enter Account')]")).getText();
        assertEquals(actualPageTitle,expectedPageTitle);
    }
}
