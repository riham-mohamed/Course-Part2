package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckBoxPage {

    WebDriver driver;

    public CheckBoxPage(WebDriver driver)
    {
        this.driver=driver;
    }

    private final By CheckBoxLink = By.linkText("Checkboxes");

    public CheckBoxesPage ClickOnCheckBoxLink()
    {
        driver.findElement(CheckBoxLink).click();
        return new CheckBoxesPage(driver);
    }
}
