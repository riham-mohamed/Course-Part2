package wait;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.DynamicLoadingPage;
import pages.ExampleOnePage;
import pages.ExampleTwoPage;

import static org.testng.Assert.assertEquals;

public class DynamicLoadingTests extends BaseTests
{
    @Test
    public void testWaitExampleOne()
    {
        DynamicLoadingPage dynamicloadingpage = homePage.clickOnDynamicLoadingLink();
        ExampleOnePage exampleonepage = dynamicloadingpage.clickOnExampleLink();
        exampleonepage.clickOnStartButton();
        String actualmessage = exampleonepage.getValidationMessage();
        String expectedmessage = "Hello World!";
        assertEquals(actualmessage,expectedmessage);
    }

    @Test
    public void testWaitExampleTwo()
    {
        //same as above but wait till green loader is disappeared
        DynamicLoadingPage dynamicloadingpage = homePage.clickOnDynamicLoadingLink();
        ExampleTwoPage exampletwopage = dynamicloadingpage.clickOnExample2Link();
        exampletwopage.clickOnStartButton();
        String actualmessage = exampletwopage.getValidationMessage();
        String expectedmessage = "Hello World!";
        assertEquals(actualmessage,expectedmessage);

    }
}
