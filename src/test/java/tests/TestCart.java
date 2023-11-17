package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CartPage;
import pages.HomePage;

public class TestCart extends TestInit {
    @Test
    public void checkCart(){
            HomePage page = new HomePage(getDriver());
            Assert.assertTrue(page.getCheckCart().isDisplayed());
            page.getCheckCart().click();
            CartPage cartPage = new CartPage(getDriver());
            Assert.assertTrue(cartPage.getCheckCartStatus().isDisplayed());
    }

}
