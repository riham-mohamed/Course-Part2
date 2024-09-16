package fileUpload;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.FileUploadPage;
import pages.SuccessUploadPage;

import static org.testng.Assert.assertEquals;

public class FileUpload extends BaseTests {

    @Test
    public void testFileUpload()
    {
     //driver.findElement(By.linkText("File Upload")).click();
     FileUploadPage fileUploadPage = fileUploadLink.clickOnFileUploadLink();
     //driver.findElement(By.id("file-upload")).sendKeys("C:\\Users\\User\\Desktop\\shahid.png");
     fileUploadPage.Selectfile("C:\\Users\\User\\Desktop\\shahid.png");
     //driver.findElement(By.cssSelector("#file-submit")).click();
     SuccessUploadPage successUploadPage = fileUploadPage.clickOnUploadFileButton();
     //String expectedmsg = driver.findElement(By.cssSelector(".panel")).getText();
     String expectedmsg = successUploadPage.getSuccessUploadMessage();
     String actualmsg = "shahid.png";
assertEquals(actualmsg,expectedmsg);
    }
}
