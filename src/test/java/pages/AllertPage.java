package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.*;
import utilities.*;
public class AllertPage {

    public AllertPage(){

        PageFactory.initElements(Driver.getDriver(),this);

    }
@FindBy (id = "button1")
    public WebElement clickMeButton ;











}
