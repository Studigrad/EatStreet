package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchPage extends BasePage{

    public SearchPage(WebDriver driver) {
        super(driver);
    }

    public WebElement matchingResult(){
        return findByXpath("//p[@class=\"ng-binding ng-scope\"]");
    }


}
