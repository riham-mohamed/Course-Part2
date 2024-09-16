package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ExampleTwoPage {
    WebDriver driver;
    WebDriverWait wait;

    public ExampleTwoPage(WebDriver driver)
    {
        this.driver=driver;
    }

    private final By startButton = By.cssSelector("#start  button");

    private final By validationMessage = By.cssSelector("#loading > img");

    private final By textMessage = By.cssSelector("#finish h4");

    public void clickOnStartButton()
    {
        driver.findElement(startButton).click();
    }

    public String getValidationMessage()
    {
        wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(validationMessage));
        wait.until(ExpectedConditions.invisibilityOf(driver.findElement(validationMessage)));
        WebElement element2 = driver.findElement(textMessage);
        return element2.getText();


    }

}
