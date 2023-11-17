package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GetTheApp extends BasePage{

    public GetTheApp(WebDriver driver) {
        super(driver);
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



   private WebElement site(){
        return findByXpath("//a[text()='Get The App']");
   }
    private WebElement iphone(){
        return findByXpath("//label[@class='label-ios']");
    }
    private WebElement android(){
        return findByXpath("//label[@class='label-android']");
    }
    public String iphoneTextBtnText(){
        return findByXpath("//a[text()='Text iPhone Link']").getText();
    }
    public String androidTextBtntext(){
        return findByXpath("//a[text()='Text Android Link']").getText();
    }
    public String textVisible(){
     return findByXpath("//header[text()='Food in a Snap of the App!']").getText();
    }



    public GetTheApp IphoneBtn(){
        iphone().click();
        return this;
    }

    public GetTheApp AndroidBtn(){
        android().click();
        return this;
    }

    public GetTheApp NotificationBtn(){
        notifications().click();
        return this;
    }

    public GetTheApp PhoneNumberBtn(){
        phone().click();
        phone().sendKeys("484 246-7854");
        return this;
    }

    public GetTheApp TextLinkBtn(){
        link().click();
        return this;
    }
    public GetTheApp Opensite(){
        scroll(470);
        site().click();
        return this;
    }
    public GetTheApp GetTextFromIphoneBtn(){
        iphone().click();
        return this;
    }

    public GetTheApp GetTextFromAndroid(){
        android().click();
        return this;
    }
}
