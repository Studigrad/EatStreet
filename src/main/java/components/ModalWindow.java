package components;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.BasePage;

import java.time.Duration;
import java.util.List;

public class ModalWindow extends BasePage {
   public WebDriverWait wait;

    public ModalWindow(WebDriver driver) {
        super(driver);
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    }
    public WebElement getEnterAddressBtn(){
        WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@id=\"enter-address-btn\"]")));
        return element;
    }
    public void clickBtn(WebElement btn){
        btn.click();
    }
}
