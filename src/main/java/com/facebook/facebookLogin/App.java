package com.facebook.facebookLogin;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args ) throws InterruptedException
    {
                
       System.setProperty("webdriver.chrome.driver", "C:\\Users\\suren\\Downloads\\Devopps\\chromedriver.exe");
     // WebDriverManager.chromedriver().setup();
        ChromeOptions chromeoptions = new ChromeOptions();
        
        WebDriver driver = new ChromeDriver(chromeoptions);
        
        driver.get("https://www.facebook.com/");
        
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.id("email")).sendKeys("mytempvajrala@gmail.com");
        
        Thread.sleep(3000);
        
        driver.findElement(By.id("pass")).sendKeys("abc123#");
      
        Thread.sleep(3000);
                  
        driver.findElement(By.className("_li")).click();
        
        Thread.sleep(3000);
        
        System.out.println("Login Clicked");
        
        driver.quit();
    }
}
