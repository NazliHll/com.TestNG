package tests.day22_crossBrowser;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.BrcPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C04_NegativeLoginDataProvider {
    @DataProvider
    public static Object[][] kullaniciListesi() {
        Object[][]kullaniciBilgileri={{"firuze@nehaber.com","54678"},
                                     {"murat@benbilirim.com","65874"},
                                        {"ilyas@selam.com","85967"}};
        return kullaniciBilgileri;
    }
        BrcPage brcPage=new BrcPage();
        @Test(dataProvider = "kullaniciListesi")
        public void yanlisSifre(String userEmail,String password) throws InterruptedException {
            brcPage=new BrcPage();
        /*
    1.https://www.bluerentalcars.com/ adresine git
    2.Login butonuna bas
    3.user email : dataproviderdan alalim
        password : dataproviderdan alalim
        login butonuna tıklayın
       değerleri girildiğinde sayfaya başarılı bir şekilde giriş yap
     */
            Driver.getDriver().get(ConfigReader.getProperty("brcUrl"));
            Thread.sleep(2000);
            brcPage.ilkLoginButonu.click();
            brcPage.emailTextBox.sendKeys(userEmail);
            brcPage.passwordTextBox.sendKeys(password);
            brcPage.ikinciLoginButonu.click();

            Assert.assertTrue(brcPage.ikinciLoginButonu.isDisplayed());

            Driver.closeDriver();
        }
    }

