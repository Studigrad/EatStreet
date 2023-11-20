package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.CartPage;
import pages.HomePage;

public class testCart extends TestInit {
    @Test
    public void checkCart() {
        HomePage page = new HomePage(getDriver());
        page.navigate("https://eatstreet.com/");
        Assert.assertTrue(page.getCheckCart().isDisplayed());

        page.getCheckCart().click();
        CartPage cartPage = new CartPage(getDriver());
        Assert.assertTrue(cartPage.getCheckCartStatus().isDisplayed());
    }

    @Test
    public void checkDelivery() {
        HomePage page = new HomePage(getDriver());
        page.getCheckCart().click();
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

public void enterOderDataName(){
        CartPage cartPage = new CartPage(getDriver());
        cartPage.getCheckOutOrder().click();
        Assert.assertTrue(cartPage.getCheckOutOrder().isDisplayed());
        cartPage.getEnterOderDataName().sendKeys("Robert");
        }
        public void enterOrderDataSurname(){
        CartPage cartPage = new CartPage(getDriver());
        cartPage.getCheckOutOrder().click();
        Assert.assertTrue(cartPage.getCheckOutOrder().isDisplayed());
        cartPage.getEnterOrderDataSurname().sendKeys("Dauni");
        }

        public void enterOrderDataPhoneNum(){
            CartPage cartPage = new CartPage(getDriver());
            cartPage.getCheckOutOrder().click();
            Assert.assertTrue(cartPage.getCheckOutOrder().isDisplayed());
            cartPage.getenterOrderDataPhoneNum().sendKeys("+380975958803");

        }
public void enterOrderDataAPT(){
    CartPage cartPage = new CartPage(getDriver());
    cartPage.getCheckOutOrder().click();
    Assert.assertTrue(cartPage.getCheckOutOrder().isDisplayed());
    cartPage.getEnterOrderDataAPT().sendKeys("666");
}
public void enterOrderDataBilding(){
    CartPage cartPage = new CartPage(getDriver());
    cartPage.getCheckOutOrder().click();
    Assert.assertTrue(cartPage.getCheckOutOrder().isDisplayed());
    cartPage.getenterOrderDataBilding().sendKeys("666");
}
public void clickDeliveryBtn(){
    CartPage cartPage = new CartPage(getDriver());
    cartPage.getCheckOutOrder().click();
    Assert.assertTrue(cartPage.getCheckOutOrder().isDisplayed());
    cartPage.getclickDeliveryBtn().click();
    Assert.assertTrue(cartPage.getclickDeliveryBtn().isDisplayed());
}
public void clickTakeoutBtn(){
    CartPage cartPage = new CartPage(getDriver());
    cartPage.getCheckOutOrder().click();
    Assert.assertTrue(cartPage.getCheckOutOrder().isDisplayed());
    cartPage.getclickTakeoutBtn().click();
    Assert.assertTrue(cartPage.getclickTakeoutBtn().isDisplayed());
}
public void chooseTimeDelivery(){
        CartPage cartPage = new CartPage(getDriver());
    cartPage.getCheckOutOrder().click();
    Assert.assertTrue(cartPage.getCheckOutOrder().isDisplayed());
    cartPage.getchooseTimeDelivery().click();
    Assert.assertTrue(cartPage.getclickTakeoutBtn().isDisplayed());
    //дія вибір зі списку конкретного часу
}
public void enterOrderInstruction(){
    CartPage cartPage = new CartPage(getDriver());
    cartPage.getCheckOutOrder().click();
    Assert.assertTrue(cartPage.getCheckOutOrder().isDisplayed());
    cartPage.getEnterOrderInstruction().sendKeys("leave at door");
}
public void clickBackToMenuBtn(){
    CartPage cartPage = new CartPage(getDriver());
    cartPage.getCheckOutOrder().click();
    Assert.assertTrue(cartPage.getCheckOutOrder().isDisplayed());
    cartPage.getClickBackToMenuBtn().click();
}
public void clickContinueOrder(){
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

