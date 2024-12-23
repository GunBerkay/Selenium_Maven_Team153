package day02_WebDriverOlusturmaVeKullanma;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_DriverGetMethodlari {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver=new ChromeDriver();


        driver.get("https://www.testotomasyonu.com");

        System.out.println(driver.getTitle());

        System.out.println(driver.getCurrentUrl());

        System.out.println("============Sayfa kaynak Kodlari=============");
       // System.out.println(driver.getPageSource());

        System.out.println(driver.getWindowHandle());

        //System.out.println(driver.getWindowHandles());


        Thread.sleep(3000);
        driver.quit();

    }

}