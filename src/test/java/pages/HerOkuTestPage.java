package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HerOkuTestPage {

    public HerOkuTestPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//button[@id='onblur']")
    public WebElement onblur;

    @FindBy(xpath = "//button[@id='onclick']")
    public WebElement onclick;

    @FindBy(xpath = "//button[@id='oncontextmenu']")
    public WebElement oncontextmenu;

    @FindBy(xpath = "//button[@id='ondoubleclick']")
    public WebElement ondoubleclick;

    @FindBy(xpath = "//button[@id='onfocus']")
    public WebElement onfocus;

    @FindBy(xpath = "//button[@id='onkeydown']")
    public WebElement onkeydown;

    @FindBy(xpath = "//*[@id='onkeyup']")
    public WebElement onkeyup;

    @FindBy (xpath = ("//button[@id='onkeypress']"))
    public WebElement keypress;

    @FindBy(xpath = "//button[@id='onmouseover']")
    public WebElement omouseover;

    @FindBy(xpath = ("//button[@id='onmouseleave']"))
    public WebElement mouseLeave;

    @FindBy(xpath = ("//button[@id='onmousedown']"))
    public WebElement mouseDown;

    @FindBy (xpath = "//p[text()='Event Triggered']")
    public WebElement eventTriggered;


}
