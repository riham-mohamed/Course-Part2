package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForgotPasswordPage
{
    WebDriver driver;

    public ForgotPasswordPage(WebDriver driver)
    {
        this.driver=driver;
    }

private final By emailField = By.cssSelector("#email");
private final By retrievePasswordField = By.cssSelector(".icon-2x");

public void Insertemail(String email)
{
    driver.findElement(emailField).sendKeys(email);
}

    public InternalServerErrorPage clickOnRetrievePasswordButton()
    {
        driver.findElement(retrievePasswordField).click();
        return new InternalServerErrorPage(driver);
    }

}
