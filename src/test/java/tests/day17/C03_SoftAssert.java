package tests.day17;

import org.openqa.selenium.*;
import org.testng.annotations.*;
import org.testng.asserts.*;
import utilities.*;

public class C03_SoftAssert extends TestBaseBeforeClassAfterClass {

    @Test
    public void test01() {

        /*
        SoftAssert başlangıç ve bitiş satırları arasındaki tüm assertion'ları yapıp
        bitiş olarak belirtmemiz gereken assertAll() metoduyla test metodumuzdaki bütün assertion'ları
        kontrol eder. Failed olan olursa assertion yaptığımız metodun sonuna yazdığımız mesajı bize
        konsolda verir
         */

        SoftAssert softAssert = new SoftAssert();
        //1-amazon anasayfaya gidin
        driver.get("https://amazon.com");
        //2-title in Amazon içerdigini test edin
        softAssert.assertTrue(driver.getTitle().contains("Amazon"), "Girdiğiniz kelimeyi içermiyor");
        //3-arama kutusnun erişilebilir oldugunu tets edin
        WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox"));
        softAssert.assertTrue(aramaKutusu.isEnabled(), "WE erişilemez");
        //4-arama kutusuna Nuella yazıp aratın
        aramaKutusu.sendKeys("Nutella", Keys.ENTER);
        //5-arama yapıldıgını test edin
        WebElement sonuc = driver.findElement(By.xpath("//*[@class='a-section a-spacing-small a-spacing-top-small']"));
        softAssert.assertTrue(sonuc.isDisplayed(), "SonucWE görüntülenemedi");
        //6-arama sonucunun Nutella içerdigini test edin
        softAssert.assertTrue(sonuc.getText().contains("Nutella"), "Nutella içermiyor");

        softAssert.assertAll();

        System.out.println("Hata varsa burası calismaz");


    }
}
