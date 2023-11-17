package tests;

import components.Footer;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.footerPages.PrivacyPolicyPage;
import pages.footerPages.TermsOfUsePage;

public class TestFooterLegal extends TestInit {

    private Footer footer;
    private PrivacyPolicyPage privacyPolicyPage;
    private TermsOfUsePage termsOfUsePage;

    @BeforeMethod
    public void openFooter() {
        footer = new Footer(getDriver());
        privacyPolicyPage = new PrivacyPolicyPage(getDriver());
        termsOfUsePage = new TermsOfUsePage(getDriver());
    }

    @Test
    public void checkPrivacyPolicyInSectionLegal() {
        footer.clickPrivacyPolicyBtn();

        Assert.assertTrue(privacyPolicyPage.textEatStreetPrivacyPolicy().getText().contains("EatStreet Privacy Policy"));
    }

    @Test
    public void checkTermsOfUse() {
        footer.clickTermsOfUseBtn();

        Assert.assertTrue(termsOfUsePage.textTermsOfUse().getText().contains("EatStreet Terms Of Use"));
    }
}

