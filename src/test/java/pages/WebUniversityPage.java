package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.*;
import utilities.*;
import java.util.*;

public class WebUniversityPage {


    public WebUniversityPage(){
        PageFactory.initElements(Driver.getDriver(),this);

    }
@FindBy (xpath = "//input[@type='text']")
    public WebElement addNewToDo;

    @FindBy (xpath = "//li")
    public List<WebElement> todosWebelement;
    @FindBy (xpath = "//i[@class='fa fa-trash']")
    public List<WebElement> deleteButtonsWebelement;
    @FindBy (xpath = "//li")
    public List<WebElement> newtodosWebelement;

}
