package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

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

    @FindBy(xpath = "(//div[@class='page_collapsible_content_holder'])[5]")
    public WebElement attributies;

    @FindBy(xpath = "//input[@id='attributes_is_active_1']")
    public WebElement colorBox;

    @FindBy(xpath = "(//ul[@class='select2-selection__rendered'])[2]")
    public WebElement colorBigBox;

    @FindBy(xpath = "(//button[text()='Select all'])[1]")
    public WebElement selectAll;

    @FindBy(xpath = "(//ul[@class='select2-selection__rendered'])[2]")
    public WebElement allColorSelected;

    @FindBy(xpath = "//input[@id='wcfm_products_simple_submit_button']")
    public WebElement submitButton;


}
