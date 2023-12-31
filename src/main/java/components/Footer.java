package components;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.*;
import pages.footerPages.*;

public class Footer extends BasePage {

    public Footer(WebDriver driver) {
        super(driver);
    }

    public WebElement forCustomersButtom() {
        return findByXpath("//a[@href='https://eatst.force.com/customers']");
    }

    public WebElement restaurantDashboardButtom() {
        return findByXpath("//a[@ng-click='linkToDashboardSupport()']");
    }

    public WebElement getEatStreetButtom() {
        return findByXpath("//a[@target = '_blank'][@href='http://geteatstreet.com/']");
    }

    public WebElement getHelpButton() {
        return findByXpath("//a[@ng-click='getHelp()'][text()='Get Help']");
    }

    public CustomersPage clickforCustomers() {
        forCustomersButtom().click();
        return new CustomersPage(driver);
    }

    public RestaurantDashboardPage clickRestaurantDashboard() {
        restaurantDashboardButtom().click();
        return new RestaurantDashboardPage();
    }

    public GetEatStreetPage clickGetEatStreet() {
        getEatStreetButtom().click();
        return new GetEatStreetPage();
    }

    public GetHelpPage clickGetHelpButton() {
        getHelpButton().click();
        return new GetHelpPage();
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

    public PrivacyPolicyPage clickPrivacyPolicyBtn() {
        scroll(3000);
        privacyPolicyBtn().click();
        return new PrivacyPolicyPage(driver);
    }

    public TermsOfUsePage clickTermsOfUseBtn() {
        scroll(3000);
        termsOfUseBtn().click();
        return new TermsOfUsePage(driver);
    }

    public PrivacyPolicyPage clickDoNotSellOrShareMyPersonalInformationBtn() {
        scroll(3000);
        doNotSellOrShareMyPersonalInformationBtn().click();
        return new PrivacyPolicyPage(driver);
    }

    public  RestaurantTermsPage clickRestaurantTermsBtn() {
        scroll(3000);
        restaurantTermsBtn().click();
        return new RestaurantTermsPage(driver);
    }

    public GooglePlayPage clickGooglePlayBtn() {
        scroll(3000);
        googlePlayBtn().click();
        return new GooglePlayPage(driver);
    }

    public AppStorePage clickAppStoreBtn() {
        scroll(3000);
        appStoreBtn().click();
        return new AppStorePage(driver);
    }

    public WebElement getBtnAboutUs() {
        return findByXpath("//a[@ui-sref='about-us']");
    }

    public Footer clickAboutUsBtn() {
        scroll(3000);
        getBtnAboutUs().click();
        return this;
    }
}

