package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class RestaurantPage extends BasePage{

    public RestaurantPage(WebDriver driver) {
        super(driver);
    }

    public List<WebElement> listAllRestaurants(){
        return findsByXpath("//li[@class=\"cuisine-types__item\"]");
    }
    public void clickListAllRestaurants(int index){
        listAllRestaurants().get(index - 1).click();
    }
}
