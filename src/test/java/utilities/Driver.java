package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Driver {
    /*pomde driver icin TestBase classsina extends etmek yerine
    driver classindan static methodlar kullanilarak driver olusturup
    ilgili ayarlarin yapilmasi en sonda driverin kapatilmasi tercih edilir.*/

    static WebDriver driver;

    public static WebDriver getDriver(){
        if (driver==null) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        }
        return driver;
    }

    public static void closeDriver(){
        if (driver!=null) {
            driver.close();
            driver = null;
        }
    }
}