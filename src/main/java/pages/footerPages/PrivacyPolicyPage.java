package pages.footerPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.BasePage;

public class PrivacyPolicyPage extends BasePage {
    public PrivacyPolicyPage(WebDriver driver) {
        super(driver);
    }

    public WebElement textEatStreetPrivacyPolicy() {
        return findByXpath("//div[@class='widget-header widget-header--checkout']");
    }
}
