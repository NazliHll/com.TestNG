package tests.day19_smokeTest;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BrcPage;
import utilities.ConfigReader;
import utilities.Driver;

public class NegatifLoginTest {
    BrcPage brcPage=new BrcPage();
    @Test
    public void yanlisSifre() throws InterruptedException {
        brcPage=new BrcPage();
        /*
    1.https://www.bluerentalcars.com/ adresine git
    2.Login butonuna bas
    3.user email : customer@bluerentalcars.com
        password : 12345
        login butonuna tıklayın
       değerleri girildiğinde sayfaya başarılı bir şekilde giriş yap
     */
        Driver.getDriver().get(ConfigReader.getProperty("brcUrl"));
        Thread.sleep(2000);
        brcPage.ilkLoginButonu.click();
        brcPage.emailTextBox.sendKeys(ConfigReader.getProperty("brcValidEmail"));
        brcPage.passwordTextBox.sendKeys(ConfigReader.getProperty("brcWrongPassword"));
        brcPage.ikinciLoginButonu.click();

        Assert.assertTrue(brcPage.ikinciLoginButonu.isDisplayed());

        Driver.closeDriver();
    }
}
