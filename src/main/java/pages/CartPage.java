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

    public void navigate (String link){driver.get(link);}

    public WebElement getCheckCart(){
        return  elementByXpath("//div[@title='Click here to view your cart.']");
    }
    public WebElement getCheckCartStatus(){
        return  elementByXpath("//p[@class='cart-empty-text font-family-museo-slab font-size-16']");
    }
    public WebElement elementByXpath(String locator){
        return findByXpath(locator);// елемент
    }


    public WebElement clickOnButton(){
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
