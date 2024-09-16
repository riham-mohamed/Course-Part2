package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FileUploadLink {

    WebDriver driver;

    public FileUploadLink(WebDriver driver)
    {
        this.driver=driver;
    }
    private final By FileUploadLink = By.linkText("File Upload");

    public FileUploadPage clickOnFileUploadLink()
    {
        driver.findElement(FileUploadLink).click();
        return new FileUploadPage(driver);
    }
}
