package tests.day23;

import org.openqa.selenium.*;
import org.testng.*;
import org.testng.annotations.*;
import pages.*;
import utilities.*;

public class C01_DataProvider {


    @DataProvider
    public static Object[][] aranacakKelimeler() {
        return new Object[][]{{"java"}, {"selenium"}, {"samsung"}, {"iphone"}};
    }

    @Test(dataProvider = "aranacakKelimeler")
    public void test02(String kelimeler) {
        AmazonPage amazonPage = new AmazonPage();
        //amazona gidelim
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
        //java, selenium, samsung ve iphone icin arama yapalim
        amazonPage.aramaKutusu.sendKeys(kelimeler, Keys.ENTER);
        //sonuclarin aradigimiz kelime icerdigini test edelim
        String actualKelime = amazonPage.aramaSonucWE.getText();
        Assert.assertTrue(actualKelime.contains(kelimeler));
    }

    @Test(dependsOnMethods = "test02")
    public void test03() {
        Driver.closeDriver();
    }
}