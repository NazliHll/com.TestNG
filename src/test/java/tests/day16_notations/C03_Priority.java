package tests.day16_notations;

import org.testng.annotations.Test;
import utilities.Driver;
import utilities.TestBase;

public class C03_Priority extends TestBase {
    @Test(priority = -5)
    public void test01() {
        driver.get("https://www.amazon.com");
        System.out.println(driver.getCurrentUrl());

    }
    @Test(priority = -2)
    public void test02() {
        driver.get("https://www.bestbuy.com");
        System.out.println(driver.getCurrentUrl());

    }
    @Test(groups = "grup1")
    public void instaTest() {
        driver.get("https://www.instagram.com");
        System.out.println(driver.getCurrentUrl());

    }

}
