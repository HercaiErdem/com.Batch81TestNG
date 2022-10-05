package tests.practice07;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.WebUniversityPage;
import utilities.Driver;

import java.util.ArrayList;
import java.util.List;

public class PracticeHomework {

        // http://webdriveruniversity.com/To-Do-List/index.html adresine gidin
        // Todos ekle:
        //(Kahvaltıyı hazırla, çocuğu okula bırak, eve gelip ingilizce speaking yap, soru çöz, çocuğu okuldan al, derse gir, uyu)
        //Tüm yapılacakların üzerini çiz.
        //Tüm yapılacakları sil.
        //Tüm yapılacakların silindiğini doğrulayın.
        @Test
        public void test01() throws InterruptedException {
            // http://webdriveruniversity.com/To-Do-List/index.html adresine gidin
            Driver.getDriver().get("http://webdriveruniversity.com/To-Do-List/index.html");
            //        // Todos ekle:
            //        (Kahvaltıyı hazırla, çocuğu okula bırak, eve gelip ingilizce speaking yap, soru çöz, çocuğu okuldan al, derse gir, uyu)
            WebUniversityPage webUniversityPage = new WebUniversityPage();
            List<String> todosList = new ArrayList<>();
            todosList.add("Kahvaltıyı hazırla");
            todosList.add("çocuğu okula bırak");
            todosList.add("eve gelip ingilizce speaking yap");
            todosList.add("soru çöz");
            todosList.add("çocuğu okuldan al");
            todosList.add("derse gir");
            todosList.add("uyu");
            // for (int i = 0; i <= todosList.size(); i++) {
            //     webUniversityPage.adNewTodo.sendKeys(todosList.get(i), Keys.ENTER);
            // }
            for (String each:todosList) {
                webUniversityPage.addNewToDo.sendKeys(each, Keys.ENTER);
            }
            Thread.sleep(1500);
            //Tüm yapılacakların üzerini çiz.
            for (WebElement each:webUniversityPage.todosWebelement) {
                each.click();
            }
            //Tüm yapılacakları sil.
            for (WebElement each:webUniversityPage.deleteButtonsWebelement) {
                each.click();
            }
            Thread.sleep(1500);
            //Tüm yapılacakların silindiğini doğrulayın.
            //System.out.println(webUniversityPage.newtodosWebelement.size());
            //System.out.println(webUniversityPage.newtodosWebelement.toString());
            //System.out.println("bos mu = " + todosList.toString());
            List<WebElement> boslist = webUniversityPage.newtodosWebelement;
            Assert.assertEquals(0,boslist.size());
            Thread.sleep(1000);
            Driver.closeDriver();

        }
    }

