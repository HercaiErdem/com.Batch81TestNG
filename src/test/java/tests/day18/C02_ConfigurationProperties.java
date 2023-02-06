package tests.day18;

import org.testng.annotations.*;
import utilities.*;
import utilities.*;

public class C02_ConfigurationProperties {

    @Test
    public void test01() {

        //Amazon sayfasina ve Facebook sayfasina gidelim
        String urlAmazon = ConfigReader.getProperty("amazonUrl");
        String urlFacebook = ConfigReader.getProperty("facebookUrl");
        Driver.getDriver().get(urlAmazon);
        Driver.getDriver().get(urlFacebook);
        Driver.closeDriver();


    }
}
