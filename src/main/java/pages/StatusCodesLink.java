package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class StatusCodesLink {

    WebDriver driver;

    public StatusCodesLink(WebDriver driver)
    {
    this.driver=driver;
    }

    private final By StatusCodesLink = By.xpath("//a[contains(text(),'Status')]");

    public StatusCodesPage clickOnStatusCodesLink()
    {
        driver.findElement(StatusCodesLink).click();
        return new StatusCodesPage(driver);
    }
}
