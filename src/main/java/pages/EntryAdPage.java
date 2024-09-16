package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class EntryAdPage
{
    WebDriver driver;

    public EntryAdPage(WebDriver driver)
    {

        this.driver=driver;
    }

    private final By RandomWindow = By.xpath("//h3[contains(text(),'modal')]");

    private final By CloseButton = By.xpath("//p[contains(text(),'Close')]");

    private final By ClickHereButton = By.xpath("//a[contains(text(),'click here')]");

    public void clickOnCloseButton()
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
        try {
            WebElement randomElement = wait.until(ExpectedConditions.visibilityOfElementLocated(RandomWindow));
            driver.findElement(CloseButton).click();
        }
        catch(Exception e)
        {
            System.out.println("Element not found within the timeout period");
        }
    }

    public void clickOnClickHereButton()
    {
        driver.findElement(ClickHereButton).click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        try {
            WebElement randomElement = wait.until(ExpectedConditions.visibilityOfElementLocated(RandomWindow));
            driver.findElement(CloseButton).click();
        }
        catch(Exception e)
        {
            System.out.println("Element not found within the timeout period");
        }
    }
}
