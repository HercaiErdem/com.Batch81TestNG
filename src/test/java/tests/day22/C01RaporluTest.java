package tests.day22;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.*;
import org.testng.*;
import org.testng.annotations.*;
import pages.*;
import utilities.*;
public class C01RaporluTest extends TestBaseRapor {
    /*
    -https://www.bluerentalcars.com/ adresine git
    -login butonuna bas
    -test data user email: customer@bluerentalcars.com ,
    -test data password : 12345 dataları girip login e basın
    -login butonuna tiklayin
    -Degerleri girildiginde sayfaya basarili sekilde girilebildigini test et
     */

    @Test
    public void test01() throws InterruptedException {
        extentTest = extentReports.createTest("Pozitif Test", "Gecerli kullanici adi ve password ile giris yapildi");
        // -https://www.bluerentalcars.com/ adresine git
        Driver.getDriver().get(ConfigReader.getProperty("brcUrl"));
        extentTest.info("Blue RenteCar sitesine gidildi");
        //    -login butonuna bas
        BrcPage brcPage = new BrcPage();
        brcPage.brclogin.click();
        extentTest.info("Login butonuna basildi");
        //    -test data user email: customer@bluerentalcars.com ,
        //    -test data password : 12345 dataları girip login e basın
        //    -login butonuna tiklayin
        brcPage.userEmail.sendKeys(ConfigReader.getProperty("userEmail"));
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.TAB).sendKeys(ConfigReader.getProperty("pass"))
                .sendKeys(Keys.ENTER).perform();
        Thread.sleep(2000);
        extentTest.info("Dogru email ve password girildi");
        extentTest.info("Ikinci kez login butonuna basildi");
        //    -Degerleri girildiginde sayfaya basarili sekilde girilebildigini test et
        Assert.assertTrue(brcPage.basariliGiris.isDisplayed());
        extentTest.info("Siteye basarili bir sekilde giris yapildi");
        /*
        ----2. yol---
        String actualUserName= brc.basariliGiris.getText();
        String expectedUserName= "John Walker";
        Assert.assert.Equals(expectedUserName,actualUserName );
         */
        //eğer hata raporu alırsak ve raporda resmi görüntülemek istersek rapor üzerine sağ click
        //open, explorer secip resimli raporu görüntüleyebiliriz.
        /*
Hatanin resmini RAPORDA görmek istersek  target altinda Rapor icinde yazdirilan resmin uzernie sag tiklayin --->
Open in --> uzerine gelin -->  Explorer tiklayin bilgisayardaki dosyaninzin icine yönleneceksiniz
oradan raporu cift tiklayin acilan yeni sayfada alta kucuk resim var uzerini tiklayin
ve karsimiza resim cikmis olacak .

 */

    }
}
