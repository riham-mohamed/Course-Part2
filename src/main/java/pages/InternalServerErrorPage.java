package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InternalServerErrorPage {

    WebDriver driver;

    public InternalServerErrorPage(WebDriver driver) {
        this.driver=driver;
    }

    private final By InternalServerErrorMessage = By.xpath("//h1[contains(text(),'Internal')]");

    public String getInternalServerErrorMessage()
    {
        return driver.findElement(InternalServerErrorMessage).getText();
    }
}
