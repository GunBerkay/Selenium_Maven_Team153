package day02_WebDriverOlusturmaVeKullanma;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_IlkTestOtomasyoun {

    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();

//        1. testotomasyonu sayfasina gidelim. https://www.testotomasyonu.com/
        driver.get(" https://www.testotomasyonu.com/");

//        2. Sayfa basligini(title) yazdirin
        String actualTitle = driver.getTitle();
        System.out.println(driver.getTitle());

//        3. Sayfa basliginin “Test Otomasyonu” icerdigini test edin
        String expectedTitleIcerik = "Test Otomasyonu";
        if (actualTitle.contains(expectedTitleIcerik)){
            System.out.println("Title testi PASSED");
        } else System.out.println("Title testi FAILED");

//        4. Sayfa adresini(url) yazdirin
        String actualUrl=driver.getCurrentUrl();
        System.out.println(driver.getCurrentUrl());

//        5. Sayfa url’inin https://testotomasyonu.com/ oldugunu test edin.
        String expectedUrl="https://testotomasyonu.com/";
        if (expectedUrl.equals(actualUrl)){
            System.out.println("Url testi PASSED");
        }else System.out.println("Url testi FAILED");

//        6. Sayfa handle degerini yazdirin
        System.out.println(driver.getWindowHandle());

//        7. Sayfa HTML kodlarinda “otomasyon” kelimesi gectigini test edin
        String expectedDeger="otomasyon";
        String actualDger=driver.getPageSource();
        if (actualDger.contains(expectedDeger)){
            System.out.println("Test Passed");
        }else {
            System.out.println("Test Failed");
        }

//        8. Sayfayi kapatin.
        driver.quit();



    }


}
