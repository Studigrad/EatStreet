package components;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.BasePage;

public class Footer extends BasePage {
    public Footer(WebDriver driver) {
        super(driver);
    }

    public WebElement privacyPolicyBtn() {
        return findByXpath("//a[@ui-sref='privacy']");

    }

    public WebElement termsOfUseBtn() {
        return findByXpath("//a[@ui-sref='terms']");
    }

    public WebElement doNotSellOrShareMyPersonalInformationBtn() {
        return findByXpath("//a[@ng-click='linkToDataOptOut()']");
    }

    public WebElement restaurantTermsBtn() {
        return findByXpath("//a[@ui-sref='restaurant-terms-of-service']");
    }

    public WebElement googlePlayBtn() {
        return findByXpath("//a[@class='app-btn-android']");
    }

    public WebElement appStoreBtn() {
        return findByXpath("//a[@class='app-btn-iphone']");
    }

    public Footer clikPrivacyPolicyBtn() {
        privacyPolicyBtn().click();
        return this;
    }

    public Footer clikTermsOfUseBtn() {
        termsOfUseBtn().click();
        return this;
    }
    public Footer clikDoNotSellOrShareMyPersonalInformationBtn() {
        doNotSellOrShareMyPersonalInformationBtn().click();
        return this;
    }
    public Footer clikRestaurantTermsBtn() {
        restaurantTermsBtn().click();
        return this;
    }
    public Footer clikGooglePlayBtn() {
        googlePlayBtn().click();
        return this;
    }
    public Footer clikAppStoreBtn() {
        appStoreBtn().click();
        return this;
    }
}