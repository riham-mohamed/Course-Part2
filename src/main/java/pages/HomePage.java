package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.MethodHandles;

public class HomePage extends MethodHandles
{

    public HomePage(WebDriver driver) {
    super(driver);
    }

    private final By signUplink = By.partialLinkText("Signup / Login");

    public LoginPage clickOnSignUpLink()
    {
        click(signUplink, 5);
        return new LoginPage(driver);
    }

    public SignupPage clickOnSign()
    {
        click(signUplink, 5);
        return new SignupPage(driver);
    }


}
