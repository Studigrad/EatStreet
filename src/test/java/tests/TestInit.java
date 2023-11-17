package tests;

import components.TermsOfUse;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public abstract class TestInit {

    public ThreadLocal<WebDriver> driver = new ThreadLocal<>();

    @BeforeTest
    public void openBrowser() {
        WebDriverManager.chromedriver().setup();
        driver.set(new ChromeDriver());

        getDriver().manage().window().maximize();
        getDriver().get("https://eatstreet.com");

        TermsOfUse terms = new TermsOfUse(getDriver());
        terms.acceptBtn();
    }

    public WebDriver getDriver(){
        return driver.get();
    }

    @AfterTest
    public void closeBrowser(){
        getDriver().quit();
    }
}
