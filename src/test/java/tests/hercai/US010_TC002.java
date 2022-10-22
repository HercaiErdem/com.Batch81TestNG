package tests.hercai;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HercaiPage;
import utilities.Driver;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class US010_TC002 {
    //Belirtilen URL` ye gidilir
    //Sing in butonuna tıklanır
    //Username or email adress bölümüne vendor email girilir
    //Password girilir
    //Sing In butonuna tıklanır
    //Sayfanın altından My Account butonuna tıklanır
    //Store Manager bölümüne tıklanır
    //Products yazısına tıklanır
    //Add New butonuna tıklanır
    //Aşağıda Attributes kutusuna tıklanır
    //Color yazısının olduğu doğrulanır
    //Color yazısının yanındaki kutucuğa tıklanır
    //Select All kutusuna basılır
    //Tum renklerin seçildiği doğrulanır
    //Size yazısının göründüğü doğrulanır
    //Size yazısının yanındaki kutucuğa tıklanır
    //Sırayla small, medium, large, extra large seçilir
    //small, medium, large, extra large seçildiği doğrulanır

    HercaiPage hercaiPage = new HercaiPage();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
    JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
    Actions actions = new Actions(Driver.getDriver());


    @Test
    public void test02() {
        //Belirtilen URL` ye gidilir
        Driver.getDriver().get("https://allovercommerce.com/");
        //Sing in butonuna tıklanır
        hercaiPage.singin.click();
        //Username or email adress bölümüne vendor email girilir
        hercaiPage.email.sendKeys("grup20.testng@gmail.com");
        //Password girilir
        hercaiPage.password.sendKeys("Vendor20.,");
        //Sing In butonuna tıklanır
        hercaiPage.singinIkınci.click();
        //Sayfanın altından My Account butonuna tıklanır
        Driver.getDriver().navigate().refresh();
        wait.until(ExpectedConditions.visibilityOf(hercaiPage.myAccount));
        jse.executeScript("arguments[0].scrollIntoView(true);", hercaiPage.myAccount);
        jse.executeScript("arguments[0].click();", hercaiPage.myAccount);
        //Store Manager bölümüne tıklanır
        hercaiPage.storeManager.click();
        //Products yazısına tıklanır
        hercaiPage.products.click();
        //Add New butonuna tıklanır
        hercaiPage.addNew.click();
        //Aşağıda Attributes kutusuna tıklanır
        Driver.getDriver().navigate().refresh();
        wait.until(ExpectedConditions.visibilityOf(hercaiPage.attributies));
       // actions.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN)
         //       .sendKeys(Keys.PAGE_DOWN).perform();
      //  hercaiPage.attributies.click();
        jse.executeScript("arguments[0].scrollIntoView(true);",hercaiPage.buYaziAttributeseTiklayabilmekIcinAlindi);
        jse.executeScript("arguments[0].click();",hercaiPage.attributies);
        //Color yazısının yanındaki kutucuğa tıklanır
        hercaiPage.colorBox.click();
        //Select All kutusuna basılır
        hercaiPage.selectAll.click();
        //Tum renklerin seçildiği doğrulanır
        wait.until(ExpectedConditions.visibilityOf(hercaiPage.allColorSelected));
        Assert.assertTrue(hercaiPage.allColorSelected.isDisplayed());
        //Size yazısının yanındaki kutucuğa tıklanır
        hercaiPage.sizeKucukBox.click();
        //Sırayla small, medium, large, extra large seçilir

        //--------------SOR------------------------------------
        //    List<WebElement> size= new ArrayList<>();
        // for (WebElement w: size) {
        //     select.selectByVisibleText("");
        Select select = new Select(hercaiPage.sizeBuyukBox);
        select.selectByVisibleText("small");
        select.selectByVisibleText("medium");
        select.selectByVisibleText("large");
        select.selectByVisibleText("extra large");

        //small, medium, large, extra large seçildiği doğrulanır
        Assert.assertTrue(hercaiPage.singinIkınci.isDisplayed());


    }
}

// }
