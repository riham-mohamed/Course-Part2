package login;

import base.BaseTest;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import pages.LoginPage;

import java.io.FileNotFoundException;

import static org.testng.Assert.assertEquals;

public class LoginTest extends BaseTest
{
    @Test
public void testInValidLogin() throws FileNotFoundException {
        LoginPage loginPage = homePage.clickOnSignUpLink();
        loginPage.insertEmail(dataModel().Login.ValidCredentials.Email);
        loginPage.insertPassword(dataModel().Login.ValidCredentials.Password);
        loginPage.clickOnLoginButton();
        String expectedWelcomeText = "rihammohamed";
        String actualWelcomeText = driver.findElement(By.xpath("//i[@class='fa fa-user']/following-sibling::b")).getText();
        assertEquals(actualWelcomeText, expectedWelcomeText);
    }
}
