package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class CartPage extends BasePage {


    public CartPage(WebDriver driver) {
        super(driver);
    }

    public void navigate(String link) {
        driver.get(link);
    }

    public WebElement getCheckCart() {
        return elementByXpath("//div[@title='Click here to view your cart.']");
    }

    public WebElement getCheckCartStatus() {
        return elementByXpath("//p[@class='cart-empty-text font-family-museo-slab font-size-16']");
    }

    public WebElement getCheckDelivery() {
        return elementByXpath("//div/label[@id='delivery-checkbox']");
    }

    public WebElement getCheckTakeout() {
        return elementByXpath("//div/label [@id='takeout-checkbox']");
    }

    public WebElement getCheckOutOrder() {
        return elementByXpath("//a[@id='click-checkout']");
    }

    public WebElement getEnterOderDataName() {
        return elementByXpath("//div/input[@id='firstName']");
    }

    public WebElement getEnterOrderDataSurname() {
        return elementByXpath("//div/input[@name='lastName']");
    }

    public WebElement getenterOrderDataPhoneNum() {
        return elementByXpath("//div/input[@name='phoneNumber']");
    }

    public WebElement getEnterOrderDataAPT() {
        return elementByXpath("//div/input[@name='aptNumber']");
    }

    public WebElement getenterOrderDataBilding() {
        return elementByXpath("//div/input[@name='buildingName']");
    }

    public WebElement getclickTakeoutBtn() {
        return elementByXpath("//div/label[@title='Click here to order takeout.']");
    }

    public WebElement getclickDeliveryBtn() {
        return elementByXpath("//div/label[@id='radio-delivery-btn']");
    }

    public WebElement getchooseTimeDelivery() {
        return elementByXpath("//div/select[@class='time-select ng-pristine ng-touched']");
    }

    public WebElement getEnterOrderInstruction() {
        return elementByXpath("//div/label/textarea[@name='comments']");
    }

    public WebElement getClickBackToMenuBtn() {
        return elementByXpath("//div/a[@class='btn btn-primary float-left']");
    }

    public WebElement getClickContinueOrder() {
        return elementByXpath("//div/button[@id='continue']");
    }

    //public WebElement getEnter
    public WebElement elementByXpath(String locator) {
        return findByXpath(locator);// елемент
    }


    public WebElement clickOnButton() {
        return elementByXpath("//A[@class]");
    }


    //    public List<WebElement> elementsByXpath(String locator){
//        return findsByXpath(locator);// елементи
//    }


//    @Override
//    public WebElement getChooseCity(){
//        return driver.findElement(By.xpath(""));
//
//    }
}
