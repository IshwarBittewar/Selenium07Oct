package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClassMouseAction {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver.exe");

	    WebDriver driver = new ChromeDriver();

	    driver.get("http://mrbool.com/");
	    driver.manage().window().maximize();
	   WebElement con= driver.findElement(By.xpath("//a[@href=\"http://mrbool.com/articles/listcomp.asp\"]"));
	   
	   Actions act= new Actions(driver);
	   
	   act.moveToElement(con).build().perform();
	   
	   driver.findElement(By.xpath("//a[contains(text(),\"Single Videos\")]")).click();
	   
	}
	
	
}
