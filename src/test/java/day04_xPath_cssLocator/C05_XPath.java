package day04_xPath_cssLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C05_XPath {

    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

//        1. http://zero.webappsecurity.com
//        sayfasina gidin
        driver.get(" http://zero.webappsecurity.com");

//        2. Signin buttonuna tiklayin
        driver.findElement(By.xpath("//button[@id='signin_button']")).click();

//        3. Login alanine  “username” yazdirin
        WebElement username= driver.findElement(By.xpath("//input[@id='user_login']"));
        username.sendKeys("username");

//        4. Password alanina “password” yazdirin
        WebElement password= driver.findElement(By.xpath("//input[@id='user_password']"));
        password.sendKeys("password");

//        5. Sign in buttonuna tiklayin
        driver.findElement(By.xpath("//input[@type='submit']"))
                .click();
//        6. Back tusu ile sayfaya donun
        driver.navigate().back();

//        7. Online Banking menusunden Pay Bills sayfasina gidin
        driver.findElement(By.xpath("//strong[text()='Online Banking']"))
                .click();
        driver.findElement(By.xpath("//span[@id='pay_bills_link']"))
                .click();
//        8. amount kismina yatirmak istediginiz herhangi bir miktari yazin
        WebElement amountElement= driver.findElement(By.xpath("//input[@id='sp_amount']"));
        amountElement.sendKeys("5000");

//        9. tarih kismina “2023-09-10” yazdirin
        WebElement tarihElementi= driver.findElement(By.xpath("//input[@id='sp_date']"));
        tarihElementi.sendKeys("2023-09-10");

//        10. Pay buttonuna tiklayin
        driver.findElement(By.xpath("//input[@id='pay_saved_payees']"))
                .click();
//        11. “The payment was successfully submitted.” mesajinin ciktigini test edin
        WebElement textElementi= driver.findElement(By.xpath("//span[text()='The payment was successfully submitted.']"));
        if (textElementi.isDisplayed()){
            System.out.println("Mesaj testi PASSED");
        }else System.out.println("Mesaj testi FAILED");


    }
}
