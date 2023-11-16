package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage{
    public HomePage(WebDriver driver){
        super(driver);
    }
    public WebElement findSearchField(){
        return findByXpath("//*[@id=\"input-food-search\"]");
    }
    public WebElement getCheckCart(){
        return  driver.findElement(By.xpath("//div[@title='Click here to view your cart.']"));
    }
}
