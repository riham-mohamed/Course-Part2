package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FramePage {

    WebDriver driver;

    public FramePage (WebDriver driver)
    {
        this.driver=driver;
    }

    String frame = "singleframe";

    private final By textField = By.xpath("(//input[@type=\"text\"])[1]");

    private void switchToFrame()
    {
        driver.switchTo().frame(frame);
    }

    private void switchToParent()
    {
        driver.switchTo().parentFrame();
    }

    public void insertText(String text)
    {
        switchToFrame();
        driver.findElement(textField).sendKeys(text);
        switchToParent();

    }
}
