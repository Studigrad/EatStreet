package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Restaurants extends BasePage{

    public Restaurants(WebDriver driver){
        super(driver);
    }
    public List<WebElement> menuList(){
        return findsByXpath("//div[@class='menu-list ng-scope']");
    }
    public WebElement backToCity(){
        return findByXpath("//div[@ng-class='{'hero-unit--express-lunch' : menuCtrl.isExpressLunch(), 'hero-unit--menu-with-reviews' : !menuCtrl.isExpressLunch()}']");
    }
    public WebElement searchMenuField(){
        return findByXpath("//input[@class='margin-bottom-0 menu-search__input ng-pristine ng-untouched ng-valid ng-empty']");
    }
    public WebElement upScopeSomeCategory(){
        return findByXpath("//span[@class='angle-up ng-scope']");
    }
}
