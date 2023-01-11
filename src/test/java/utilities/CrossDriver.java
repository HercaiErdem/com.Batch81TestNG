package utilities;

import io.github.bonigarcia.wdm.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.firefox.*;
import org.openqa.selenium.opera.*;
import java.time.*;

public class CrossDriver {
    private CrossDriver() {  // singlton Pattern oldugu icin Driver ismini degistirdik

    }

    static WebDriver driver;

    public static WebDriver getDriver(String browser) {
        //Eger browser'a bir deger atanmamissa properties dosyasinda tanimli  browser calisir.
        browser = browser == null ? ConfigReader.getProperty("browser") : browser;

        //Testlerimizi xml file'dan farkli browserlar ile calistirabilmek icin getDriver() methoduna
        //  parametre atmamiz gerekir.
        if (driver == null) {
            switch (browser) {
                //CrossBrowser icin bizim gönderdigimiz browser uzerinden calismasi icin
                //buraya parametre olarak girdigimiz degeri yazdik
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    break;
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                    break;
                case "opera":
                    WebDriverManager.operadriver().setup();
                    driver = new OperaDriver();
                    break;
                case "headless-chrome":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver(new ChromeOptions().setHeadless(true));
                    break;
                default:
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
            }
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        }
        return driver;
    }

    public static void closeDriver() {
        if (driver != null) { // driver'a değer atanmışsa kapat
            driver.close();
            driver = null; // Kapandıktan sonra sonraki açmaları garanti altına almak için driver'i tekrar null yaptık
        }
    }

    public static void quitDriver() {
        if (driver != null)
            driver.quit();
        driver = null;
    }
}
