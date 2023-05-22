package tests.day17_pom;

import org.testng.annotations.Test;
import utilities.Driver;

public class C03_PageClassKullanimi {
    @Test
    public void test01() {
        /*
        1.Facebook anasayfaya gidin
        cookies kabul edin
        2.Kullanıcı mail kutusuna rastgele isim yazdırın
        3.Kullanıcı şifre kutusuna rastgele bir password yazdırın
        4.Login butonuna basın
        5.Giriş yapılamadığını test edin
         */
        Driver.getDriver().get("https://www.facebook.com");
    }
}
