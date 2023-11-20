package tests.SignInSignUpTests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.SignInSignUpPage.SignInPositivePage;
import tests.TestInit;

public class SignInPositive extends TestInit {
    @Test
    public void signInPositive() {
        SignInPositivePage signIn = new SignInPositivePage(getDriver());
        signIn.loginWithValidData();

        Assert.assertTrue(signIn.findByXpath("//span[text()='qaengenering@gmail.com']").isDisplayed());

    }

}
