package login;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.LoginPage;

import java.io.FileNotFoundException;

public class LoginTest extends BaseTest
{
    @Test
public void testValidLogin() throws FileNotFoundException {
        LoginPage loginPage = homePage.clickOnSignUpLink();
        loginPage.insertEmail(dataModel().Login.ValidCredentials.Username);
        loginPage.insertPassword(dataModel().Login.ValidCredentials.Password);
        loginPage.clickOnLoginButton();
    }
}
