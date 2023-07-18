package day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		//launch browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\INTEL\\OneDrive\\Desktop\\Seljar\\chromedriver_win32 (6)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//open url
		driver.get("https://www.facebook.com/");
		
		List<WebElement>gender = driver.findElement(By.name("sex"));
		
		int cnt = gender.size();
		System.out.println(cnt);
			
	}

}
