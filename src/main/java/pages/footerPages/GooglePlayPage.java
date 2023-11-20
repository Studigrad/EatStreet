package pages.footerPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.BasePage;

import java.util.ArrayList;
import java.util.List;

public class GooglePlayPage extends BasePage {
    public GooglePlayPage(WebDriver driver) {
        super(driver);
    }

    public WebElement textGooglePlay() {
        return findByXpath("//span[text()='google_logo Play']");
    }

    public void windowHandlesGoogle() {
        List<String> windowHandles = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(windowHandles.get(1));

    }
}
