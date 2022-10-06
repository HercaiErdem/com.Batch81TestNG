package tests.practice08;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import pages.HerOkuAppTekrarCozumuPage;
import utilities.ConfigReader;
import utilities.Driver;

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
}
