package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.GetTheApp;

public class GetTheAppTest extends TestInit{

  @Test
  public void textVisible(){
    GetTheApp appGet = new GetTheApp(getDriver());
    appGet.Opensite()
            .textVisible();
    Assert.assertEquals(appGet.textVisible(), "Food in a Snap of the App!");
  }

  @Test
  public void getAppiPhonebutton(){
    GetTheApp appGet = new GetTheApp(getDriver());
    appGet.Opensite()
            .IphoneBtn();
  }
  @Test
  public void getAppAndroidbutton(){
    GetTheApp appGet = new GetTheApp(getDriver());
    appGet.Opensite()
            .AndroidBtn();
  }
  @Test
  public void notificatioBbutton(){
    GetTheApp appGet = new GetTheApp(getDriver());
    appGet.Opensite()
            .NotificationBtn();
  }
  @Test
  public void phoneNumberButton(){
    GetTheApp app = new GetTheApp(getDriver());
    app.Opensite()
            .PhoneNumberBtn();
  }
  @Test
  public void TextLinkButton(){
    GetTheApp app = new GetTheApp(getDriver());
    app.Opensite()
            .TextLinkBtn();
  }
  @Test
    public void getAppTextBtnCheck(){
      GetTheApp app = new GetTheApp(getDriver());
      app.Opensite()
              .GetTextFromIphoneBtn();
      Assert.assertEquals(app.iphoneTextBtnText(), "Text iPhone Link");
      app.GetTextFromAndroid();
      Assert.assertEquals(app.androidTextBtntext(), "Text Android Link");
    }
}
