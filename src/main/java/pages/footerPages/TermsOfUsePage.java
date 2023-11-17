package pages.footerPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.BasePage;

public class TermsOfUsePage extends BasePage {
    public TermsOfUsePage(WebDriver driver) {
        super(driver);
    }

    public WebElement textTermsOfUse() {
        return findByXpath("//div[@class='widget-header widget-header--checkout']");
    }
}
