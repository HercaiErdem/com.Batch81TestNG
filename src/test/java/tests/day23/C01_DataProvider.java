package tests.day23;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;

public class C01_DataProvider {
    @Test
    public void test01() {
     //   AmazonPage amazonPage = new AmazonPage();
        //Amazon sayfasına gidelim
        Driver.getDriver().get(ConfigReader.getProperty("amznUrl"));
        //Nutella için arama yapalım
       // amazonPage.aramaKutusu.sendKeys("Nutella", Keys.ENTER);
        //sonuclarin nutella icerdigini test edelim
        String expectedKelime = "Nutella";
       // String actualKelime = amazonPage.aramaSonucWE.getText();
        // Assert.assertTrue(actualKelime.contains(expectedKelime));
        Driver.closeDriver();
    }
    @Test
    public void test02() {
        // AmazonPage amazonPage = new AmazonPage();
        //amazona gidelim
        Driver.getDriver().get(ConfigReader.getProperty("amznUrl"));
        //java, selenium, samsung ve iphone icin arama yapalim
        //sonuclarin aradigimiz kelime icerdigini test edelim
        //sayfayi kapatalim
        Driver.closeDriver();
    }
}
