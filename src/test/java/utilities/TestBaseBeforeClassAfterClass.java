package utilities;

import io.github.bonigarcia.wdm.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.testng.annotations.*;
import java.time.*;

public abstract class TestBaseBeforeClassAfterClass {

    protected WebDriver driver;
    // @BeforeClass ve @AfterClass notasyonlarını TestNG de kullanırken JUnit'teki gibi static
    // yapmaya gerek yoktur.

    @BeforeClass
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }

    @AfterClass
    public void tearDown() throws InterruptedException {
      //  Thread.sleep(2000);
      //  driver.quit();
    }
}
