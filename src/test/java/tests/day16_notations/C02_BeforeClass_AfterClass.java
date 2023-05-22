package tests.day16_notations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utilities.TestBase;

public class C02_BeforeClass_AfterClass extends TestBase {
    @BeforeClass
    public void beforeClassMethod(){
        System.out.println("before class");
    }
    @AfterClass
    public void afterClassMethod(){
        System.out.println("after class");
    }
    @Test
    public void test01() {
        driver.get("https://www.amazon.com");
        System.out.println(driver.getCurrentUrl());

    }
    @Test
    public void test02() {
        driver.get("https://www.bestbuy.com");
        System.out.println(driver.getCurrentUrl());

    }
    @Test
    public void instaTest() {
        driver.get("https://www.instagram.com");
        System.out.println(driver.getCurrentUrl());

    }
}
