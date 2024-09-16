package frame;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.FramePage;

public class FrameTests

{
    WebDriver driver;
    FramePage framepage;

    @BeforeMethod

    public void setUp()
    {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.automationtesting.in/Frames.html");
        framepage = new FramePage(driver);
    }

    @Test
    public void testFrame()
    {
     framepage.insertText("I am testing");
    }

    @AfterMethod

    public void tearDown()
    {
        driver.quit();
    }
}
