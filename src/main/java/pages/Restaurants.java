package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Restaurants extends BasePage{

    public Restaurants(WebDriver driver){
        super(driver);
    }
    public List<WebElement> menuListCategory(){
        return findsByXpath("//summary[@class='list-header margin-bottom-10']");
    }
    public void clickMenuListCategory(int index){
        menuListCategory().get(index - 1).click();
    }
    public List<WebElement> menuList(){
        return findsByXpath("//div[@class='is-clickable product-container']");
    }
    public void clickMenuList(int index){
        menuList().get(index - 1).click();
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

    public WebElement statusRestaurants(){
        return findByXpath("//span[@class=\"restaurant__info__list__item__detail ng-binding ng-scope\"]");
    }
    public int ratingIsFourStar(){
        List<WebElement> elements = findsByXpath("//div[@class='es-star es-star__4']");
        return elements.size();
    }
}
