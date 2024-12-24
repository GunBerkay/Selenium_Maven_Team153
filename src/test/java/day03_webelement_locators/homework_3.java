package day03_webelement_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import utilities.ReusableMethods;

import java.time.Duration;
import java.util.List;

public class homework_3 {
    public static void main(String[] args) {

//        1- Bir test class’i olusturun ilgili ayarlari yapin
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

//        2- http://zero.webappsecurity.com/ adresine gidin
        driver.get("http://zero.webappsecurity.com/");

//        3- “ONLINE BANKING” linkine tiklayin
        driver.findElement(By.id("onlineBankingMenu")).click();

//        4- Resim altinda 6 islem basligi oldugunu test edin
        List<WebElement> baslikElementleriList=driver.findElements(By.className("headers"));
        int expectedBaslikSayisi=6;
        int actualBaslikSayisi=baslikElementleriList.size();

        if (expectedBaslikSayisi==actualBaslikSayisi){
            System.out.println("Baslik sayisi testi PASSED");
        }else System.out.println("Baslik sayisi testi FAILED");

//        5- Islem basliklari icinde “Pay Bills” oldugunu test edin
        List<String> islemBasliklarListesi = ReusableMethods.stringListeyeCevir(baslikElementleriList);

        if (islemBasliklarListesi.contains("Pay Bills")){
            System.out.println("PayBills testi PASSED");
        }else System.out.println("PayBills testi FAILED");

//        6- Sayfayi kapatin
        driver.quit();


    }
}
