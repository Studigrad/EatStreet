package components;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.*;

public class Footer extends HomePage {
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
        return new CustomersPage();
    }

    public RestaurantDashboardPage clickRestaurantDashboard(){
      restaurantDashboardButtom().click();
      return  new RestaurantDashboardPage();
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
