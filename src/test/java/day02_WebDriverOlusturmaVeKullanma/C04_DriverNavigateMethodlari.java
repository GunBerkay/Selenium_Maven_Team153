package day02_WebDriverOlusturmaVeKullanma;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C04_DriverNavigateMethodlari {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver=new ChromeDriver();

//        1.Youtube ana sayfasina gidin . https://www.youtube.com/
        driver.navigate().to("https://www.youtube.com/");
//        2.url’in “youtube” icerdigini test edin.
        String expectedUrl="youtube";
        String actualUrl=driver.getCurrentUrl();
        if (actualUrl.contains(expectedUrl)){
            System.out.println("Test Passed");
        }else {
            System.out.println("Test Failed");
        }

//        3. Testotomasyonu sayfasina gidin. https://www.testotomasyonu.com/
        driver.get(" https://www.testotomasyonu.com/");

//        4. Title’in “Test Otomasyonu” icerdigini test edin.
        String expectedTitle="Test Otomasyonu";
        String actualTitle=driver.getTitle();
        if (actualUrl.contains(expectedUrl)){
            System.out.println("Test Passed");
        }else {
            System.out.println("Test Failed");
        }

//        5. Tekrar YouTube’sayfasina donun.
        driver.navigate().back();

//        6. Title’in “YouTube” oldugunu test edin
        String expectedTitleİcerik="Youtube";
        String actualTitleİcerik= driver.getTitle();
        if (actualTitleİcerik.equals(expectedTitleİcerik)){
            System.out.println("Test Passed");
        }else System.out.println("Test Failed");


//        7. Sayfayi Refresh(yenile) yapin.
        driver.navigate().refresh();

//        7. Sayfayi kapatalim / Tum sayfalari kapattin.

        driver.quit();

    }
}
