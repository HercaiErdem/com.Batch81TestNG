package tests.review;

import org.openqa.selenium.*;
import org.testng.*;
import org.testng.annotations.*;
import utilities.*;

public class AllertSoruOrnegi extends TestBaseBeforeClassAfterClass {
    // 1. "http://webdriveruniversity.com/Popup-Alerts/index.html" adresine gidin
    // 2. JavaScript alertin "CLICK ME!" seçeneğine tıklayın
    // 3. Açılır metni alın
    // 4. Mesajın "I am an alert box!" olduğunu doğrulayın.
    // 5. Açılır pencereyi kabul edin


    @Test
    public void test01() {
        // 1. "http://webdriveruniversity.com/Popup-Alerts/index.html" adresine gidin
        driver.get("http://webdriveruniversity.com/Popup-Alerts/index.html");
        // 2. JavaScript alertin "CLICK ME!" seçeneğine tıklayın
        driver.findElement(By.id("button1")).click();
        // 3. Açılır metni alın
        String actualAllert = driver.switchTo().alert().getText();
        // 4. Mesajın "I am an alert box!" olduğunu doğrulayın.
        String expectedAllert = "I am an alert box!";
        Assert.assertEquals(actualAllert,expectedAllert,"demek ki icermiyomus");
        // 5. Açılır pencereyi kabul edin
        driver.switchTo().alert().accept();










    }
}
