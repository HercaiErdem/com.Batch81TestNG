package tests.day16;

import org.testng.annotations.Test;
import utilities.TestBaseBeforeMethodAfterMethod;

public class C03_Priority extends TestBaseBeforeMethodAfterMethod {
    // Testlerimizi çalıştırırken istediğimiz sıraya göre çalışmasını istersek
    //priority methodunu kullanırız
    // priotry() yazmadigimiz test ler priotry yazdigimiz testlerden once calisir  cunku o default deger alir
    // @Test priority kullanmaz isek default olarak 0 dir.(priority atanmayan @Test ilk olarak calisir)
    @Test(priority = 1)
    public void YoutubeTest() {
        driver.get("https://www.youtube.com");
    }

    public void bestbuyTest() { // Burayi 0 kabul eder ve ilk bu test calisir
        driver.get("https://www.bestbuy.com");

    }

    @Test(priority = 2)
    public void amazonTest() {
        driver.get("https://www.amazon.com");

    }

}
