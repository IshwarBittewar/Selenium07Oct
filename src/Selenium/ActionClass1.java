package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver.exe");

         WebDriver driver = new ChromeDriver();

	     driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	     driver.manage().window().maximize();
	     
	     WebElement dc= driver.findElement(By.xpath("//button[contains(text(),\"Double-Click Me To See Alert\")]"));
	     WebElement rc=driver.findElement(By.xpath("//span[contains(text(),\"right click me\")]"));
	     Actions  act = new Actions(driver);
	     
	     act.contextClick(rc).build().perform();
//	    act.doubleClick(dc).build().perform();
	    
//	    driver.switchTo().alert().accept();
	    
	     
}

}
