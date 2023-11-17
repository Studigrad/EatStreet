package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class CartPage extends BasePage {

    public CartPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getCheckCartStatus(){
        return  findByXpath("//p[@class='cart-empty-text font-family-museo-slab font-size-16']");
    }


    public WebElement clickOnButton(){
        return findByXpath("//A[@class]");
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
