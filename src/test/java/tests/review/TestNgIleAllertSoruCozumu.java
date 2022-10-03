package tests.review;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AllertPage;
import utilities.Driver;

public class TestNgIleAllertSoruCozumu {
    // 1. "http://webdriveruniversity.com/Popup-Alerts/index.html" adresine gidin
    // 2. JavaScript alertin "CLICK ME!" seçeneğine tıklayın
    // 3. Açılır metni alın
    // 4. Mesajın "I am an alert box!" olduğunu doğrulayın.
    // 5. Açılır pencereyi kabul edin


    @Test
    public void test01() throws InterruptedException {
        // 1. "http://webdriveruniversity.com/Popup-Alerts/index.html" adresine gidin
        Driver.getDriver().get(ConfigReader.getProperty("AllertSitesi"));

        // 2. JavaScript alertin "CLICK ME!" seçeneğine tıklayın
        AllertPage allertPage = new AllertPage();
        allertPage.clickMeButton.click();
        // 3. Açılır metni alın
        // 4. Mesajın "I am an alert box!" olduğunu doğrulayın.
        String actualText = Driver.getDriver().switchTo().alert().getText();
        String expectedText = "I am an alert box!";
        Assert.assertEquals(actualText, expectedText);
        Thread.sleep(2000);
        // 5. Açılır pencereyi kabul edin
        Driver.getDriver().switchTo().alert().accept();

        Driver.closeDriver();


    }
}
