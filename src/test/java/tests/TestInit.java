package tests;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public abstract class TestInit {

    public ThreadLocal<WebDriver> driver = new ThreadLocal<>();

    @BeforeMethod
    public void openBrowser() {
        WebDriverManager.chromedriver().setup();
        driver.set(new ChromeDriver());
    }

    public WebDriver getDriver(){
        return driver.get();
    }

    @AfterMethod
    public void closeBrowser(){
        getDriver().quit();
    }
}
