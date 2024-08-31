package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.MethodHandles;

public class LoginPage extends MethodHandles {
    public LoginPage(WebDriver driver)
    {
        super(driver);
    }

    private final By emailField = By.name("email");

    private final By passwordField = By.name("password");

    private final By loginButton = By.cssSelector("[data-qa='login-button']");

    public void insertEmail(String email)
    {
    sendKeys(emailField,email,5);
    }

    public void insertPassword(String password)
    {
    sendKeys(passwordField,password,5);
    }

    public void clickOnLoginButton()
    {
    click(loginButton,5);
    }


}
