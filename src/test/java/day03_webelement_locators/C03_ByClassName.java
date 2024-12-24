package day03_webelement_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C03_ByClassName {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        //testotomasyonu anasayfaya gidin
        driver.get("https://www.testotomasyonu.com");

        //arama kutusan phone yazip aratin
        WebElement aramaKutusu= driver.findElement(By.className("search-input"));
        aramaKutusu.sendKeys("phone" + Keys.ENTER);

        //Bulunan urunlerin sayisini ,  gosterilen urun resim adetine bakarak bulun
        List<WebElement> bulunanUrunElementleriList = driver.findElements(By.className("prod-img"));
        System.out.println("Bulunan urun sayisi " + bulunanUrunElementleriList.size());

        // ve kac urun bulunabildigini yazdirin
        int actualBulunanUrunSayisi=bulunanUrunElementleriList.size();

        if (actualBulunanUrunSayisi>0){
            System.out.println("Urun arama testi PASSED");
        }else System.out.println("Urun arama testi FAILED");

        // ? bulunan urunlerin isimlerini yazdirin

//        for (WebElement eachElement:bulunanUrunElementleriList){
//            System.out.println(eachElement.getText());
//        }

        //ilk urunu tiklayin
        bulunanUrunElementleriList.get(0).click();

        //acilan urun sayfasindaki urun isimince
        // case sensitive olmadan "phone gectigini test edin "
        String expectedIsimIcerik="phone";
        WebElement urunDetayElementi = driver.findElement(By.className("prod-detail"));
        String urunDetayi=urunDetayElementi.getText().toLowerCase();

        if (urunDetayi.contains(expectedIsimIcerik)){
            System.out.println("Urun detay testti PASSED");
        }else System.out.println("Urun detay testi FAILED");

        //sayfayi kapatin
        Thread.sleep(2000);
        driver.quit();



    }
}
