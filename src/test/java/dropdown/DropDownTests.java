package dropdown;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.DropDownPage;

import static org.testng.Assert.assertTrue;

public class DropDownTests extends BaseTests
{

    @Test
    public void testDropDownList()
    {
        DropDownPage dropdownpage = homePage.clickOnDropDownLink();
       dropdownpage.selectFromDropDownList("Option 1");
       String expected = dropdownpage.getDropDownValue();
       assertTrue(expected.contains("Option 1"));

        dropdownpage.selectFromDropDownList("Option 2");
        String expected2 = dropdownpage.getDropDownValue();
        assertTrue(expected2.contains("Option 2"));
    }


}
