package tests;

import components.ModalWindow;
import org.bouncycastle.math.raw.Mod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.RestaurantPage;
import pages.Restaurants;
import pages.SearchPage;

import java.security.SecureRandom;
import java.util.List;

public class RestourantsTest extends TestInit{
    private HomePage homePage;
    private Restaurants restaurants;
    private SearchPage searchPage;
    private ModalWindow modalWindow;
    private RestaurantPage restaurantPage;

    @BeforeTest
    public void beforeTestAlready(){
        WebDriver driver = getDriver();
        this.homePage = new HomePage(driver);
        this.restaurants = new Restaurants(driver);
        this.searchPage = new SearchPage(driver);
        this.modalWindow = new ModalWindow(driver);
        this.restaurantPage = new RestaurantPage(driver);

        homePage.gotItButton().click();
        homePage.clickCityList(6);
        restaurantPage.clickListAllRestaurants(3);
        searchPage.getRestaurantByIndex(1).click();
    }

    @Test
    public void testRestaurantsIsClosed(){
        String actualText = restaurants.statusRestaurants().getText();
        String expectedText = "Closed";

        Assert.assertEquals(actualText,expectedText);
    }

    @Test
    public void testRatingMostlyFour() {
        int expectedNumberOfElements = 4;

        Assert.assertEquals(restaurants.ratingIsFourStar(), expectedNumberOfElements, "Rating is not mostly four!");
    }
}
