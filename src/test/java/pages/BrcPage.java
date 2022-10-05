package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class BrcPage {
    public BrcPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//a[@role='button'])[1]")
    public WebElement brclogin;

    @FindBy(xpath = "//input[@id='formBasicEmail']")
    public WebElement userEmail;

    @FindBy(xpath = "//button[@id='dropdown-basic-button']")
    public WebElement basariliGiris;

}
