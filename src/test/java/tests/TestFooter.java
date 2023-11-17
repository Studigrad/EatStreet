package tests;

import components.Footer;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.PrivacyPolicyPage;

public class TestFooter extends TestInit {
    @Test
    public void checkPrivacyPolicyInSectionLegal() {
        Footer footer = new Footer(getDriver());
        PrivacyPolicyPage privacyPolicyPage = new PrivacyPolicyPage(getDriver());
        footer.scroll(3000);
        footer.clickPrivacyPolicyBtn();
        Assert.assertTrue(privacyPolicyPage.textEatStreetPrivacyPolicy().getText().contains("EatStreet Privacy Policy"));
    }
}

