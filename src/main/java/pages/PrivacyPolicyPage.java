package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PrivacyPolicyPage extends BasePage {
    public WebElement textEatStreetPrivacyPolicy() {
        return findByXpath("//div[@class='widget-header widget-header--checkout']");
    }
    public PrivacyPolicyPage(WebDriver driver) {
        super(driver);
    }



}
