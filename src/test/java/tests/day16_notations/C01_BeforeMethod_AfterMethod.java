package tests.day16_notations;

import org.testng.annotations.Test;
import utilities.TestBase;

public class C01_BeforeMethod_AfterMethod extends TestBase {
    @Test
    public void test01() {
        driver.get("https://www.amazon.com");

    }
    @Test
    public void test02() {
        driver.get("https://www.bestbuy.com");

    }
    @Test
    public void instaTest() {
        driver.get("https://www.instagram.com");

    }
}
