package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.*;

public class BaseTests {
    protected WebDriver driver;
    protected HomePage homePage;
    protected CheckBoxPage checkboxpage;
    protected ForgotPasswordLink forgotpasswordlink;
    protected FileUploadLink fileUploadLink;
    protected StatusCodesLink statuscodeslink;
    //protected EntryAdLink entryadlink;

    @BeforeClass
    public void setUp()
    {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        homePage = new HomePage(driver);
        checkboxpage = new CheckBoxPage(driver);
        forgotpasswordlink = new ForgotPasswordLink(driver);
        fileUploadLink = new FileUploadLink(driver);
        statuscodeslink = new StatusCodesLink(driver);
        //entryadlink = new EntryAdLink(driver);


        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @AfterClass
    public void tearDown()
    {
        driver.quit();
    }

    @BeforeMethod
    public void goHome()
    {
        driver.get("https://the-internet.herokuapp.com/");
    }
}
