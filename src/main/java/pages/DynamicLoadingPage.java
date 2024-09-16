package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DynamicLoadingPage {

    WebDriver driver;

    public DynamicLoadingPage(WebDriver driver)
    {
        this.driver=driver;
    }

    private final By exampleOneLink = By.partialLinkText("Example 1");

    public ExampleOnePage clickOnExampleLink()
    {
        driver.findElement(exampleOneLink).click();
        return new ExampleOnePage(driver);
    }

    private final By exampleTwoLink = By.partialLinkText("Example 2");

    public ExampleTwoPage clickOnExample2Link()
    {
        driver.findElement(exampleTwoLink).click();
        return new ExampleTwoPage(driver);
    }

}
