package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    WebDriver driver;

    public HomePage(WebDriver driver)
    {
        this.driver=driver;
    }

    private final By formAuthenticationLink = By.linkText("Form Authentication");

    private final By dynamicLoadingLink = By.linkText("Dynamic Loading");

    private final By dropDownLink = By.linkText("Dropdown");

    private final By jsAlertLink = By.linkText("JavaScript Alerts");

    private final By entryAdLink = By.linkText("Entry Ad");

    private final By hoverLink = By.linkText("Hovers");

    private final By dragAndDropLink = By.linkText("Drag and Drop");


public LoginPage clickOnFormAuthenticationLink()
{
    driver.findElement(formAuthenticationLink).click();
    return new LoginPage(driver);
}

public DynamicLoadingPage clickOnDynamicLoadingLink()
{
    driver.findElement(dynamicLoadingLink).click();
    return new DynamicLoadingPage(driver);
}


    public DropDownPage clickOnDropDownLink()
    {
        driver.findElement(dropDownLink).click();
        return new DropDownPage(driver);
    }

    public JSAlertPage clickOnJSAlertLink()
    {
        driver.findElement(jsAlertLink).click();
        return new JSAlertPage(driver);
    }

    public EntryAdPage clickOnEntryAdLink()
    {
        driver.findElement(entryAdLink).click();
        return new EntryAdPage(driver);
    }

    public HoverPage clickOnHoverLink()
    {
        driver.findElement(hoverLink).click();
        return new HoverPage(driver);
    }

    public DragAndDropPage clickOnDragAndDropLink()
    {
        driver.findElement(dragAndDropLink).click();
        return new DragAndDropPage(driver);
    }

}
