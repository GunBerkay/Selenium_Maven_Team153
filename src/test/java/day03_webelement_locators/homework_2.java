package day03_webelement_locators;

import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

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
        WebElement womenElement =driver.findElement(By.xpath("//a[normalize-space()='Women']"));
        WebElement menElement = driver.findElement(By.xpath("//a[normalize-space()='Men']"));
        WebElement kidsElement = driver.findElement(By.xpath("//a[normalize-space()='Kids']"));

//        4- Category bolumunde 3 element oldugunu test edin
        if (womenElement.isDisplayed() &&
                menElement.isDisplayed() &&
                kidsElement.isDisplayed())
        {
            System.out.println("Category bolumu 3 element testi PASSED");
        }else System.out.println("Category bolumu 3 element testi FAILED");

//        5- Category isimlerini yazdirin
        System.out.println("Category 1: " + womenElement.getText());
        System.out.println("Category 2: " + menElement.getText());
        System.out.println("Category 3: " + kidsElement.getText());

//        6- Sayfayi kapatin
        driver.quit();


    }
}
