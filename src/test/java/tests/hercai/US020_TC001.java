package tests.hercai;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.*;
import org.openqa.selenium.support.ui.*;
import org.testng.*;
import org.testng.annotations.*;
import pages.*;
import utilities.*;

import java.time.*;

public class US020_TC001 {
    // Kullanici bilgisi, yazmış olduğu comment
    // Belirtilen URL` ye gidilir
    //"Sing in" butonuna tıklanır
    //"Username or email adress" bölümüne vendor email girilir
    //"Password" bölümüne verdor password girilir
    //"Sing in" butonuna tıklanır
    //Açılan sayfanın alt kısmında bulunan "My Account" butonuna tıklanır
    //"Store Manager" butonuna tıklanır
    //Reviews butonuna tıklanır
    //Products Reviews kutucuğuna tıklanır
    //"tarikcustomer
    //trkklckya@hotmail.com yazısının gözüktüğü doğrulanır"
    //kullanışlı ve rahat bir ürün, teşekkür ederim. yazının göründüğü doğrulanır

    HercaiPage hercaiPage = new HercaiPage();
    Actions actions = new Actions(Driver.getDriver());
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
    JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();

    @Test
    public void test01() throws InterruptedException {
        // Belirtilen URL` ye gidilir
        Driver.getDriver().get("https://allovercommerce.com/");
        //"Sing in" butonuna tıklanır
        hercaiPage.singin.click();
        //"Username or email adress" bölümüne vendor email girilir
        hercaiPage.email.sendKeys("grup20.testng@gmail.com");
        //"Password" bölümüne verdor password girilir
        //"Sing in" butonuna tıklanır
        actions.sendKeys(Keys.TAB).sendKeys(hercaiPage.password, "Vendor20.,")
                .sendKeys(Keys.TAB).click(hercaiPage.singinIkınci).perform();
        //Açılan sayfanın alt kısmında bulunan "My Account" butonuna tıklanır
        Driver.getDriver().navigate().refresh();
        wait.until(ExpectedConditions.visibilityOf(hercaiPage.myAccount));
        jse.executeScript("arguments[0].scrollIntoView(true);", hercaiPage.myAccount);
        jse.executeScript("arguments[0].click();", hercaiPage.myAccount);
        //"Store Manager" butonuna tıklanır
        hercaiPage.storeManager.click();
        //Reviews butonuna tıklanır
        jse.executeScript("arguments[0].scrollIntoView(true);", hercaiPage.reviewsYazisi);
        jse.executeScript("arguments[0].click();", hercaiPage.reviewsYazisi);
        wait.until(ExpectedConditions.visibilityOf(hercaiPage.reviewsYazisi));

        //Products Reviews kutucuğuna tıklanır
        wait.until(ExpectedConditions.visibilityOf(hercaiPage.productsReviews));
        hercaiPage.productsReviews.click();

        //Kullanıcı email yazısının göründüğü doğrulanır
        Assert.assertTrue(hercaiPage.userEmail.isDisplayed());

        //Kullanıcının comment yazının göründüğü doğrulanır
        Assert.assertTrue(hercaiPage.userComment.isDisplayed());


    }
}
