package tests.day21;

import org.apache.logging.log4j.*;
import org.openqa.selenium.*;
import org.testng.annotations.*;
import pages.*;
import utilities.*;

import java.io.*;

public class C01_ScreenShotReusableMethod {

    private static Logger logger = LogManager.getLogger(C01_ScreenShotReusableMethod.class.getName());

    @Test
    public void test01() throws IOException {
        //Hepsiburada sayfasına gidiniz
        Driver.getDriver().get("https://hepsiburada.com");
        //Ve sayfanın resmini alınız
        ReusableMethods.getScreenshot("hepsiburada");
        //Sayfayı kapatınız
        Driver.closeDriver();
    }

    @Test
    public void test02() throws IOException {
        //Amazon sayfasına gidiniz
        Driver.getDriver().get(ConfigReader.getProperty("amznUrl"));
        AmazonPage amznPage = new AmazonPage();
        //Nutella aratınız
        amznPage.aramaKutusu.sendKeys("Nutella", Keys.ENTER);
        //Arama sonuc yazısı Webelementinin resmini alınız
        ReusableMethods.getScreenshotWebElement("AramaSonucWE", amznPage.aramaSonucWE);
    }
}
