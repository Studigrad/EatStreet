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

    public Footer clickPrivacyPolicyBtn() {
        privacyPolicyBtn().click();
        return this;
    }

    public Footer clickTermsOfUseBtn() {
        termsOfUseBtn().click();
        return this;
    }
    public Footer clickDoNotSellOrShareMyPersonalInformationBtn() {
        doNotSellOrShareMyPersonalInformationBtn().click();
        return this;
    }
    public Footer clickRestaurantTermsBtn() {
        restaurantTermsBtn().click();
        return this;
    }
    public Footer clickGooglePlayBtn() {
        googlePlayBtn().click();
        return this;
    }
    public Footer clickAppStoreBtn() {
        appStoreBtn().click();
        return this;
    }
}