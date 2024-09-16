package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class StatusCode500Page {

    WebDriver driver;

    public StatusCode500Page(WebDriver driver)
    {
        this.driver=driver;
    }

    private final By StatusCode500Message = By.xpath("//p[contains(text(),'status')]");

    public String getStatusCode500Message()
    {
        return driver.findElement(StatusCode500Message).getText();
    }
}
