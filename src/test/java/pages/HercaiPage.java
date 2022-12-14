package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.*;
import utilities.*;
import java.util.*;

public class HercaiPage {
    public HercaiPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//span[.='Sign In']")
    public WebElement singin;

    @FindBy(xpath = "//input[@id='username']")
    public WebElement email;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement password;

    @FindBy(xpath = "//button[@name='login']")
    public WebElement singinIkınci;

    @FindBy(xpath = "(//a[@href='https://allovercommerce.com/my-account-2/'])[1]")
    public WebElement myAccount;

    @FindBy(xpath = "//a[text()='Store Manager']")
    public WebElement storeManager;

    @FindBy(xpath = "(//span[@class='text'])[4]")
    public WebElement products;

    @FindBy(xpath = "(//*[.='Add New'])[1]")
    public WebElement addNew;

    @FindBy(xpath = "//div[@id='wcfm_products_manage_form_attribute_head']")
    public WebElement attributies;

    @FindBy(xpath = "//input[@id='attributes_is_active_1']")
    public WebElement colorBox;

    @FindBy(xpath = "(//button[text()='Select all'])[1]")
    public WebElement selectAll;

    @FindBy(xpath = "(//ul[@class='select2-selection__rendered'])[2]")
    public List<WebElement> allColorSelected;

    @FindBy(xpath = "//input[@id='wcfm_products_simple_submit_button']")
    public WebElement submitButton;

    @FindBy(xpath = "//input[@id='attributes_is_active_2']")
    public WebElement sizeKucukBox;

    @FindBy(xpath = "(//button[@class='button wcfm_add_attribute_term wcfm_select_all_attributes'])[2]")
    public WebElement sizeSelectAllButton;
    @FindBy(xpath = "(//ul[@class='select2-selection__rendered'])[3]")
    public List<WebElement> sizeDogrulamaninYapildigiBox;




    //US020 in locate leri
    @FindBy(xpath = "(//span[@class='text'])[16]")
    public WebElement reviewsYazisi;

    @FindBy(xpath = "(//span[@class='text'])[18]")
    public WebElement productsReviews;

    @FindBy (xpath = "//div[@class='wcfmmp-author-meta']")
    public WebElement userEmail;

    @FindBy (xpath = "//div[@class='wcfmmp-comments-content']")
    public WebElement userComment;

    @FindBy (xpath = "//*[@style='width:100%']")
    public  WebElement rating;

    @FindBy (xpath = "//td[.='19 October 2022 13:13']")
    public  WebElement dated;








}
