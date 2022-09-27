package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public abstract class TestBaseBeforeMethodAfterMethod {

    protected WebDriver driver;
   protected String tarih;
// TestNG framework unde @Before ve @After notasyonlari yerine @BeforeMethod ve @AfterMethod kullanilir
    // Cakisma prensibi Junit deki Before, After ile aynidir.
    @BeforeMethod
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        LocalDateTime date = LocalDateTime.now();
        DateTimeFormatter formater = DateTimeFormatter.ofPattern("YYMMddHmmss");
         tarih = date.format(formater);
    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
      Thread.sleep(2000);
       driver.quit();
    }
}
