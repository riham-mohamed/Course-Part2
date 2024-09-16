package statusCodes;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.*;

import static org.testng.Assert.assertTrue;

public class StatusCode extends BaseTests {
    
    @Test
    public void testStatusCode200()
    {
        //driver.findElement(By.xpath("//a[contains(text(),'Status')]")).click();
        StatusCodesPage statuscodespage = statuscodeslink.clickOnStatusCodesLink();
        //driver.findElement(By.xpath("//a[contains(text(),'200')]")).click();
        StatusCode200Page statuscode200page = statuscodespage.clickOnStatusCode200();
        //String expected200msg = driver.findElement(By.xpath("//p[contains(text(),'status')]")).getText();
        String expected200msg = statuscode200page.getStatusCode200Message();
        assertTrue(expected200msg.contains("This page returned a 200 status code."));
    }

    @Test
    public void testStatusCode301()
    {
        //driver.get("https://the-internet.herokuapp.com/status_codes");
        StatusCodesPage statuscodespage = statuscodeslink.clickOnStatusCodesLink();
        //driver.findElement(By.xpath("//a[contains(text(),'301')]")).click();
        StatusCode301Page statuscode301page = statuscodespage.clickOnStatusCode301();
        //String expected301msg = driver.findElement(By.xpath("//p[contains(text(),'status')]")).getText();
       String expected301msg = statuscode301page.getStatusCode301Message();
        assertTrue(expected301msg.contains("This page returned a 301 status code."));
    }
    @Test
    public void testStatusCode404()
    {
        //driver.get("https://the-internet.herokuapp.com/status_codes");
        StatusCodesPage statuscodespage = statuscodeslink.clickOnStatusCodesLink();
        //driver.findElement(By.xpath("//a[contains(text(),'404')]")).click();
        StatusCode404Page statuscode404page = statuscodespage.clickOnStatusCode404();
        //String expected404msg = driver.findElement(By.xpath("//p[contains(text(),'status')]")).getText();
       String expected404msg = statuscode404page.getStatusCode404Message();
        assertTrue(expected404msg.contains("This page returned a 404 status code."));

    }
    @Test
    public void testStatusCode500()
    {
        //driver.get("https://the-internet.herokuapp.com/status_codes");
        StatusCodesPage statuscodespage = statuscodeslink.clickOnStatusCodesLink();
        //driver.findElement(By.xpath("//a[contains(text(),'500')]")).click();
        StatusCode500Page statuscode500page = statuscodespage.clickOnStatusCode500();
        //String expected500msg = driver.findElement(By.xpath("//p[contains(text(),'status')]")).getText();
        String expected500msg = statuscode500page.getStatusCode500Message();
        assertTrue(expected500msg.contains("This page returned a 500 status code."));
    }
}
