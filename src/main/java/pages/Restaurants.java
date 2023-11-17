package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Restaurants extends BasePage{

    public Restaurants(WebDriver driver) {
        super(driver);
    }

    //Order for
    public WebElement deliveryRadioButton(){
        return findByXpath("//input[@id=\"filters-checkbox-delivery\"]");
    }

    public WebElement takeoutRadioButton(){
        return findByXpath("//input[@id=\"filters-checkbox-takeout\"]");
    }

    public WebElement freeDeliveryButton(){
        return findByXpath("//label[@for=\"filter-Free Delivery\"]");
    }

    public WebElement rating4PlusButton(){
        return findByXpath("//label[@for=\"filter-Rating 4+\"]");
    }

    public WebElement orderAheadButton(){
        return findByXpath("//label[@for=\"filter-Order Ahead\"]");
    }
    //Categories
    public List<WebElement> categories(){
        return findsByXpath("//div[@class=\"row filters-section\"]");
    }
    //Sort by (Button)
    public WebElement sortByButton(){
        return findByXpath("//div[@es-container=\"sortByRestaurants\"]");
    }
    //Sort by elements
    public WebElement alphabeticalSort(){
        return findByXpath("//button[@aria-label=\"alphabetical\"]");
    }
    public WebElement etaSort(){
        return findByXpath("//button[@aria-label=\"eta\"]");
    }
    public WebElement distanceSort(){
        return findByXpath("//button[@aria-label=\"distance\"]");
    }
    public WebElement ratingSort(){
        return findByXpath("//button[@aria-label=\"rating\"]");
    }
    public WebElement deliveryFeeSort(){
        return findByXpath("//button[@aria-label=\"delivery_fee\"]");
    }
    //All restaurants list
    public List<WebElement> allRests(){
        return findsByXpath("//ul[@id=\"all-rests\"]");
    }
    //View more
    public WebElement loadMoreRestaurants(){
        return findByXpath("//button[@ng-click=\"$ctrl.viewMoreRestaurants()\"]");
    }
}
