package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	public static void main(String[] args) {
		// Launch chrome  browser
		System.setProperty("WebDriver.chrome.driver", "C:\\Users\\INTEL\\OneDrive\\Desktop\\Seljar\\chromedriver_win32 (6)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
         
		//maximise chrome browser
		driver.manage().window().maximize();
		
		//open url
		driver.get("https://demoqa.com/upload-download");
		
		//find web element choose file
		driver.findElement(By.xpath("//input[@id='uploadFile']")).sendKeys("C:\\Users\\INTEL\\Downloads\\Satyam's CV (1) (2).pdf");
		
		//Actions act = new Actions(driver);
		//act.moveToElement(button).click().perform();
	}

}
