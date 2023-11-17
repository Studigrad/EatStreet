package tests;

import components.Footer;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.footerPages.PrivacyPolicyPage;
import pages.footerPages.RestaurantTermsPage;
import pages.footerPages.TermsOfUsePage;

public class TestFooterLegal extends TestInit {

    private Footer footer;
    private PrivacyPolicyPage privacyPolicyPage;
    private TermsOfUsePage termsOfUsePage;
    private RestaurantTermsPage restaurantTermsPage;

    @BeforeMethod
    public void openFooter() {
        footer = new Footer(getDriver());
        privacyPolicyPage = new PrivacyPolicyPage(getDriver());
        termsOfUsePage = new TermsOfUsePage(getDriver());
        restaurantTermsPage = new RestaurantTermsPage(getDriver());
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

    @Test
    public void checkDoNotSellOrShareMyPersonalInformation() {
        footer.clickDoNotSellOrShareMyPersonalInformationBtn();

        Assert.assertTrue(privacyPolicyPage.redFrameInDoNotSellOrShareMyPersonalInformation().isDisplayed());
    }

    @Test
    public void checkRestaurantTerms() {
        footer.clickRestaurantTermsBtn();

        Assert.assertTrue(restaurantTermsPage.textRestaurantTerms().getText().contains("EatStreet Merchant Terms And Conditions"));
    }
}

