package tests.hercai;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import pages.HercaiPage;
import utilities.Driver;

import java.time.Duration;

public class US010_TC001 {
    //US-Renk secenegi; beyaz, siyah, yeşil vs tum renkler belirtilmeli

    //Belirtilen URL` ye gidilir "https://allovercommerce.com/"
    //Sing in butonuna tıklanır
    //Username or email adress bölümüne vendor email girilir "grup20.testng@gmail.com"
    //Password girilir "Vendor20.,"
    //Sing In butonuna tıklanır
    //Sayfanın altından My Account butonuna tıklanır
    //Store Manager bölümüne tıklanır
    //Products yazısına tıklanır
    //Add New butonuna tıklanır
    //Aşağıda Attributes kutusuna tıklanır
    //Color yazısının yanındaki kutucuğa tıklanır
    //Aşağı oka tıklanır
    //Select All kutusuna basılır
    //Tum renklerin seçildiği doğrulanır
    //SUBMIT butonuna tıklanır

    HercaiPage hercaiPage = new HercaiPage();
    Actions actions = new Actions(Driver.getDriver());
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
    JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();

    @Test
    public void test01() throws InterruptedException {
        //Belirtilen URL` ye gidilir "https://allovercommerce.com/"
        Driver.getDriver().get("https://allovercommerce.com/");
        //Sing in butonuna tıklanır
        hercaiPage.singin.click();

        //Username or email adress bölümüne vendor email girilir "grup20.testng@gmail.com"
        hercaiPage.email.sendKeys("grup20.testng@gmail.com");
        //Password girilir "Vendor20.,"
        //Sing In butonuna tıklanır
        actions.sendKeys(Keys.TAB).sendKeys(hercaiPage.password, "Vendor20.,")
                .sendKeys(Keys.TAB).click(hercaiPage.singinIkınci).perform();
        //Sayfanın altından My Account butonuna tıklanır
        Driver.getDriver().navigate().refresh();
      //  actions.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).perform();
        wait.until(ExpectedConditions.visibilityOf(hercaiPage.myAccount));
     //   hercaiPage.myAccount.click();
         jse.executeScript("arguments[0].scrollIntoView(true);", hercaiPage.myAccount);
         jse.executeScript("arguments[0].click();",hercaiPage.myAccount);

        //Store Manager bölümüne tıklanır
     //   hercaiPage.storeManager.click();
        //Products yazısına tıklanır

        //Add New butonuna tıklanır

        //Aşağıda Attributes kutusuna tıklanır

        //Color yazısının yanındaki kutucuğa tıklanır

        //Aşağı oka tıklanır

        //Select All kutusuna basılır

        //Tum renklerin seçildiği doğrulanır

        //SUBMIT butonuna tıklanır


    }


}
