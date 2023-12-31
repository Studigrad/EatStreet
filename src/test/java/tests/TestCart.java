package tests;

import components.Header;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CartPage;
import pages.HomePage;

public class TestCart extends TestInit {

    @Test
    public void checkCart() {
        HomePage page = new HomePage(getDriver());
        page.navigate("https://eatstreet.com/");
        Assert.assertTrue(page.getCheckCart().isDisplayed());
        Header header = new Header(getDriver());
        header.getCartBtn().click();
        CartPage cartPage = new CartPage(getDriver());
        Assert.assertTrue(cartPage.getCheckCartStatus().isDisplayed());
    }

    @Test
    public void checkDelivery() {
        Header header = new Header(getDriver());
        header.getCartBtn().click();
        CartPage cartPage = new CartPage(getDriver());
        cartPage.getCheckDelivery().click();
        Assert.assertTrue(cartPage.getCheckDelivery().isDisplayed());
    }

    @Test
    public void checkTakeout() {
        CartPage cartPage = new CartPage(getDriver());
        cartPage.getCheckTakeout().click();
        Assert.assertTrue(cartPage.getCheckTakeout().isDisplayed());
    }

    @Test
    public void checkOutOrder() {
        CartPage cartPage = new CartPage(getDriver());
        cartPage.getCheckOutOrder().click();
        Assert.assertTrue(cartPage.getCheckOutOrder().isDisplayed());
    }

    @Test
    public void enterOderDataName() {
        CartPage cartPage = new CartPage(getDriver());
        cartPage.getCheckOutOrder().click();
        Assert.assertTrue(cartPage.getCheckOutOrder().isDisplayed());
        cartPage.getEnterOderDataName().sendKeys("Robert");
    }

    @Test
    public void enterOrderDataSurname() {
        CartPage cartPage = new CartPage(getDriver());
        cartPage.getCheckOutOrder().click();
        Assert.assertTrue(cartPage.getCheckOutOrder().isDisplayed());
        cartPage.getEnterOrderDataSurname().sendKeys("Dauni");
    }

    @Test
    public void enterOrderDataPhoneNum() {
        CartPage cartPage = new CartPage(getDriver());
        cartPage.getCheckOutOrder().click();
        Assert.assertTrue(cartPage.getCheckOutOrder().isDisplayed());
        cartPage.getenterOrderDataPhoneNum().sendKeys("+380975958803");

    }
    @Test
    public void enterOrderDataAPT() {
        CartPage cartPage = new CartPage(getDriver());
        cartPage.getCheckOutOrder().click();
        Assert.assertTrue(cartPage.getCheckOutOrder().isDisplayed());
        cartPage.getEnterOrderDataAPT().sendKeys("666");
    }
    @Test
    public void enterOrderDataBilding() {
        CartPage cartPage = new CartPage(getDriver());
        cartPage.getCheckOutOrder().click();
        Assert.assertTrue(cartPage.getCheckOutOrder().isDisplayed());
        cartPage.getenterOrderDataBilding().sendKeys("666");
    }
    @Test
    public void clickDeliveryBtn() {
        CartPage cartPage = new CartPage(getDriver());
        cartPage.getCheckOutOrder().click();
        Assert.assertTrue(cartPage.getCheckOutOrder().isDisplayed());
        cartPage.getclickDeliveryBtn().click();
        Assert.assertTrue(cartPage.getclickDeliveryBtn().isDisplayed());
    }
    @Test
    public void clickTakeoutBtn() {
        CartPage cartPage = new CartPage(getDriver());
        cartPage.getCheckOutOrder().click();
        Assert.assertTrue(cartPage.getCheckOutOrder().isDisplayed());
        cartPage.getclickTakeoutBtn().click();
        Assert.assertTrue(cartPage.getclickTakeoutBtn().isDisplayed());
    }
    @Test
    public void chooseTimeDelivery() {
        CartPage cartPage = new CartPage(getDriver());
        cartPage.getCheckOutOrder().click();
        Assert.assertTrue(cartPage.getCheckOutOrder().isDisplayed());
        cartPage.getchooseTimeDelivery().click();
        Assert.assertTrue(cartPage.getclickTakeoutBtn().isDisplayed());
        //дія вибір зі списку конкретного часу
    }
    @Test
    public void enterOrderInstruction() {
        CartPage cartPage = new CartPage(getDriver());
        cartPage.getCheckOutOrder().click();
        Assert.assertTrue(cartPage.getCheckOutOrder().isDisplayed());
        cartPage.getEnterOrderInstruction().sendKeys("leave at door");
    }
    @Test
    public void clickBackToMenuBtn() {
        CartPage cartPage = new CartPage(getDriver());
        cartPage.getCheckOutOrder().click();
        Assert.assertTrue(cartPage.getCheckOutOrder().isDisplayed());
        cartPage.getClickBackToMenuBtn().click();
    }
    @Test
    public void clickContinueOrder() {
        CartPage cartPage = new CartPage(getDriver());
        cartPage.getCheckOutOrder().click();
        Assert.assertTrue(cartPage.getCheckOutOrder().isDisplayed());
        cartPage.getClickContinueOrder().click();
    }


//    public void chooseRestaurant(){
//        HomePage page = new HomePage(getDriver());
//        page.navigate(("https://eatstreet.com/"));
//        Assert.assertTrue(page.findSearchField().isDisplayed());
//
//        HomePage HomePage = new HomePage(getDriver());
//
//    }

}

