package day02_WebDriverOlusturmaVeKullanma;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_İlkOtomasyon {

    public static void main(String[] args) throws InterruptedException {


        WebDriver driver=new ChromeDriver();

        driver.get("https://www.testotomasyonu.com");

        Thread.sleep(3000);

      //  driver.close();
        driver.quit();


    }


}
