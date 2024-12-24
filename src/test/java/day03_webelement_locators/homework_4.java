package day03_webelement_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class homework_4 {
    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

//        1- https://www.testotomasyonu.com/ sayfasına gidin.
        driver.get("https://www.testotomasyonu.com");

//        2- Arama kutusuna “dress” yazip aratin
        WebElement aramaKutusu = driver.findElement(By.id("global-search"));
        aramaKutusu.sendKeys("dress" + Keys.ENTER);

//        3- Görüntülenen sonuçların sayısını yazdırın
        WebElement textYazisiElementi= driver.findElement(By.xpath("//span[@class='product-count-text']"));
        String textYazisiString= textYazisiElementi.getText(); //10 Products Found
        textYazisiString=textYazisiString.replaceAll("\\D","");
        System.out.println(textYazisiString);

//        4- Listeden ilk urunun resmine tıklayın.
        driver.findElement(By.xpath("//body/div[@class=' otrixcontainer ']/section[@id='shop-listing']/div[@class='shop-wrapper']/div[@id='shopping-list']/div[@class='product-gird ']/ul[@class='product prod-grid-col4 ']/li[1]/div[1]/a[1]/img[1]"))
                .click();

//        5- Urun detayinda dress kelimesi geçtiğini test edin.
        WebElement urunDetayElement = driver.findElement(By.xpath("//div[normalize-space()='Women Black Fancy Dress']"));

        String expectedKelimeIcerik = "dress";
        String actualKelimeIcerik = urunDetayElement.getText();

        if (actualKelimeIcerik.contains(expectedKelimeIcerik)){
            System.out.println("Urun detay testi PASSED");
        }else System.out.println("Urun detay testi FAILED");
        System.out.println(actualKelimeIcerik);

    }
}
