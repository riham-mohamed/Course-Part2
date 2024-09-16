package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckBoxesPage

{
    WebDriver driver;
    public CheckBoxesPage(WebDriver driver)
    {
        this.driver=driver;
    }

    private final By CheckBox1 = By.xpath("//form[@id='checkboxes']/input[1]");
    private final By CheckBox2 = By.xpath("//form[@id='checkboxes']/input[2]");

    public boolean SelectCheckBox1()
    {
        driver.findElement(CheckBox1).click();
        return true;
    }

    public boolean SelectCheckBox2()
    {
        driver.findElement(CheckBox2).click();
        return true;
    }
}
