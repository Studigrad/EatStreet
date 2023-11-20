package pages;

import org.openqa.selenium.By;

import components.Footer;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.BasePage;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver){
        super(driver);
    }
    public void findInSearchField(String text){
        searchField().sendKeys(text+"\n");
    }
    public WebElement searchField(){
        return findByXpath("//input[@placeholder=\"Enter Your Address\"]");  // Пошукове поле
    }
    public WebElement partnerWithUsLearnMore(){
        return findByXpath("//a[@href=\"http://geteatstreet.com/?_gl=1*yy012k*_ga*MTIxMDM3MDA3LjE2OTk5NjQ2NTg.*_ga_0Q57ZKP42S*MTcwMDEyNzk2Ny4xMC4xLjE3MDAxMjgwMjYuMC4wLjA.\"]");
    }

    public WebElement getCheckCart(){
        return  driver.findElement(By.xpath("//div[@title='Click here to view your cart.']"));
    }


    public WebElement partnerWithUsApplyNow(){
        return findByXpath("//a[@ui-sref=\"careers\"]");
    }

    public WebElement partnerWithUsGetTheUp(){
        return findByXpath("//a[@href=\"/get-the-app\"]");
    }

    public WebElement takeoutMode(){
        return findByXpath("//label[@for=\"home-checkbox-takeout\"]");
    }

    public WebElement deliveryMode(){
        return findByXpath("//label[@for=\"home-checkbox-delivery\"]");
    }

    public WebElement useMyLocation(){
        return findByXpath("//div[@title=\"Use my location\"]");
    }

    public WebElement getFedButton(){
        return findByXpath("//a[@id=\"find-restaurants\"]");
    }

    public WebElement logoWeDeliverYouDevour(){
        return findByXpath("//section[@class=\"text-center landing-callout--image promo_text\"]");
    }

    public WebElement enterYourEmailAddressField(){
        return findByXpath("//input[@id=\"new-email\"]");
    }

    public WebElement signUpButton(){
        return findByXpath("//button[@type=\"submit\"]");
    }

//    public void findInSearchField(String text){
//        searchField().sendKeys(text+"\n");
//    }

    // Ресторани

    public WebElement phoenixAZ(){
        return findByXpath("//a[@href=\"/phoenix-az/home\"]");
    }

    public WebElement tucsonAZ(){
        return findByXpath("//a[@href=\"/tucson-az/home\"]");
    }

    public WebElement bloomingtonIN(){
        return findByXpath("//a[@href=\"/bloomington-in/home\"]");
    }

    public WebElement indianapolisIN(){
        return findByXpath("//a[@href=\"/indianapolis-in/home\"]");
    }

    public WebElement muncieIN(){
        return findByXpath("//a[@href=\"/muncie-in/home\"]");
    }

    public WebElement lasVegasNV(){
        return findByXpath("//a[@href=\"/las-vegas-nv/home\"]");
    }

    public WebElement nashvilleTN(){
        return findByXpath("//a[@href=\"/nashville-tn/home\"]");
    }

    public WebElement berkeleyCA(){
        return findByXpath("//a[@href=\"/berkeley-ca/home\"]");
    }

    public WebElement fremontCA(){
        return findByXpath("//a[@href=\"/fremont-ca/home\"]");
    }

    public WebElement irvineCA(){
        return findByXpath("//a[@href=\"/irvine-ca/home\"]");
    }

    public WebElement losAngelesCA(){
        return findByXpath("//a[@href=\"/los-angeles-ca/home\"]");
    }

    public WebElement oaklandCA(){
        return findByXpath("//a[@href=\"/oakland-ca/home\"]");
    }

    public WebElement paloAltoCA(){
        return findByXpath("//a[@href=\"/palo-alto-ca/home\"]");
    }

    public WebElement pleasantonCA(){
        return findByXpath("//a[@href=\"/pleasanton-ca/home\"]");
    }

    public WebElement riversideCA(){
        return findByXpath("//a[@href=\"/riverside-ca/home\"]");
    }

    public WebElement sacramentoCA(){
        return findByXpath("//a[@href=\"/sacramento-ca/home\"]");
    }

    public WebElement sanDiegoCA(){
        return findByXpath("//a[@href=\"/san-diego-ca/home\"]");
    }

    public WebElement sanFranciscoCA(){
        return findByXpath("//a[@href=\"/san-francisco-ca/home\"]");
    }

    public WebElement sanJoseCA(){
        return findByXpath("//a[@href=\"/sunnyvale-ca/home\"]");
    }

    public WebElement santaMariaCA(){
        return findByXpath("//a[@href=\"/santa-maria-ca/home\"]");
    }

    public WebElement auroraCO(){
        return findByXpath("//a[@href=\"/aurora-co/home\"]");
    }

    public WebElement boulderCO(){
        return findByXpath("//a[@href=\"/boulder-co/home\"]");
    }

    public WebElement denverCO(){
        return findByXpath("//a[@href=\"/denver-co/home\"]");
    }

    public WebElement hartfordCT(){
        return findByXpath("//a[@href=\"/hartford-ct/home\"]");
    }

    public WebElement newHavenCT(){
        return findByXpath("//a[@href=\"/new-haven-ct/home\"]");
    }

    public WebElement newarkDE(){
        return findByXpath("//a[@href=\"/newark-de/home\"]");
    }

    public WebElement washingtonDC(){
        return findByXpath("//a[@href=\"/washingtondc-dc/home\"]");
    }

    public WebElement fortLauderdaleFL(){
        return findByXpath("//a[@href=\"/fort-lauderdale-fl/home\"]");
    }

    public WebElement miamiFL(){
        return findByXpath("//a[@href=\"/miami-fl/home\"]");
    }

    public WebElement orlandoFL(){
        return findByXpath("//a[@href=\"/orlando-fl/home\"]");
    }

    public WebElement tampaFL(){
        return findByXpath("//a[@href=\"/tampa-fl/home\"]");
    }

    public WebElement atlantaGA(){
        return findByXpath("//a[@href=\"/atlanta-ga/home\"]");
    }

    public WebElement champaingIL(){
        return findByXpath("//a[@href=\"/champaign-il/home\"]");
    }

    public WebElement chicagoIL(){
        return findByXpath("//a[@href=\"/chicago-il/home\"]");
    }

    public WebElement dekalbIL(){
        return findByXpath("//a[@href=\"/dekalb-il/home\"]");
    }

    public WebElement amesIA(){
        return findByXpath("//a[@href=\"/ames-ia/home\"]");
    }

    public WebElement cedarFallsWaterlooIA(){
        return findByXpath("//a[@href=\"/waterloo-ia/home\"]");
    }

    public WebElement cedarRapidsIA(){
        return findByXpath("//a[@href=\"/cedar-rapids-ia/home\"]");
    }

    public WebElement desMoinesIA(){
        return findByXpath("//a[@href=\"/des-moines-ia/home\"]");
    }

    public WebElement dubuqueIA(){
        return findByXpath("//a[@href=\"/dubuque-ia/home\"]");
    }

    public WebElement iowaCityIA(){
        return findByXpath("//a[@href=\"/iowacity-ia/home\"]");
    }

    public WebElement manhattanKS(){
        return findByXpath("//a[@href=\"/manhattan-ks/home\"]");
    }

    public WebElement salinaKS(){
        return findByXpath("//a[@href=\"/salina-ks/home\"]");
    }

    public WebElement topekaKS(){
        return findByXpath("//a[@href=\"/topeka-ks/home\"]");
    }

    public WebElement lexingtonKY(){
        return findByXpath("//a[@href=\"/lexington-ky/home\"]");
    }

    public WebElement newOrleansLA(){
        return findByXpath("//a[@href=\"/new-orleans-la/home\"]");
    }

    public WebElement latimoreMD(){
        return findByXpath("//a[@href=\"/baltimore-md/home\"]");
    }

    public WebElement collegeparkMD(){
        return findByXpath("//a[@href=\"/collegepark-md/home\"]");
    }

    public WebElement rockvilleMD(){
        return findByXpath("//a[@href=\"/rockville-md/home\"]");
    }

    public WebElement bostonMA(){
        return findByXpath("//a[@href=\"/boston-ma/home\"]");
    }

    public WebElement cambridgeMA(){
        return findByXpath("//a[@href=\"//cambridge-ma/home\"]");
    }

    public WebElement worcesterMA(){
        return findByXpath("//a[@href=\"/worcester-ma/home\"]");
    }

    public WebElement annArborMI(){
        return findByXpath("//a[@href=\"/ann-arbor-mi/home\"]");
    }

    public WebElement detroitMI(){
        return findByXpath("//a[@href=\"/detroit-mi/home\"]");
    }

    public WebElement eastLansingMI(){
        return findByXpath("//a[@href=\"/eastlansing-mi/home\"]");
    }

    public WebElement grandRapidsMI(){
        return findByXpath("//a[@href=\"/grandrapids-mi/home\"]");
    }

    public WebElement kalamazooMI(){
        return findByXpath("//a[@href=\"/kalamazoo-mi/home\"]");
    }

    public WebElement duluthMN(){
        return findByXpath("//a[@href=\"/duluth-mn/home\"]");
    }

    public WebElement minneapolisStPaulMN(){
        return findByXpath("//a[@href=\"/twincities-mn/home\"]");
    }

    public WebElement atlanticCityNJ(){
        return findByXpath("//a[@href=\"/atlantic-city-nj/home\"]");
    }

    public WebElement newBrunswickNJ(){
        return findByXpath("//a[@href=\"/new-brunswick-nj/home\"]");
    }

    public WebElement newarkNJ(){
        return findByXpath("//a[@href=\"/newark-nj/home\"]");
    }

    public WebElement patersonNJ(){
        return findByXpath("//a[@href=\"/paterson-nj/home\"]");
    }

    public WebElement trentonNJ(){
        return findByXpath("//a[@href=\"/trenton-nj/home\"]");
    }

    public WebElement albanyNY(){
        return findByXpath("//a[@href=\"/albany-ny/home\"]");
    }

    public WebElement byffaloNY(){
        return findByXpath("//a[@href=\"/buffalo-ny/home\"]");
    }

    public WebElement newYorkCityNY(){
        return findByXpath("//a[@href=\"/new-york-city-ny/home\"]");
    }

    public WebElement rochesterNY(){
        return findByXpath("//a[@href=\"/rochester-ny/home\"]");
    }

    public WebElement syracuseNY(){
        return findByXpath("//a[@href=\"/syracuse-ny/home\"]");
    }

    public WebElement charlotteNC(){
        return findByXpath("//a[@href=\"/charlotte-nc/home\"]");
    }

    public WebElement greensboroNC(){
        return findByXpath("//a[@href=\"/greensboro-nc/home\"]");
    }

    public WebElement raleighNC(){
        return findByXpath("//a[@href=\"/raleigh-nc/home\"]");
    }

    public WebElement bowlingGreenOH(){
        return findByXpath("//a[@href=\"/bowling-green-oh/home\"]");
    }

    public WebElement cincinnatiOH(){
        return findByXpath("//a[@href=\"/cincinnati-oh/home\"]");
    }

    public WebElement clevelandOH(){
        return findByXpath("//a[@href=\"/cleveland-oh/home\"]");
    }

    public WebElement columbusOH(){
        return findByXpath("//a[@href=\"/columbus-oh/home\"]");
    }

    public WebElement toledoOH(){
        return findByXpath("//a[@href=\"/toledo-oh/home\"]");
    }

    public WebElement oklahomaCityOK(){
        return findByXpath("//a[@href=\"/oklahoma-city-ok/home\"]");
    }

    public WebElement stillwaterOK(){
        return findByXpath("//a[@href=\"/stillwater-ok/home\"]");
    }

    public WebElement albanyOR(){
        return findByXpath("//a[@href=\"/albany-or/home\"]");
    }

    public WebElement corvallisOR(){
        return findByXpath("//a[@href=\"/corvallis-or/home\"]");
    }

    public WebElement hillsboroOR(){
        return findByXpath("//a[@href=\"/hillsboro-or/home\"]");
    }

    public WebElement portlandOR(){
        return findByXpath("//a[@href=\"/portland-or/home\"]");
    }

    public WebElement salemOR(){
        return findByXpath("//a[@href=\"/salem-or/home\"]");
    }

    public WebElement wilsonvilleOR(){
        return findByXpath("//a[@href=\"/wilsonville-or/home\"]");
    }

    public WebElement allentownBathlehemPA(){
        return findByXpath("//a[@href=\"/allentown-pa/home\"]");
    }

    public WebElement philadelphiaPA(){
        return findByXpath("//a[@href=\"/philadelphia-pa/home\"]");
    }

    public WebElement pittsburghPA(){
        return findByXpath("//a[@href=\"/pittsburgh-pa/home\"]");
    }

    public WebElement providenceRI(){
        return findByXpath("//a[@href=\"/providence-ri/home\"]");
    }

    public WebElement austinTX(){
        return findByXpath("//a[@href=\"/austin-tx/home\"]");
    }

    public WebElement dallasTX(){
        return findByXpath("//a[@href=\"/dallas-tx/home\"]");
    }

    public WebElement dentonTX(){
        return findByXpath("//a[@href=\"/Denton-tx/home\"]");
    }

    public WebElement houstonTX(){
        return findByXpath("//a[@href=\"/houston-tx/home\"]");
    }

    public WebElement sanAntonioTX(){
        return findByXpath("//a[@href=\"/san-antonio-tx/home\"]");
    }

    public WebElement alexandriaVA(){
        return findByXpath("//a[@href=\"/alexandria-va/home\"]");
    }

    public WebElement arlingtonVA(){
        return findByXpath("//a[@href=\"/arlington-va/home\"]");
    }

    public WebElement fairfaxVA(){
        return findByXpath("//a[@href=\"/fairfax-va/home\"]");
    }

    public WebElement norfolkVA(){
        return findByXpath("//a[@href=\"/norfolk-va/home\"]");
    }

    public WebElement richmondVA(){
        return findByXpath("//a[@href=\"/richmond-va/home\"]");
    }

    public WebElement seattleWA(){
        return findByXpath("//a[@href=\"/seattle-wa/home\"]");
    }

    public WebElement appletonWI(){
        return findByXpath("//a[@href=\"/appleton-wi/home\"]");
    }

    public WebElement eauclaireWI(){
        return findByXpath("//a[@href=\"/eauclaire-wi/home\"]");
    }

    public WebElement fondDuLacWI(){
        return findByXpath("//a[@href=\"/fond-du-lac-wi/home\"]");
    }

    public WebElement greenBayWI(){
        return findByXpath("//a[@href=\"/green-bay-wi/home\"]");
    }

    public WebElement janesvilleWI(){
        return findByXpath("//a[@href=\"/janesville-wi/home\"]");
    }

    public WebElement kenoshaWI(){
        return findByXpath("//a[@href=\"/kenosha-wi/home\"]");
    }

    public WebElement laCrosseWI(){
        return findByXpath("//a[@href=\"/la-crosse-wi/home\"]");
    }

    public WebElement madisonWI(){
        return findByXpath("//a[@href=\"/madison-wi/home\"]");
    }

    public WebElement manitowocWI(){
        return findByXpath("//a[@href=\"/manitowoc-wi/home\"]");
    }

    public WebElement milwaukeeWI(){
        return findByXpath("//a[@href=\"/milwaukee-wi/home\"]");
    }

    public WebElement oshkoshWI(){
        return findByXpath("//a[@href=\"/oshkosh-wi/home\"]");
    }

    public WebElement racineWI(){
        return findByXpath("//a[@href=\"/racine-wi/home\"]");
    }

    public WebElement sheboyganWI(){
        return findByXpath("//a[@href=\"/sheboygan-wi/home\"]");
    }

    public WebElement stevansPointWI(){
        return findByXpath("//a[@href=\"/stevens-point-wi/home\"]");
    }

    public WebElement waukeshaWI(){
        return findByXpath("//a[@href=\"/waukesha-wi/home\"]");
    }

    public WebElement wausauWI(){
        return findByXpath("//a[@href=\"/wausau-wi/home\"]");
    }

    public WebElement whitewaterWI(){
        return findByXpath("//a[@href=\"/whitewater-wi/home\"]");
    }

    public WebElement laramieWY(){
        return findByXpath("//a[@href=\"/laramie-wy/home\"]");
    }


}
