package tests;

import org.testng.annotations.Test;
import pages.GetTheApp;

public class GetTheAppTest extends TestInit{

  @Test
    public void getApp(){
      GetTheApp app = new GetTheApp(getDriver());
      app.scroll(500);

          app.OpenLink();
            app.IphoneBtn()
                .AndroidBtn()
                .ReceiveSMSNotification()
                .PhoneNumber()
                .TextPhoneLink();

    }
}
