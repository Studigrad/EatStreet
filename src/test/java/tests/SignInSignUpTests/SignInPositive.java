package tests.SignInSignUpTests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.SignInSignUpPage.SignInPositivePage;
import tests.TestInit;

public class SignInPositive extends TestInit {
    @Test
    public void signInPositive() {
        SignInPositivePage signIn = new SignInPositivePage(getDriver());

        signIn.clickOnMyAccount().click();
        signIn.inputEmailInfield().sendKeys("qaengenering@gmail.com");
        signIn.inputPasswordInfield().sendKeys("QA123456$");
        signIn.scroll(250);
        signIn.clickOnButtonSignIn().click();
        signIn.clickOnMyAccount2().click();

        Assert.assertTrue(signIn.findByXpath("//span[text()='qaengenering@gmail.com']").isDisplayed());

    }

}
