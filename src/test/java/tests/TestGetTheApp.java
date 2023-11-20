package tests;

import components.Footer;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.footerPages.AppStorePage;
import pages.footerPages.GooglePlayPage;

public class TestGetTheApp extends TestInit {
    private Footer footer;
    private GooglePlayPage googlePlayPage;
    private AppStorePage appStorePage;

    @BeforeMethod
    public void openFooter() {
        footer = new Footer(getDriver());
        googlePlayPage = new GooglePlayPage(getDriver());
        appStorePage = new AppStorePage(getDriver());

    }

    @Test
    public void checkGooglePlay() {
        footer.clickGooglePlayBtn();
        googlePlayPage.windowHandlesGoogle();

        Assert.assertTrue(googlePlayPage.textGooglePlay().getText().contains("google_logo Play"));
    }

    @Test
    public void checkAppStore() {
        footer.clickAppStoreBtn();
        appStorePage.windowHandlesApp();

        Assert.assertTrue(appStorePage.textAppStore().getText().contains("EatStreet Local Food Delivery"));

    }
}
