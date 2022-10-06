package tests.practice09;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.SearchProductPage;
import utilities.Driver;
import utilities.TestBaseCross;
import utilities.TestBaseRapor;

public class SearchProductTest extends TestBaseRapor {

    // 1. Tarayıcıyı başlat
    // 2. 'http://automationexercise.com' url'sine gidin
    // 3. Ana sayfanın başarıyla görünür olduğunu doğrulayın
    // 4. 'Ürünler' butonuna tıklayın
    // 5. Kullanıcının TÜM ÜRÜNLER sayfasına başarıyla gittiğini doğrulayın
    // 6. Arama girişine ürün adını girin ve ara düğmesine tıklayın
    // 7. 'ARARAN ÜRÜNLER'in görünür olduğunu doğrulayın
    // 8. Aramayla ilgili ürünün ("blue top") görünür olduğunu doğrulayın

    SearchProductPage searchProductPage;
    Actions actions =new Actions(Driver.getDriver());

    @Test
    public void searchProductPage() throws InterruptedException {
        extentTest=extentReports.createTest("automationexcercise","Web automation");

        // 1. Tarayıcıyı başlat
        // 2. 'http://automationexercise.com' url'sine gidin
        extentTest.info("   // 1. Tarayıcıyı başlat\n" +
                "        // 2. 'http://automationexercise.com' url'sine gidin");

        Driver.getDriver().get("http://automationexercise.com");
        // 3. Ana sayfanın başarıyla görünür olduğunu doğrulayın
        String expectedUrl = "https://automationexercise.com/";
        Assert.assertEquals(Driver.getDriver().getCurrentUrl(), expectedUrl);
        extentTest.info("3. Ana sayfanın başarıyla görünür olduğunu doğrulayın");
        // 4. 'Ürünler' butonuna tıklayın
        searchProductPage = new SearchProductPage();
        searchProductPage.products.click();
        extentTest.info("4. 'Ürünler' butonuna tıklayın");
        // 5. Kullanıcının TÜM ÜRÜNLER sayfasına başarıyla gittiğini doğrulayın
        Assert.assertTrue(searchProductPage.allProductTitle.isDisplayed());
        extentTest.info("5. Kullanıcının TÜM ÜRÜNLER sayfasına başarıyla gittiğini doğrulayın");
        // 6. Arama girişine ürün adını girin ve ara düğmesine tıklayın
        searchProductPage.searchBox.sendKeys("blue top");
        // sendKeys("Dress", Keys.TAB,Keys.ENTER) ---> boyle de calisir
        searchProductPage.searchButton.click();
        // 7. 'ARARAN ÜRÜNLER'in görünür olduğunu doğrulayın
        Assert.assertTrue(searchProductPage.searchedProducts.isDisplayed());
        // 8. Aramayla ilgili ürünün ("blue top") görünür olduğunu doğrulayın
        Thread.sleep(2000);
        actions.click(searchProductPage.viewProduct).perform();
         Assert.assertTrue(searchProductPage.blueTop.isDisplayed());
        extentTest.pass("Aramayla ilgili ürünün (\"blue top\") görünür olduğu doğrulandı");



    }


}
