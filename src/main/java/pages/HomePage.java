package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage{
    public HomePage(WebDriver driver){
        super(driver);
    }
    public WebElement SearchField(){
        return findByXpath("//*[@id=\"input-food-search\"]");  // Пошукове поле
    }

    public WebElement Logo(){
        return findByXpath("//img[@src=\"https://static.eatstreet.com/redesign/img/logos/es-logo-with-trademark.svg\"]"); // Логотип номер 1
    }

    public WebElement Cart(){
        return findByXpath("//div/img[@src=\"https://static.eatstreet.com/assets/images/icons/icon-nav-cart.svg\"]"); // Корзина
    }
}
