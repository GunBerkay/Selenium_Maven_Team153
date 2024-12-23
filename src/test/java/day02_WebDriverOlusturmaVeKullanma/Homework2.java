package day02_WebDriverOlusturmaVeKullanma;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework2 {

    public static void main(String[] args) throws InterruptedException {


        WebDriver driver=new ChromeDriver();

//
//        1. https://www.testotomasyonu.com/ sayfasina gidin
        driver.get("https://www.testotomasyonu.com/");

//        2. Sayfanin konumunu ve boyutlarini yazdirin
        System.out.println("Baslangic boyut : " + driver.manage().window().getSize());
        System.out.println("Baslangic konum " + driver.manage().window().getPosition());

//        3. Sayfayi simge durumuna getirin
        driver.manage().window().minimize();
        Thread.sleep(3000);

//        4. Simge durumunda 3 saniye bekleyip sayfayi maximize yapin
        driver.manage().window().maximize();
        Thread.sleep(3000);

//        5. Sayfanin konumunu ve boyutlarini maximize durumunda yazdirin
        System.out.println("Maximize  boyut : " + driver.manage().window().getSize());
        System.out.println("Maximize konum " + driver.manage().window().getPosition());

//        6. Sayfayi fullscreen yapin
        driver.manage().window().fullscreen();
        Thread.sleep(3000);

//        7. Sayfanin konumunu ve boyutlarini fullscreen durumunda yazdirin
        System.out.println("Fullscreen  boyut : " + driver.manage().window().getSize());
        System.out.println("Fullscren konum " + driver.manage().window().getPosition());

//        8. Sayfanin konumunu pixel olarak (50,50)’ye getirin
        driver.manage().window().setPosition(new Point(50,50));
        Thread.sleep(3000);


//        9. Sayfa boyutunu pixel olarak (1000,500)’ye ayarlayin
        driver.manage().window().setSize(new Dimension(1000,500));
        Thread.sleep(3000);

//        10. Sayfayi kapatin
        driver.quit();





    }
}
