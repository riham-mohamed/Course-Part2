package signup;

import base.BaseTest;
import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.SecondSignUpPage;
import pages.SignupPage;
import reader.ReadDataFromJson;

import java.io.FileNotFoundException;

import static org.testng.Assert.assertEquals;

public class SignUpTest extends BaseTest
{
    @Test
    public void testSignUpFirstStep() throws FileNotFoundException {
        SignupPage signupPage = homePage.clickOnSign();
        signupPage.insertName(dataModel().SignUp.ValidSignUp.Username);
        signupPage.insertEmail(dataModel().SignUp.ValidSignUp.Email);
        signupPage.clickOnSignupButton();
        String expectedPageTitle = "ENTER ACCOUNT INFORMATION";
        String actualPageTitle = driver.findElement(By.xpath("//b[contains(text(), 'Enter Account')]")).getText();
        assertEquals(actualPageTitle, expectedPageTitle);

        SecondSignUpPage secondSignUpPage = new SecondSignUpPage(driver);
        secondSignUpPage.selectTitle();
        secondSignUpPage.insertPassword(dataModel().SignUp.ValidSignUp.Password);
        secondSignUpPage.insertFirstName(dataModel().SignUp.ValidSignUp.FirstName);
        secondSignUpPage.insertLastName(dataModel().SignUp.ValidSignUp.LastName);
        secondSignUpPage.insertAddressField(dataModel().SignUp.ValidSignUp.Address);
        secondSignUpPage.insertCountryField(dataModel().SignUp.ValidSignUp.Country);
        secondSignUpPage.insertStateField(dataModel().SignUp.ValidSignUp.State);
        secondSignUpPage.insertCityField(dataModel().SignUp.ValidSignUp.City);
        secondSignUpPage.insertZipCodeField(dataModel().SignUp.ValidSignUp.ZipCode);
        secondSignUpPage.insertMobileNumberField(dataModel().SignUp.ValidSignUp.MobileNumber);
        secondSignUpPage.clickOnCreateAccountButton();
    }

    @Test (dataProvider = "dataProvider1")
    public void testInvalidSignUp(String Username, String Email) throws FileNotFoundException
    {
        // ReadDataFromJson readDataFromJson = new ReadDataFromJson();
      //  System.out.println(Username);
      //  System.out.println(Email);
      SignupPage signupPage = homePage.clickOnSign();
        signupPage.insertName(Username);
        signupPage.insertEmail(Email);
        signupPage.clickOnSignupButton();

 }

    @DataProvider
    public Object[][] dataProvider1() throws FileNotFoundException {
        ReadDataFromJson readDataFromJson = new ReadDataFromJson();
        return readDataFromJson.readJsonFile().InValidSignUp;
    }
}
