package tests.day18;

import com.github.javafaker.*;
import org.testng.*;
import org.testng.annotations.*;
import pages.*;
import utilities.*;

public class C01_PageClassFacebookTest {

    @Test
    public void test01() {

        // https://www.facebook.com/ adresine gidin
        Driver.getDriver().get("https://www.facebook.com/");
        //POM’a uygun olarak email, sifre kutularini ve giris yap
        //butonunu locate edin
        FacebookPage facebookPage = new FacebookPage();
        //Faker class’ini kullanarak email ve sifre degerlerini
        Faker faker = new Faker();
        //yazdirip giris butonuna basin
        facebookPage.email.sendKeys(faker.internet().emailAddress());
        facebookPage.sifre.sendKeys(faker.internet().password());
        facebookPage.login.click();
        //Basarili giris yapilamadigini test edin
        Assert.assertTrue(facebookPage.girisYapilmadi.isDisplayed());


    }
}
