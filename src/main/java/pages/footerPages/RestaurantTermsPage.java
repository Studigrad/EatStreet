package pages.footerPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.BasePage;

public class RestaurantTermsPage extends BasePage {
    public RestaurantTermsPage(WebDriver driver) {
        super(driver);
    }
    public WebElement textRestaurantTerms() {
        return findByXpath("//div[@class='widget-header widget-header--checkout']");
    }
}
