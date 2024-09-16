package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class StatusCode200Page {

    WebDriver driver;

    public StatusCode200Page(WebDriver driver)
    {
        this.driver=driver;
    }

    private final By StatusCode200Message = By.xpath("//p[contains(text(),'status')]");

    public String getStatusCode200Message()
    {
        return driver.findElement(StatusCode200Message).getText();
    }
}
