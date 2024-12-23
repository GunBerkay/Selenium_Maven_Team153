package day02_WebDriverOlusturmaVeKullanma;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C06_DriverManageWindowMethodlari {

    public static void main(String[] args) throws InterruptedException {


        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        System.out.println("Baslangicta boyut : " + driver.manage().window().getSize());
        System.out.println("Baslangicta konum : " + driver.manage().window().getPosition());



        driver.get("https://www.testotomasyonu.com");

        driver.manage().window().maximize();



        Thread.sleep(10000);
        driver.quit();




    }
}
