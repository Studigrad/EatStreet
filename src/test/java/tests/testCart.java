package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.CartPage;
import pages.HomePage;

public class testCart extends TestInit {
@Test
    public void checkCart(){
            HomePage page = new HomePage(getDriver());
            page.navigate("https://eatstreet.com/");
            Assert.assertTrue(page.getCheckCart().isDisplayed());

            page.getCheckCart().click();
            CartPage cartPage = new CartPage(getDriver());
            Assert.assertTrue(cartPage.getCheckCartStatus().isDisplayed());
    }

    public void checkCartStatus(){
        HomePage page = new HomePage(getDriver());

    }
    public void chooseRestaurant(){
        HomePage page = new HomePage(getDriver());
        page.navigate(("https://eatstreet.com/"));
        Assert.assertTrue(page.findSearchField().isDisplayed());

        HomePage HomePage = new HomePage(getDriver());

    }

}
