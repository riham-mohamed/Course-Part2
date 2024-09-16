package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FileUploadPage {

    WebDriver driver;

    public FileUploadPage(WebDriver driver) {
        this.driver=driver;
    }

    private final By chooseFileField = By.id("file-upload");
    private final By uploadFileField = By.cssSelector("#file-submit");

    public void Selectfile(String filepath)
    {
        driver.findElement(chooseFileField).sendKeys(filepath);
    }

    public SuccessUploadPage clickOnUploadFileButton()
    {
        driver.findElement(uploadFileField).click();
        return new SuccessUploadPage(driver);
    }
}
