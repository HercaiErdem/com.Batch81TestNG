package tests.practice08;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.*;
import org.testng.*;
import org.testng.annotations.*;
import pages.*;
import utilities.*;
import java.util.*;

public class P01 {
    //Go to https://testpages.herokuapp.com/styled/events/javascript-events.html
//Click all the buttons and verify they are all clicked

    HerOkuTestPage herOkuTestPage;
    Actions actions = new Actions(Driver.getDriver());

    @Test
    public void test01() throws InterruptedException {
        //Go to https://testpages.herokuapp.com/styled/events/javascript-events.html
        Driver.getDriver().get("https://testpages.herokuapp.com/styled/events/javascript-events.html");

//Click all the buttons and verify they are all clicked
        /*
        kodlarımız yazarken clean code kapsamında daha sade kod yazabilmek amacı ile her test methodu içerisinde
        ayrı bir object create etmektense bu objecti class seviyesinde instance olarak create edip
        test methodlarında buna değer atamak ve kullanmak daha uygun bir yöntemdir
        */
        herOkuTestPage = new HerOkuTestPage();
        herOkuTestPage.onblur.click();
        herOkuTestPage.onclick.click();
        herOkuTestPage.onclick.click();
        actions.contextClick(herOkuTestPage.oncontextmenu).
                doubleClick(herOkuTestPage.ondoubleclick).
                click(herOkuTestPage.onfocus).
                click(herOkuTestPage.keydown)
                .sendKeys(Keys.ENTER). // klayve action inda sendKeys le yapiliyor
                click(herOkuTestPage.keyup).
                sendKeys(Keys.ENTER).
                click(herOkuTestPage.keypress).
                sendKeys(Keys.ENTER).
                moveToElement(herOkuTestPage.mouseOver). // mouse over --> mouse u uzerinde beklet
                moveToElement(herOkuTestPage.mouseLeave).
                moveToElement(herOkuTestPage.mouseOver).
                click(herOkuTestPage.mouseDown)
                .perform();
        Thread.sleep(2000);

    }

    @Test(dependsOnMethods = "test01")
    public void test02() {
        List<WebElement> clicked = herOkuTestPage.eventTriggered;
        Assert.assertEquals(clicked.size(), 11);
    }
}

