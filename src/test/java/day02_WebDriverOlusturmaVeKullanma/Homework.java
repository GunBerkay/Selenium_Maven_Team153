package day02_WebDriverOlusturmaVeKullanma;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;
import java.time.Duration;

public class Homework {
    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

//        1.Yeni bir class olusturalim (Homework)
//        2.ChromeDriver kullanarak, facebook sayfasina gidin ve sayfa basliginin
//                (title) “facebook” oldugunu test edin, degilse dogru basligi yazdirin.
        driver.get("https://www.facebook.com/");
        String expectedTitle="facebook";
        String actualTitle= driver.getTitle();
        if (actualTitle.contains(expectedTitle)){
            System.out.println("Facebook title testi PASSED");
        }else {
            System.out.println("Facebook title testi FAILED");
            System.out.println(driver.getTitle());
        }

//        3.Sayfa URL’inin “facebook” kelimesi icerdigini dogrulayin, icermiyorsa
//         “actual” URL’i yazdirin.
        String expectedUrl="facebook";
        String actualUrl= driver.getCurrentUrl();
        if (actualUrl.contains(expectedUrl)){
            System.out.println("Facebook url testi PASSED");
        }else {
            System.out.println("Facebook url testi FAILED");
        }

//        4.https://www.walmart.com/ sayfasina gidin.
        driver.get("https://www.walmart.com/");

//        5. Sayfa basliginin “Walmart.com” icerdigini dogrulayin.
        String expectedBaslik="Walmart.com";
        String actualBaslik= driver.getTitle();
        if (actualBaslik.contains(expectedBaslik)){
            System.out.println("Walmart baslik testi PASSED");
        }else {
            System.out.println("Walmart baslik testi FAILED");
            System.out.println(driver.getTitle());
        }

//        6. Tekrar “facebook” sayfasina donun
        driver.navigate().back();

//        7. Sayfayi yenileyin
        driver.navigate().refresh();

//        8. Sayfayi tam sayfa (maximize) yapin
        driver.manage().window().maximize();

//        9.Browser’i kapatin
        driver.quit();



    }
}
