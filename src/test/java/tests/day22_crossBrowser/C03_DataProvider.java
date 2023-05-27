package tests.day22_crossBrowser;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C03_DataProvider {


    @Test
    public void test01() {
        AmazonPage amazonPage=new AmazonPage();
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
        amazonPage.aramaKutusu.sendKeys("Nutella"+ Keys.ENTER);
        String expectedKelime="Nutella";
        String actualSonuc=amazonPage.aramaSonucElementi.getText();
        Assert.assertTrue(actualSonuc.contains(expectedKelime));
        Driver.closeDriver();
    }
    @DataProvider
    public static Object[][] AranacakKelimeler() {
        Object[][] arananKelimeArrayi={{"Nutella"},{"Java"},{"cigdem"},{"Netherlands"}};
        return arananKelimeArrayi;
    }

    @Test(dataProvider = "AranacakKelimeler")
    public void dataProviderTest(String arananKelime) {
        AmazonPage amazonPage=new AmazonPage();
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
        amazonPage.aramaKutusu.sendKeys(arananKelime+ Keys.ENTER);
        String expectedKelime=arananKelime;
        String actualSonuc=amazonPage.aramaSonucElementi.getText();

        Driver.closeDriver();

    }
}
