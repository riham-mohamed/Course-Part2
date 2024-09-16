package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class StatusCode404Page {

    WebDriver driver;

    public StatusCode404Page(WebDriver driver)
    {
        this.driver=driver;
    }

    private final By StatusCode404Message = By.xpath("//p[contains(text(),'status')]");

    public String getStatusCode404Message()
    {
       return driver.findElement(StatusCode404Message).getText();
    }
}
