package tests;

import components.ModalWindow;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.SearchPage;

public class FindRestaurantTest extends TestInit{
    private HomePage homePage;
    private ModalWindow modal;
    private SearchPage searchPage;
    @BeforeTest
    public void setPageObjects(){
        WebDriver dr = getDriver();
        this.homePage = new HomePage(dr);
        this.modal = new ModalWindow(dr);
        this.searchPage = new SearchPage(dr);
    }
    @Test
    public void enterRestaurantAddress(){
        homePage.findInSearchField("Мадисон, Висконсин, США");
        modal.clickBtn(modal.getEnterAddressBtn());
        homePage.getFedButton().click();

        Assert.assertTrue(searchPage.matchingResult().getText().contains("matching restaurants near you"));
    }
    @Test(dependsOnMethods = "enterRestaurantAddress")
    public void checkOrderFor() throws InterruptedException {
        searchPage.clickOrderForRadioBtn(2);
        Assert.assertTrue(searchPage
                    .matchingResult()
                    .getText()
                    .contains("matching restaurants near you"));
    }
    @Test(dependsOnMethods = "checkOrderFor")
    public void checkFilterSection(){
        searchPage.clickOrderForRadioBtn(1);
        searchPage.scroll(150);
        searchPage.clickFilterBtnByIndex(1);
        searchPage.clickFilterBtnByIndex(2);
        searchPage.clickFilterBtnByIndex(3);
        Assert.assertTrue(searchPage.matchingResult()
                .getText()
                .contains("matching"));
    }
    @Test(dependsOnMethods = "checkFilterSection")
    public void checkChooseRestaurant() {
        searchPage.scroll(50);
        searchPage.chooseRestaurantByIndex(1);
    }

}
