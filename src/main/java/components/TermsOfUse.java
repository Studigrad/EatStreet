package components;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.BasePage;

public class TermsOfUse extends BasePage {
    public TermsOfUse(WebDriver driver) {
        super(driver);
    }

    public WebElement acceptBtn(){
        return findByXpath("//div[@class=\"ccpa-notice-container\"]/button[@class=\"btn\"]");
    }
    public void clickAcceptTermsBtn(){
        acceptBtn().click();
    }
}
