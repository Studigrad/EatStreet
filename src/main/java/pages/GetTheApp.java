package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GetTheApp extends BasePage{

    public GetTheApp(WebDriver driver) {
        super(driver);
    }
    private WebElement iphone(){
        return findByXpath("//label[@class='label-ios']");
    }
    private WebElement android(){
        return findByXpath("//label[@class='label-android']");
    }
    private WebElement notifications(){
        return findByXpath("//label[@class='checkbox-input']");
    }
    private WebElement phone(){
        return findByXpath("//input[@id='mobile-number']");
    }
    private WebElement link(){
        return findByXpath("//a[@class='btn btn--orange btn-text-link full-width ng-binding']");
    }
    private WebElement getTheAppPath(){
        return findByXpath("//a[@class='how-it-works_link'][text()='Get The App']");
    }

    public GetTheApp OpenLink(){
        getTheAppPath().click();
        return this;
    }

    public GetTheApp IphoneBtn(){
        iphone().click();
        return this;git
    }
    public GetTheApp AndroidBtn(){
        android().click();
        return this;
    }
    public GetTheApp ReceiveSMSNotification(){
        notifications().click();
        return this;
    }
    public GetTheApp PhoneNumber(){
        phone().click();
        phone().sendKeys("484 246-7854");
        return this;
    }
    public GetTheApp TextPhoneLink(){
        link().click();
        return this;
    }
}
