package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SearchPage extends BasePage{

    public SearchPage(WebDriver driver) {
        super(driver);
    }

    public WebElement matchingResult(){
        return findByXpath("//p[@class=\"ng-binding ng-scope\"]");
    }

    private List<WebElement> getListOfRestaurants(){
        return findsByXpath("//ul[@class=\"list list--rest-list margin-bottom-20\"]/li");
    }

    public void chooseRestaurantByIndex(int index){
        getListOfRestaurants().get(index).click();
    }
}
