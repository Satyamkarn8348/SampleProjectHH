package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class NoSuchException {

	public static void main(String[] args) throws InterruptedException {
		// Launch browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\INTEL\\OneDrive\\Desktop\\Seljar\\chromedriver_win32 (6)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        
       driver.get("https://www.facebook.com/");
        driver.findElement(By.linkText("Create new account")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("firstname")).sendKeys("Satyam");
        driver.findElement(By.name("lastname")).sendKeys("kumar");
        driver.findElement(By.id("facebook")).sendKeys("9934206676");
       // driver.findElement(By.id("password")).sendKeys("8343831142");
      
        
       // driver.get("https://www.rediff.com/");
        //driver.switchTo().frame("moneyiframe");
       // driver.findElement(By.name("query")).sendKeys("Yes Bank");*/
        
	}

}
