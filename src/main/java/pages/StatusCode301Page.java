package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class StatusCode301Page
{
    WebDriver driver;

    public StatusCode301Page(WebDriver driver)
    {
        this.driver=driver;
    }

    private final By StatusCode301Message = By.xpath("//p[contains(text(),'status')]");

    public String getStatusCode301Message()
    {
        return driver.findElement(StatusCode301Message).getText();
    }
}
