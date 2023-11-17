package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver){
        super(driver);
    }

    public WebElement partnerWithUsLearnMore(){
        return findByXpath("//a[@href=\"http://geteatstreet.com/?_gl=1*yy012k*_ga*MTIxMDM3MDA3LjE2OTk5NjQ2NTg.*_ga_0Q57ZKP42S*MTcwMDEyNzk2Ny4xMC4xLjE3MDAxMjgwMjYuMC4wLjA.\"]");
    }

    public WebElement partnerWithUsApplyNow(){
        return findByXpath("//a[@ui-sref=\"careers\"]");
    }

    public WebElement partnerWithUsGetTheUp(){
        return findByXpath("//a[@href=\"/get-the-app\"]");
    }

    public WebElement takeoutMode(){
        return findByXpath("//label[@for=\"home-checkbox-takeout\"]");
    }

    public WebElement deliveryMode(){
        return findByXpath("//label[@for=\"home-checkbox-delivery\"]");
    }

    public WebElement useMyLocation(){
        return findByXpath("//div[@title=\"Use my location\"]");
    }

    public WebElement getFedButton(){
        return findByXpath("//a[@id=\"find-restaurants\"]");
    }

    public WebElement logoWeDeliverYouDevour(){
        return findByXpath("//section[@class=\"text-center landing-callout--image promo_text\"]");
    }

    public WebElement enterYourEmailAddressField(){
        return findByXpath("//input[@id=\"new-email\"]");
    }

    public WebElement signUpButton(){
        return findByXpath("//button[@type=\"submit\"]");
    }
    public WebElement searchField(){
        return findByXpath("//input[@placeholder=\"Enter Your Address\"]");  // Пошукове поле
    }
    public void findInSearchField(String text){
        searchField().sendKeys(text+"\n");
    }

    public WebElement getCheckCart() {
        return findByXpath("//li[@class=\"is-clickable\"]");
    }

    public List<WebElement> cityLists(){
        return findsByXpath("//div[@class=\"cities-list\"]");
    }
}
