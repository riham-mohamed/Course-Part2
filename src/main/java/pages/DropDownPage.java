
package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownPage {

    WebDriver driver;
    Select select;

    public DropDownPage(WebDriver driver)
    {
        this.driver=driver;
    }

    private final By dropDownList = By.id("dropdown");

    public String selectFromDropDownList(String visibletext)
    {
        select = new Select(driver.findElement(dropDownList));
        select.selectByVisibleText(visibletext);
        return visibletext;
    }

    public String getDropDownValue()
    {
        return driver.findElement(dropDownList).getText();
    }

}
