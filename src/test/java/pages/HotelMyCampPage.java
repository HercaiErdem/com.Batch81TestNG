package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HotelMyCampPage {
    public WebElement girisYapilamadi;

    public HotelMyCampPage (){
        PageFactory.initElements(Driver.getDriver(),this); // Burdaki driver ordaki driver

    }

    @FindBy(xpath = "//a[text()='Log in']")
    public WebElement login;

    @FindBy(xpath = "//input[@id='UserName']")
    public WebElement userName;

    @FindBy(xpath = "//span[@class='username username-hide-on-mobile']")
    public WebElement girisYapildi;




}
