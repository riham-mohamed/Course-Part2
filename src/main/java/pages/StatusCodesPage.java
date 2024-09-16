package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class StatusCodesPage {

    WebDriver driver;

    public StatusCodesPage(WebDriver driver)
    {
        this.driver=driver;
    }

    private final By StatusCode200Link = By.xpath("//a[contains(text(),'200')]");

    public StatusCode200Page clickOnStatusCode200()
    {
        driver.findElement(StatusCode200Link).click();
        return new StatusCode200Page(driver);
    }

    private final By StatusCode301Link = By.xpath("//a[contains(text(),'301')]");

    public StatusCode301Page clickOnStatusCode301()
    {
        driver.findElement(StatusCode301Link).click();
        return new StatusCode301Page(driver);
    }

    private final By StatusCode404Page = By.xpath("//a[contains(text(),'404')]");

    public StatusCode404Page clickOnStatusCode404()
    {
        driver.findElement(StatusCode404Page).click();
        return new StatusCode404Page(driver);
    }

    private final By StatusCode500Page = By.xpath("//a[contains(text(),'500')]");

    public StatusCode500Page clickOnStatusCode500()
    {
       driver.findElement(StatusCode500Page).click();
       return new StatusCode500Page(driver);
    }

}
