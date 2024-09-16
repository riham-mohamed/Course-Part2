package checkBoxes;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.CheckBoxesPage;

import static org.testng.Assert.assertTrue;

public class CheckBoxesTestCases extends BaseTests {

@Test(priority = 1)
    public void testSelectCheckBoxes()
{
    CheckBoxesPage checkboxespage = checkboxpage.ClickOnCheckBoxLink();
    //driver.findElement(By.linkText("Checkboxes")).click();
    //WebElement checkbox1 = driver.findElement(By.xpath("//form[@id='checkboxes']/input[1]"));
    //checkbox1.click();
    boolean checkBoxOne = checkboxespage.SelectCheckBox1();
    assertTrue(checkBoxOne);

  //  WebElement checkbox2 = driver.findElement(By.xpath("//form[@id='checkboxes']/input[2]"));
   boolean checkBoxTwo = checkboxespage.SelectCheckBox2();
    assertTrue(checkBoxTwo);
}
}
