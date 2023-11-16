package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CareersPage extends BasePage {
    public CareersPage(WebDriver driver) {
        super(driver);
    }

    public WebElement learnMoreButton(){
        return findByXpath("//a[@class=\"learn-more-link\"]");
    }

    public WebElement empInfoButton(){
        return findByXpath("//a[@class=\"empinfo-link\"]");
    }

}
