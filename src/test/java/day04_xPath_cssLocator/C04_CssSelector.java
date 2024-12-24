package day04_xPath_cssLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C04_CssSelector {

    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


//        2- https://www.testotomasyonu.com/ adresine gidin
        driver.get(" https://www.testotomasyonu.com/");

//        3- Browseri tam sayfa yapin
        driver.manage().window().maximize();

//        4- Sayfayi “refresh” yapin
        driver.navigate().refresh();

//        5- Sayfa basliginin “Test Otomasyonu” ifadesi icerdigini test edin
        String expectedTitleİcerik="Test Otomasyonu";
        String actualTitle = driver.getTitle();
        if (actualTitle.contains(expectedTitleİcerik)){
            System.out.println("Sayfa baslik testi PASSED");
        }else System.out.println("Sayfa baslik testi FAILED");

//        6- Furniture linkine tiklayin
        driver.findElement(By.xpath("(//li[@class='has-sub'])[5]"))
                .click();

//        7- price range filtresinde min degere 40, max degere 200 yazip filtreleyin
        WebElement minTutarKutusu= driver.findElement(By.xpath("//*[@*='form-control minPrice']"));
        WebElement maxTutarKutusu= driver.findElement(By.xpath("//*[@*='form-control maxPrice']"));

        minTutarKutusu.clear();
        minTutarKutusu.sendKeys("40");
        maxTutarKutusu.clear();
        maxTutarKutusu.sendKeys("200");

        driver.findElement(By.xpath("//button[text()='Filter Price']")).click();

//        8- filtreleme sonucunda urun bulunabildigini test edin
        WebElement aramaSonucYaziElementi= driver.findElement(By.xpath("//span[text()='2 Products Found']"));
        String unExpectedYazi="0 Products Found";
        String actualYazi=aramaSonucYaziElementi.getText();

        if (!unExpectedYazi.equals(actualYazi)){
            System.out.println("Filtreleme testi PASSED");
        }else System.out.println("Filtreleme testi FAILED");


//        9-Ilk urunu tiklayin
        driver.findElement(By.xpath("(//img[@class='lazy'])[1]"))
                .click();

//        10- Urun fiyatinin 40 ile 200 arasinda oldugunu test edin
        WebElement ilkUrunFiyatElementi= driver.findElement(By.xpath("//span[text()='$50.00']"));
        String fiyatStr=ilkUrunFiyatElementi.getText();
        fiyatStr=fiyatStr.replaceAll("\\D",""); //5000
        double fiyatDbl=Double.parseDouble(fiyatStr)/100; //50.00

        if (fiyatDbl>=40 && fiyatDbl<=200){
            System.out.println("Ilk urun fiyat testi PASSED");
        }else System.out.println("Ilk urun fiyat testi FAILED");

//        11-Sayfayi kapatin
        driver.quit();
    }


}
