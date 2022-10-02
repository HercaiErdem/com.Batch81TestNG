package tests.review;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.TrendyolPage;
import utilities.Driver;

public class TrendyolPozitifTest {
   // https://www.trendyol.com/ adresine git
    // login butonuna bas
// test data username: matcode3460@gmail.com
// test data password : Manager1!
// Degerleri girildiginde sayfaya basarili sekilde girilebildigini test et
// Nutella aratiniz
// ilk siradaki urunu sepete ekleyin
// sepete gidip urunun sepete eklendigini test edin
    @Test
    public void trendyolPozitifTest() throws InterruptedException {
        // https://www.trendyol.com/ adresine git
        Driver.getDriver().get(ConfigReader.getProperty("trdyUrl"));
        Driver.getDriver().navigate().refresh();
        TrendyolPage trendyolPage = new TrendyolPage();
        // login butonuna bas
        trendyolPage.giris.click();
        // test data username: matcode3460@gmail.com
        trendyolPage.email.sendKeys(ConfigReader.getProperty("trendyolTrueEmail"));
        // test data password : matcode1234
        trendyolPage.password.sendKeys(ConfigReader.getProperty("trendyolTruePassword"), Keys.ENTER);
        // Degerleri girildiginde sayfaya basarili sekilde girilebildigini test et
        Assert.assertTrue(trendyolPage.basariliGiris.isDisplayed());
        // Nutella aratiniz
        Thread.sleep(1000);
        trendyolPage.aramaKutusu.sendKeys("Nutella", Keys.ENTER);
        // ilk siradaki urunu sepete ekleyin
        trendyolPage.ilkUrun.click();

        // sepete gidip urunun sepete eklendigini test edin
        trendyolPage.sepet.click();
        Assert.assertTrue(trendyolPage.sepetKontrol.isDisplayed());

    }
}
