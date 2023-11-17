package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SearchPage extends BasePage{

    public SearchPage(WebDriver driver) {
        super(driver);
    }
    public void clickSortByBtn(){
        findByXpath("//button[@class=\"custom_dropdown_button\"]").click();
    }
    private List<WebElement> sortByElementsList(){
        return findsByXpath("//div[@class=\"custom_dropdown_content\"]/button");
    }
    public WebElement matchingResult(){
        return findByXpath("//p[@class=\"ng-binding ng-scope\"]");
    }
    private List<WebElement> getListOfRestaurants(){
        return findsByXpath("//ul[@class=\"list list--rest-list margin-bottom-20\"]/li");
    }
    private WebElement deliveryRadioBtn(){
        return findByXpath("//input[@id=\"filters-checkbox-delivery\"]");
    }
    private WebElement takeoutRadioBtn(){
        return findByXpath("//input[@id=\"filters-checkbox-takeout\"]");
    }
    private List<WebElement> filterSectionList(){
        return findsByXpath("//div[@class=\"row filters-section ng-scope\"]/div");
    }
    public void clickFilterBtnByIndex(int index){
        filterSectionList().get(index-1).click();
    }

    public WebElement getRestaurantByIndex(int index){
       return getListOfRestaurants().get(index-1);
    }
    public void clickSortByElementByIndex(int index){
        sortByElementsList().get(index-1).click();
    }
    public void clickOrderForRadioBtn(int index){
        switch (index) {
            case 1 -> deliveryRadioBtn().click();
            case 2 -> takeoutRadioBtn().click();
            default -> {
                if (deliveryRadioBtn().isSelected()) {
                    takeoutRadioBtn().click();
                } else {
                    deliveryRadioBtn().click();
                }
            }
        }
    }
}
