package pages.SignInSignUpPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.BasePage;

public class SignInPositivePage extends BasePage {

    public SignInPositivePage(WebDriver driver) {
        super(driver);
    }

    public void goToEatStreet() {
        navigate("https://eatstreet.com/");
    }

    public WebElement clickOnMyAccount() {
        return findByXpath("//img[@class='navbar__icon--profile']");
    }

    public WebElement inputEmailInfield() {
        return findByXpath("//input[@id='email']");
    }

    public WebElement inputPasswordInfield() {
        return findByXpath("//input[@id='password']");
    }

    public WebElement clickOnButtonSignIn() {
        return findByXpath("//button[@id='signin']");
    }

    public WebElement clickOnMyAccount2() {
        return findByXpath("//a[@id='menu-my-account']");
    }

    public void loginWithValidData() {
        clickOnMyAccount().click();
        inputEmailInfield().sendKeys("qaengenering@gmail.com");
        inputPasswordInfield().sendKeys("QA123456$");
        clickOnButtonSignIn().click();
        clickOnMyAccount2().click();
    }
}