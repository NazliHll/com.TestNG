package tests.day21_reusableMethods_HtmlReports;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BrcPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class C03_PositiveLoginTestiRaporlu extends TestBaseRapor {

    BrcPage brcPage = new BrcPage();

    @Test
    public void positiveLoginTest() {
        extentTest=extentReports.createTest("Pozitif Login","gecerli username ve sifre ile giris yapabilmeli");


    /*
    1.https://www.bluerentalcars.com/ adresine git
    2.Login butonuna bas
    3.user email : customer@bluerentalcars.com
        password : 12345
        login butonuna tıklayın
       değerleri girildiğinde sayfaya başarılı bir şekilde giriş yap
     */
        Driver.getDriver().get(ConfigReader.getProperty("brcUrl"));
        extentTest.info("brc anasayfaya gidildi");
        brcPage.ilkLoginButonu.click();
        extentTest.info("login butonuna tiklandi");
        brcPage.emailTextBox.sendKeys(ConfigReader.getProperty("brcValidEmail"));
        extentTest.info("gecerli email yazildi");
        brcPage.passwordTextBox.sendKeys(ConfigReader.getProperty("brcValidPassword"));
        extentTest.info("gecerli password yazildi");
        brcPage.ikinciLoginButonu.click();
        extentTest.info("login butonuna basildi");

        String actualUsername = brcPage.kullaniciProfilIsmi.getText();
        String expectedUsername = ConfigReader.getProperty("brcValidUsername");
        Assert.assertEquals(actualUsername, expectedUsername);
        extentTest.pass("kullanici basarili bir sekilde giris yapti");

        Driver.closeDriver();
    }
}
