package day03_webelement_locators;

import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class homework_2 {
    public static void main(String[] args) {


//        Automation Exercise Category Testi
//        1- Bir test class’i olusturun ilgili ayarlari yapin
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

//        2- https://www.automationexercise.com/ adresine gidin
        driver.get("https://www.automationexercise.com/");

//        3- Category bolumundeki elementleri locate edin
        List<WebElement> denemeList = driver.findElements(By.className("panel-heading"));

//        4- Category bolumunde 3 element oldugunu test edin
        int expectedSonuc=3;
        int actualSonuc= denemeList.size();
        if (actualSonuc==expectedSonuc){
            System.out.println("Category element sayisi testi PASSED");
        }else System.out.println("Category element sayisi testi FAILED");

//        5- Category isimlerini yazdirin
        for (WebElement eachDeneme :denemeList){
            System.out.println(eachDeneme.getText());
        }

//        6- Sayfayi kapatin
        driver.quit();


    }
}
