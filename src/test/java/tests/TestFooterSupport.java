package tests;

import components.Footer;
import org.testng.annotations.Test;

public class TestFooterSupport extends TestInit{
    @Test
    public void customerButton(){
        Footer footer = new Footer(getDriver());
        footer.scroll(5000);
        footer.clickforCustomers();
    }
    @Test
    public void RestaurantDashboard(){
        Footer footer = new Footer(getDriver());
        footer.scroll(5000);
        footer.clickRestaurantDashboard();
    }
    @Test
    public void GetEatStreet(){
        Footer footer = new Footer(getDriver());
        footer.scroll(5000);
        footer.clickGetEatStreet();
    }
    @Test
    public void GetHelp(){
        Footer footer = new Footer(getDriver());
        footer.scroll(5000);
        footer.clickGetHelpButton();
    }
}
