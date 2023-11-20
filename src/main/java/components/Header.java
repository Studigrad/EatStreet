package components;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.BasePage;

public class Header extends BasePage {

    public Header(WebDriver driver) {
        super(driver);
    }

    public WebElement getLogo() {
        return findByXpath("//a/img[@class= 'logo-alternate']");
    }

    public WebElement getPartnership() {
        return findByXpath("//a[@class= 'partners-link ng-scope']");
    }

    public WebElement getSingInBtn() {
        return findByXpath("//div[@class=\"is-clickable\"]");
    }

    public WebElement getCartBtn() {
        return findByXpath("//div[@role=\"button\"]");
    }

    public WebElement getLogo2() {
        return findByXpath("//a/img[@class= 'logo-alternate']");
    }

    public WebElement getAddressField() {
        return findByXpath("//div/input[@id= 'address-input']");
    }

    public WebElement getSearchRestaurantField() {
        return findByXpath("//div/input[@id= 'search-autocomplete']");
    }
}

