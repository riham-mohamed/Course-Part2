package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SuccessUploadPage {

    WebDriver driver;

    public SuccessUploadPage(WebDriver driver)
    {
        this.driver=driver;
    }
    private final By getSuccessUploadMessage = By.cssSelector(".panel");

    public String getSuccessUploadMessage()
    {
        return driver.findElement(getSuccessUploadMessage).getText();
    }
}
