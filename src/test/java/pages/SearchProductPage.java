package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.*;
import utilities.*;

public class SearchProductPage {

    public SearchProductPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (xpath = "//a[@href='/products']")
    public WebElement products;

    @FindBy (xpath = "//h2[@class='title text-center']")
    public WebElement allProductTitle;

    @FindBy (xpath = "//input[@id='search_product']")
    public WebElement searchBox;

    @FindBy (xpath = "//button[@id='submit_search']")
    public WebElement searchButton;

    @FindBy (xpath = "//h2[@class='title text-center']")
    public WebElement searchedProducts;

    @FindBy (linkText = "View Product")
    public  WebElement viewProduct;

    @FindBy (xpath = "(//h2)[3]")
    public WebElement blueTop;


}
