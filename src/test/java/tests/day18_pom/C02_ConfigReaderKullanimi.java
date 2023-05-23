package tests.day18_pom;

import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FacebookPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C02_ConfigReaderKullanimi {
    @Test
    public void test01() {
        FacebookPage facebookPage=new FacebookPage();
        /*
        1.Facebook anasayfaya gidin
        cookies kabul edin
        2.Kullanıcı mail kutusuna yanlis isim yazdırın
        3.Kullanıcı şifre kutusuna yanlis bir password yazdırın
        4.Login butonuna basın
        5.Giriş yapılamadığını test edin
        6.sayfayi kapatin
         */
        Driver.getDriver().get(ConfigReader.getProperty("facebookUrl"));
        facebookPage.mailKutusu.sendKeys(ConfigReader.getProperty("fbWrongUsername"));
        facebookPage.sifreKutusu.sendKeys(ConfigReader.getProperty("fbWrongPassword"));
        facebookPage.loginKutusu.click();
        Assert.assertTrue(facebookPage.girilemediYaziElementi.isDisplayed());
        Driver.closeDriver();


    }
}
