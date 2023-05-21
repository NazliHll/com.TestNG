package day16_notations;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utilities.TestBase;

public class C06_SoftAssert extends TestBase {
     /*
        SoftAssert başlangıç ve bitiş satırları arasındaki tüm assertion'ları yapıp
        bitiş  satırına geldiğinde bize bulduğu tüm hataları rapor eder.

        Softassert başlangıcı obje oluşturmaktır.

         ***Soft Assert***(Verification)
        SoftAssert doğrulama (verification) olarak da bilinir. softAssertion kullandığımızda,assert FAILED olsa bile
        test methodunun istediğimiz kısmını durdurmaz ve yürümeye devam eder. if-else statementda olduğu gibi.

        Test methodunun istediğiimiz bölümde yapılan tüm testleri raporlar.
        Eğer assertionlardan FAILED olan varsa raporlama yapılan satırdan sonrasını çalıştırmaz.
        (assertAll() a kadar çalıştırır assertAll() dan sonrasını çalıştırmaz)
    */

    @Test
    public void test01() {
        SoftAssert softAssert = new SoftAssert();
        driver.get("https://www.amazon.com");
        String expectedTitle="amazon";
        String actualTitle=driver.getTitle();
        softAssert.assertTrue(actualTitle.contains(expectedTitle),"title amazon icermiyor");
        WebElement aramaKutusu= driver.findElement(By.id("twotabsearchtextbox"));
        softAssert.assertTrue(aramaKutusu.isEnabled(),"arama kutusuna erisilemiyor");
        aramaKutusu.sendKeys("Nutella"+ Keys.ENTER);
        WebElement sonucYaziElementi= driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']"));
        softAssert.assertTrue(sonucYaziElementi.isDisplayed(),"arama yapilamadi");
        softAssert.assertTrue(sonucYaziElementi.getText().contains("Kutella"),"kutella icermiyor");
        softAssert.assertAll();

    }
}
