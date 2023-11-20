package pages.footerPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.BasePage;

public class AboutUsPage extends BasePage {

    public AboutUsPage(WebDriver driver) {
        super(driver);
    }

    private static final String GET_TEXT_ABOUT_US_PAGE = "//h1[@class='press__section-title text-center']";

    public WebElement getTextAboutUsPage() {
        return findByXpath(GET_TEXT_ABOUT_US_PAGE);
    }
}
