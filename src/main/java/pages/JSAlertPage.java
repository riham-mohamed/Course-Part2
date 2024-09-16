package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class JSAlertPage {

    WebDriver driver;

    public JSAlertPage(WebDriver driver)
    {
        this.driver=driver;
    }

    private final By jsAlertButton = By.xpath("//button[contains(text(),'Alert')]");

    private final By result = By.id("result");

    private final By jsConfirmButton = By.xpath("//button[contains(text(),'Confirm')]");

    private final By jsPromptButton = By.xpath("//button[contains(text(),'Prompt')]");

    public void clickOnJSAlertButton()
    {
        driver.findElement(jsAlertButton).click();
    }

    public void acceptAlert()
    {
        driver.switchTo().alert().accept();
    }

    public void dismissAlert()
    {
        driver.switchTo().alert().dismiss();
    }

    public void clickOnJSConfirmButton()
    {
        driver.findElement(jsConfirmButton).click();
    }

    public void clickOnJSPromptButton()
    {
        driver.findElement(jsPromptButton).click();
    }

    public void enterPromptText(String prompttext)
    {
        driver.switchTo().alert().sendKeys(prompttext);
        acceptAlert();
    }

    public String getResult()
    {
      return driver.findElement(result).getText();
    }

}
