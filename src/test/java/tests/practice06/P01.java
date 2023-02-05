package tests.practice06;

import org.openqa.selenium.interactions.*;
import org.testng.annotations.*;
import pages.*;
import utilities.*;

public class P01 {

    // Go to URL : http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html
    // Fill in capitals by country.

    @Test
    public void test01() {
        // Go to URL : http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html
        Driver.getDriver().get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");

        // Fill in capitals by country.
        DhtmlgoodiesPage dhtmlgoodiesPage = new DhtmlgoodiesPage();
        Actions actions = new Actions(Driver.getDriver());
        actions.dragAndDrop(dhtmlgoodiesPage.oslo, dhtmlgoodiesPage.norway)
                .dragAndDrop(dhtmlgoodiesPage.stockholm, dhtmlgoodiesPage.sweden)
                .dragAndDrop(dhtmlgoodiesPage.washington, dhtmlgoodiesPage.unitedState)
                .dragAndDrop(dhtmlgoodiesPage.copenhagen, dhtmlgoodiesPage.denmark)
                .dragAndDrop(dhtmlgoodiesPage.seoul, dhtmlgoodiesPage.southKorea)
                .dragAndDrop(dhtmlgoodiesPage.rome, dhtmlgoodiesPage.italy)
                .dragAndDrop(dhtmlgoodiesPage.madrid, dhtmlgoodiesPage.spain).perform();

        Driver.closeDriver();
        /*
         * Framework ler buyudukce yeni class lar yeni test methodlari webelementler olusturdukca
         * icinden cikilmaz,anlasilmaz, tekrar bakimi yapilamaz, update edilmesi cok zor hatta imkansiz
         * bir hal alir

         * uzmanlar, reusable maintinable, rahat manipule edilebilir bir framework icin bir design pattern
         * olarak POM PAGE OBJECT MODEL de karar vermisler
         * olmazsa olmaz
         * 1. driver class
         * 2. page class
         * 3. test class
         * utilities

         *Aradigimiz bir web elementi ya da bir methodu kolaylikla bulabilmek ve update edebilmek icin
         *javadan ogrenmis oldugumuz OOP Concept Selenium ile page object modelde birlestirilmis oluyor.
         */


    }
}
