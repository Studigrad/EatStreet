package tests;

import components.Footer;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.footerPages.AboutUsPage;

public class TestFooterEatStreet extends TestInit {

    private Footer footer;
    private AboutUsPage aboutUsPage;

    @BeforeMethod
    public void openFooter() {
        footer = new Footer(getDriver());
        aboutUsPage = new AboutUsPage(getDriver());
    }

    @Test
    public void checkAboutUs() {
        footer.clickAboutUsBtn();

        Assert.assertEquals(footer.getBtnAboutUs().getText(),
                aboutUsPage.getTextAboutUsPage().getText());
    }
}
