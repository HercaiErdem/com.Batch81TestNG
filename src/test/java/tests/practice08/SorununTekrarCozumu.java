package tests.practice08;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HerOkuAppTekrarCozumuPage;
import tests.day17.C01_DependsOnMethods;
import utilities.ConfigReader;
import utilities.Driver;

import java.util.List;

public class SorununTekrarCozumu {

    HerOkuAppTekrarCozumuPage herOkuAppTekrarCozumuPage;
    Actions actions= new Actions(Driver.getDriver());

    @Test
    public void test01() {
        //Go to https://testpages.herokuapp.com/styled/events/javascript-events.html
        Driver.getDriver().get(ConfigReader.getProperty("herOkApp"));

       //Click all the buttons and verify they are all clicked
        herOkuAppTekrarCozumuPage= new HerOkuAppTekrarCozumuPage();
        herOkuAppTekrarCozumuPage.onBlur.click();
        herOkuAppTekrarCozumuPage.boslugaClick.click();
        herOkuAppTekrarCozumuPage.onClick.click();
actions.contextClick(herOkuAppTekrarCozumuPage.onContextMenu)
        .doubleClick(herOkuAppTekrarCozumuPage.onDoubleClick)
        .click(herOkuAppTekrarCozumuPage.onFocus)
        .click(herOkuAppTekrarCozumuPage.onKeyDown)
        .sendKeys(Keys.ENTER)
        .click(herOkuAppTekrarCozumuPage.onKeyUp)
        .sendKeys(Keys.ENTER)
        .click(herOkuAppTekrarCozumuPage.onKeyPress)
        .sendKeys(Keys.ENTER)
        .moveToElement(herOkuAppTekrarCozumuPage.onMouseOver)
        .moveToElement(herOkuAppTekrarCozumuPage.onMouseLeave)
        .click(herOkuAppTekrarCozumuPage.onMouseDown)
        .click(herOkuAppTekrarCozumuPage.onMouseDown).perform();
    }

    @Test (dependsOnMethods = "test01")
    public void test02() {

        List<WebElement> clicked= herOkuAppTekrarCozumuPage.triggered;
        Assert.assertEquals(clicked.size(),11);

    }
}
