package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForgotPasswordLink
{
WebDriver driver;

public ForgotPasswordLink(WebDriver driver)
{
    this.driver=driver;
}

private final By ForgotPasswordLink = By.linkText("Forgot Password");

    public ForgotPasswordPage clickOnForgetPasswordLink()
    {
        driver.findElement(ForgotPasswordLink).click();
        return new ForgotPasswordPage(driver);
    }

}