package alert;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.JSAlertPage;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class JSAlertsTests extends BaseTests
{
    @Test

    public void testAcceptAlert()
    {
        JSAlertPage jsalertpage = homePage.clickOnJSAlertLink();
        //var JSAlertPage = homePage.clickOnJSAlertLink();
        jsalertpage.clickOnJSAlertButton();
        jsalertpage.acceptAlert();
        String expectedResult = "You successfully clicked an alert";
        String actualResult = jsalertpage.getResult();
        assertEquals(actualResult,expectedResult);
    }

    @Test
    public void testConfirmAlert()
    {
        JSAlertPage jsalertpage = homePage.clickOnJSAlertLink();
        jsalertpage.clickOnJSConfirmButton();
        jsalertpage.acceptAlert();
        String expectedresult = "You clicked: Ok";
        String actualresult = jsalertpage.getResult();
        assertEquals(actualresult,expectedresult);
    }
    @Test
    public void testDismissAlert()
    {
        JSAlertPage jsalertpage = homePage.clickOnJSAlertLink();
        jsalertpage.clickOnJSConfirmButton();
        jsalertpage.dismissAlert();
        String expectedresult = "You clicked: Cancel";
        String actualresult = jsalertpage.getResult();
        assertEquals(actualresult,expectedresult);
    }

    @Test
    public void testEnterPromptText()
    {
        JSAlertPage jsalertpage = homePage.clickOnJSAlertLink();
        jsalertpage.clickOnJSPromptButton();
        String enteredText = "testing";
        jsalertpage.enterPromptText(enteredText);
        String actualresult = jsalertpage.getResult();
        assertTrue(actualresult.contains("You entered:"));
        assertEquals("You entered: " + enteredText, actualresult);

    }

}
