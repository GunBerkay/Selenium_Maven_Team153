package day03_webelement_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class homework_1 {

    public static void main(String[] args) throws InterruptedException {

//        1- Bir test class’i olusturun ilgili ayarlari yapin
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

//        2- https://www.testotomasyonu.com/ adresine gidin
        driver.get("https://www.testotomasyonu.com/");

//        3- arama kutusuna phone yazip aratin
        WebElement aramaKutusu= driver.findElement(By.className("search-input"));
        aramaKutusu.sendKeys("phone" + Keys.ENTER);

//        4- Category bolumunde 8 element oldugunu test edin
        Thread.sleep(1000);

        List<WebElement> categoryElementleriList=driver.findElements(By.className("panel-list"));
        int expectedKategoriSayisi = 8;
        int actualCategorisayisi = categoryElementleriList.size();

        if (expectedKategoriSayisi==actualCategorisayisi){
            System.out.println("kategori sayisi testi PASSED");
        } else System.out.println("kategori sayisi testi FAILED");

//        5- Category isimlerini yazdirin
        for (WebElement eachElement:categoryElementleriList){
            System.out.println("Category isimleri : " + eachElement.getText());
        }
//        6- Sayfayi kapatin
        driver.quit();


    }
}
