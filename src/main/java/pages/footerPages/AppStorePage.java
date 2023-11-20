package pages.footerPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.BasePage;

import java.util.ArrayList;
import java.util.List;

public class AppStorePage extends BasePage {
    public AppStorePage(WebDriver driver) {
        super(driver);
    }

    public WebElement textAppStore() {
        return findByXpath("//h1[@class='product-header__title app-header__title']");
    }

    public void windowHandlesApp() {
        List<String> windowHandles = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(windowHandles.get(1));
    }
}
