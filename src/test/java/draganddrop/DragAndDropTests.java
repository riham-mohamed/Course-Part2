package draganddrop;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.DragAndDropPage;

public class DragAndDropTests extends BaseTests
{
    @Test

    public void testDragAndDrop()
    {
       DragAndDropPage draganddroppage =  homePage.clickOnDragAndDropLink();
       draganddroppage.dragAndDrop();
       draganddroppage.dragAndDrop2();
    }
    @Test
    public void testDragAndDrop2()
    {
        DragAndDropPage draganddroppage =  homePage.clickOnDragAndDropLink();
        draganddroppage.dragAndDrop2();
    }
}
