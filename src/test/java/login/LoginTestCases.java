package login;

import base.BaseTests;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.SecureAreaPage;

import static org.testng.Assert.assertTrue;

public class LoginTestCases extends BaseTests {

   @Test(priority = 1)
    public void testValidLogin()
   {
     LoginPage loginPage =  homePage.clickOnFormAuthenticationLink();
     //driver.findElement(By.linkText("Form Authentication")).click();
     loginPage.insertUsername("tomsmith");
     //driver.findElement(By.xpath("//input[@id='username']")).sendKeys("tomsmith");
     loginPage.insertPassword("SuperSecretPassword!");
     // driver.findElement(By.xpath("//*[@name='password']")).sendKeys("SuperSecretPassword!");
    SecureAreaPage secureareapage =  loginPage.clickOnLoginButton();
     // driver.findElement(By.cssSelector(".fa")).click();
     String actualresult = secureareapage.getValidationMessage();
     //String actualresult = driver.findElement(By.cssSelector("div[id='flash']")).getText();
     assertTrue(actualresult.contains("You logged into a secure area"));

   }
@Test(priority = 2)
   public void testInvalidPassword()
   {
       //valid user name and invalid pw
       LoginPage loginPage = homePage.clickOnFormAuthenticationLink();
       //driver.findElement(By.linkText("Form Authentication")).click();
       loginPage.insertUsername("tomsmith");
      // driver.findElement(By.xpath("//*[contains(@id,'username')]")).sendKeys("tomsmith");
      loginPage.insertPassword("Super");
      // driver.findElement(By.cssSelector("#password")).sendKeys("Super");
      SecureAreaPage secureareapage = loginPage.clickOnLoginButton();
       //driver.findElement(By.cssSelector(".fa")).click();
       String actualresult = secureareapage.getValidationMessage();
     //  String actualresult = driver.findElement(By.cssSelector("[id='flash']")).getText();
       assertTrue(actualresult.contains("Your password is invalid!"));
   }

 @Test(priority = 3)
   public void testInvalidUsernameAndPassword()
   {
       //invalid user name and invalid pw
       LoginPage loginPage = homePage.clickOnFormAuthenticationLink();
       //driver.findElement(By.linkText("Form Authentication")).click();
      loginPage.insertUsername("tom");
      // driver.findElement(By.xpath("//*[contains(@id,'username')]")).sendKeys("tom");
      loginPage.insertPassword("Super");
      // driver.findElement(By.cssSelector("#password")).sendKeys("Super");
       SecureAreaPage secureareapage = loginPage.clickOnLoginButton();
       driver.findElement(By.cssSelector(".fa")).click();
       String actualresult = secureareapage.getValidationMessage();
       //String actualresult = driver.findElement(By.cssSelector(".flash.error")).getText();
       assertTrue(actualresult.contains("Your username is invalid!"));

   }
}