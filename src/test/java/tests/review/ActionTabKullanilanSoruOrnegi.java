package tests.review;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.*;
import org.openqa.selenium.support.ui.*;
import org.testng.annotations.*;
import utilities.*;

public class ActionTabKullanilanSoruOrnegi extends TestBaseBeforeMethodAfterMethod {
    // ...Exercise3...
// go to url : https://www.techlistic.com/p/selenium-practice-form.html
//fill the firstname
//fill the lastname
//check the gender
//check the experience
//fill the date
//choose your profession -> Automation Tester
//choose your tool -> Selenium Webdriver
//choose your continent -> Antartica
//choose your command  -> Browser Commands
//click submit button


    @Test
    public void test01() {
        // go to url : https://www.techlistic.com/p/selenium-practice-form.html
        driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
        // fill the firstname
        WebElement fistnameButton = driver.findElement(By.xpath("//input[@name='firstname']"));
        fistnameButton.sendKeys("Merve");
        //fill the lastname
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.TAB).sendKeys("Buyukbas")
                //check the gender
                .sendKeys(Keys.TAB).sendKeys(Keys.RIGHT)
                //check the experience
                .sendKeys(Keys.TAB).sendKeys(Keys.RIGHT).sendKeys(Keys.RIGHT)
                //fill the date
                .sendKeys(Keys.TAB).sendKeys("29.09.2022").perform();
        //choose your profession -> Automation Tester
        WebElement professionButton = driver.findElement(By.xpath("//input[@id='profession-1']"));
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("arguments[0].scrollIntoView(true);", professionButton);
        jse.executeScript("arguments[0].click();", professionButton);
        //choose your tool -> Selenium Webdriver
        driver.findElement(By.xpath("//input[@id='tool-2']")).click();
        //choose your continent -> Antartica
        WebElement continent = driver.findElement(By.xpath("//select[@id='continents']"));
        Select select = new Select(continent);
        select.selectByIndex(6);
        //choose your command  -> Wait Commands
        driver.findElement(By.xpath("//select[@id='selenium_commands']/option[4]")).click();
        //click submit button
        driver.findElement(By.xpath("//button[@id='submit']")).click();


    }
}
