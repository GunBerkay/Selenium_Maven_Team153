package day02_WebDriverOlusturmaVeKullanma;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;
import java.time.Duration;

public class Homework3 {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

//        1. Yeni bir class olusturun (TekrarTesti)
//        2. Youtube web sayfasına gidin ve sayfa başlığının “youtube” olup olmadığını
//        doğrulayın (verify), eğer değilse doğru başlığı(Actual Title) konsolda yazdirin.
        driver.get("https://www.youtube.com");
        String expectedTitle="youtube";
        String actualTitle= driver.getTitle();
        if (actualTitle.equals(expectedTitle)){
            System.out.println("Youtube title testi PASSED");
        }else {
            System.out.println("Youtube title testi FAILED " + driver.getTitle());
        }
        Thread.sleep(3000);

//        3. Sayfa URL'sinin “youtube” içerip içermediğini (contains) doğrulayın, içermiyorsa
//        doğru URL'yi yazdırın.
        String expectedUrl="youtube";
        String actualUrl=driver.getCurrentUrl();
        if (actualUrl.contains(expectedUrl)){
            System.out.println("Youtube Url testi PASSED");
        }else {
            System.out.println("Youtube Url testi FAILED" + driver.getCurrentUrl());
        }

//        4. Daha sonra testotomasyonu sayfasina gidin https://www.testotomasyonu.com/
        driver.get("https://www.testotomasyonu.com/");
        Thread.sleep(3000);

//        5. Youtube sayfasina geri donun
        driver.navigate().back();
        Thread.sleep(3000);

//        6. Sayfayi yenileyin
        driver.navigate().refresh();
        Thread.sleep(3000);

//        7. Testotomasyonu sayfasina donun
        driver.navigate().forward();
        Thread.sleep(3000);

//        8. Sayfayi tamsayfa yapin
        driver.manage().window().maximize();
        Thread.sleep(3000);

//        9. Ardından sayfa başlığının "Test" içerip içermediğini (contains) test edin, Yoksa
//        doğru başlığı(Actual Title) yazdırın.
        String expectecTestTitle="Test";
        String actualTestTitle= driver.getTitle();
        if (actualTestTitle.contains(expectecTestTitle)){
            System.out.println("Testotomasyonu.com Title testi PASSED");
        }else {
            System.out.println("Testotomasyonu.com Title testi FAILED " + driver.getTitle());
        }

//        10.Sayfa URL'sinin https://www.testotomasyonu.com/ olup olmadığını test edin,
//        degilse doğru URL'yi yazdırın
        String expectedTestOtomasyonuUrl="https://www.testotomasyonu.com/";
        String actualTestOtomasyonuUrl= driver.getCurrentUrl();
        if (actualTestOtomasyonuUrl.equals(expectedTestOtomasyonuUrl)){
            System.out.println("Testotomasyonu.com Url testi PASSED");
        }else {
            System.out.println("Testotomanyonu.com Url testi FAILED " + driver.getCurrentUrl());
        }

//        11.Sayfayi kapatin
        driver.quit();






    }
}
