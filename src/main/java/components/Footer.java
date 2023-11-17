package components;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.BasePage;
import pages.footerPages.CustomersPage;
import pages.footerPages.GetEatStreetPage;
import pages.footerPages.GetHelpPage;
import pages.footerPages.RestaurantDashboardPage;
import pages.footerPages.PrivacyPolicyPage;


public class Footer extends BasePage {

    public Footer(WebDriver driver) {
        super(driver);
    }

    public WebElement forCustomersButtom() {
        return findByXpath("//a[text()='For Customers']");
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
        privacyPolicyBtn().click();
        return new PrivacyPolicyPage(driver);

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

    public CustomersPage clickforCustomers() {
        forCustomersButtom().click();
        return new CustomersPage(driver);
    }

    public RestaurantDashboardPage clickRestaurantDashboard(){
      restaurantDashboardButtom().click();
      return new RestaurantDashboardPage();
    }

    public GetEatStreetPage clickGetEatStreet(){
        getEatStreetButtom().click();
        return new GetEatStreetPage();
    }
    public GetHelpPage clickGetHelpButton(){
        getHelpButton().click();
        return new GetHelpPage();
    }

}

