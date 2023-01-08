package tests.day16;

import org.testng.annotations.*;
import utilities.*;

public class C01_BeforeMethodAfterMethod extends TestBaseBeforeMethodAfterMethod {
    @Test
    public void amazonTesti() {
        driver.get("https://www.amazon.com");

    }

    @Test
    public void bestbuyTesti() {
        driver.get("https://www.bestbuy.com");

    }

    @Test
    public void techproecudationTesti() {
        driver.get("https://www.techproeducation.com");

    }
}
