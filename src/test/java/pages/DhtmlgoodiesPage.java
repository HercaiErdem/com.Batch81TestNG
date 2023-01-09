package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.*;
import utilities.*;

public class DhtmlgoodiesPage {

    // pagefactory'nin mantığı: pages sayfasında yer alan pagefactory ile
    // buradaki webelementleri driver ile ilişkilendirmiş oluyoruz.

    //Page Object Model in felsefesi;
    //1- Tekrarlardan kurtuluruz
    //2- Daha az kod daha çok iş
    //3- Kolayca update yapabilme

    public DhtmlgoodiesPage() {
        PageFactory.initElements(Driver.getDriver(), this);
      //this pageFactory in olmazsa olmazi, this i yazmazsak hata aliriz, cunku veri bulunamaz

    }

    //capitals --- baskentler
    @FindBy(xpath = "//div[@id='box1']")
    public WebElement oslo;

    @FindBy(xpath = "//div[@id='box2']")
    public WebElement stockholm;

    @FindBy(xpath = "//div[@id='box3']")
    public WebElement washington;

    @FindBy(xpath = "//div[@id='box4']")
    public WebElement copenhagen;

    @FindBy(xpath = "//div[@id='box5']")
    public WebElement seoul;

    @FindBy(xpath = "//div[@id='box6']")
    public WebElement rome;

    @FindBy(xpath = "//div[@id='box7']")
    public WebElement madrid;

    //countries --- ulkeler
    @FindBy(xpath = "//div[@id='box106']")
    public WebElement italy;

    @FindBy(xpath = "//div[@id='box107']")
    public WebElement spain;

    @FindBy(xpath = "//div[@id='box101']")
    public WebElement norway;

    @FindBy(xpath = "//div[@id='box104']")
    public WebElement denmark;

    @FindBy(xpath = "//div[@id='box105']")
    public WebElement southKorea;

    @FindBy(xpath = "//div[@id='box102']")
    public WebElement sweden;

    @FindBy(xpath = "//div[@id='box103']")
    public WebElement unitedState;

//PageFactory bizlere nesne deposu oluşturmaya imkan veren, sürdürülebilir,
//yeniden kullanılabilir ve elementleri tek bir yerden yönetmeyi sağlayan bir Page object model konseptidir.
//Page Factory’i kullanımına bakacak olursak PageFactory model, Web elementlerini
//@FindBy annotionu ile algılar. How kalıbı ile birlikte elementlerin ayırt edici
//locator’ından hangisini kullanacaksak belirtilir. Sonrasında ise o ayırt edici
//locator’ın adı tanımlanır. Public WebElement ile birlikte test senaryolarında
//kullanmak üzere isimlendirmesi yaparız. Burada isimlendirme daha sonra baktığında
//anlayabilmek için önemlidir, okunaklı olmalıdır.


}
