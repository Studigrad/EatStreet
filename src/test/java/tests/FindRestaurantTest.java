package tests;

import components.ModalWindow;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.SearchPage;

public class FindRestaurantTest extends TestInit {

    /**
     * this test enter address in search field and finds all restaurant by that address
     */
    @Test
    public void enterRestaurantAddress(){
        WebDriver dr = getDriver();
        HomePage homePage = new HomePage(dr);
        homePage.findInSearchField("Мадисон, Висконсин, США");

        ModalWindow modal = new ModalWindow(dr);
        modal.clickBtn(modal.getEnterAddressBtn());
        homePage.getFedButton().click();

        SearchPage searchPage = new SearchPage(dr);
        //Assert.assertEquals(searchPage.matchingResult().getText(),"matching restaurants near you");
        Assert.assertTrue(searchPage.matchingResult().getText().contains("matching restaurants near you"));
    }
}
