package tests;

import components.Footer;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestFooter extends TestInit {
    @Test
    public void legal() throws InterruptedException {

        Footer footer = new Footer(getDriver());
        footer.scroll(3000);
        footer.clickPrivacyPolicyBtn();
        Thread.sleep(5000);

    }

}
