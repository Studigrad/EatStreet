package tests;

import org.testng.annotations.Test;
import HomePage;
import pages.SearchPage;

public class FindRestaurantTest extends TestInit{
    @Test
    public void enterRestaurantAddress(){
        HomePage homePage = new HomePage(getDriver());
        SearchPage searchPage = new SearchPage(getDriver());

    }
}
