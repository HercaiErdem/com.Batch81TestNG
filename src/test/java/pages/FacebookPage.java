package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.*;
import utilities.*;

public class FacebookPage {
    // constuctor olusturururz
    //Page fabrikasindan initElements methodusu cagiririz
    // Driver class indan this ile Driver.getDriver() cagiralim
    public FacebookPage() {

        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(xpath = "//input[@id='email']")
    public WebElement email;

    @FindBy(xpath = "//input[@id='pass']")
    public WebElement sifre;

    @FindBy(xpath = "//button[@name='login']")
    public WebElement login;

    @FindBy (xpath = "//div[@class='_9ay7']")
    public WebElement girisYapilmadi;


}
