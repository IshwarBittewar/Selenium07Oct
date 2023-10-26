package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframes {
static WebDriver driver;


	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver.exe");
		
		 driver=new ChromeDriver();
		 driver.manage().window().maximize();
		
		driver.get("https://demo.automationtesting.in/Frames.html");
		Thread.sleep(2000);
		driver.switchTo().frame("singleframe");
		
		driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("kjsd");
		
		driver.switchTo().defaultContent();
		driver.findElement(By.linkText("Iframe with in an Iframe")).click();
     
		Thread.sleep(3000);
		driver.switchTo().frame("Multiple");
		driver.switchTo().frame("iframe-container");
		driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("kjdc");
		
//		teardown();
	}
	public static void teardown() throws InterruptedException {
		Thread.sleep(2000);
		driver.close();
	}

}
