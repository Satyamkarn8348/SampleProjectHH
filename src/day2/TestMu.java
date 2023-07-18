package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestMu {

	public static void main(String[] args) throws InterruptedException {
		// Launch chrome browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\INTEL\\OneDrive\\Desktop\\Seljar\\chromedriver_win32 (6)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//Maximise browser
		driver.manage().window().maximize();
		
		//Open url
		driver.get("https://www.lambdatest.com/");
		
		driver.findElement(By.linkText("Login")).click();
		Thread.sleep(2000);
		
		//find user name & send key
		driver.findElement(By.id("email")).sendKeys("9934202312");
		//find password & send key
		driver.findElement(By.id("password")).sendKeys("9874989");
		//click on login button
		driver.findElement(By.id("login-button")).click();

	}

}
