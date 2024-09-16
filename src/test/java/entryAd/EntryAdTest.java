package entryAd;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.EntryAdPage;

public class EntryAdTest extends BaseTests
{
@Test
public void testEntryAd()
{
    EntryAdPage entryadpage = homePage.clickOnEntryAdLink();
    entryadpage.clickOnCloseButton();
    entryadpage.clickOnClickHereButton();
}

}
