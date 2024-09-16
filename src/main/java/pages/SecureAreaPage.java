package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;

public class SecureAreaPage {

    WebDriver driver;

    public SecureAreaPage(WebDriver driver) {
        this.driver=driver;
    }
    private final By validationMessage = By.cssSelector("div[id='flash']");

    public String getValidationMessage()
    {
        return driver.findElement(validationMessage).getText();
    }

}
