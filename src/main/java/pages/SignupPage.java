package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.MethodHandles;

public class SignupPage extends MethodHandles
{
    public SignupPage(WebDriver driver)
    {
        super(driver);
    }

    private final By emailField = By.xpath("(//*[@placeholder='Email Address'])[2]");

    private final By nameField = By.xpath("//*[@placeholder='Name']");

    private final By SignupButton = By.cssSelector("[data-qa='signup-button']");

    public void insertEmail(String email)
    {
        sendKeys(emailField,email,5);
    }

    public void insertName(String name)
    {
        sendKeys(nameField,name,5);
    }
    public void clickOnSignupButton()
    {
        click(SignupButton,5);
    }

}
