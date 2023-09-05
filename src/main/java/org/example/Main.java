package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Main {

    @Test
    public void test01() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://managementonschools.com/");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.findElement(By.xpath("//i[@class='fa fa-lock']")).click();
        //admın AdminProject11
        //sıfre  Project11+

      WebElement firstlogintothepage= driver.findElement(By.xpath("//input[@id='username']"));
    firstlogintothepage.click();
    firstlogintothepage.sendKeys("AdminProject11");

    WebElement firstloginpassword=driver.findElement(By.xpath("//input[@id='password']"));

        firstloginpassword.click();
        firstloginpassword.sendKeys("Project11+");

        WebElement firstloginbutton=driver.findElement(By.xpath("//*[@class='d-grid gap-2 col-6 mx-auto pt-4']"));
    firstloginbutton.click();

    }
}