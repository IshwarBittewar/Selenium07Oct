package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboradActons {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

	     driver.get("https://www.diffchecker.com/");
	     driver.manage().window().maximize();
	     driver.findElement(By.xpath("//button[@aria-label=\"Close modal\"]")).click();
//	     driver.switchTo().alert().accept();
	    WebElement ip1= driver.findElement(By.xpath("(//div[@spellcheck=\"false\"])[1]"));
	    WebElement ip2=driver.findElement(By.xpath("(//div[@spellcheck=\"false\"])[2]"));
	     ip1.sendKeys("INDIA");
	     
	     Actions act = new Actions (driver);
	     
	     act.keyDown(Keys.CONTROL);
	     act.sendKeys("a");
	     act.keyUp(Keys.CONTROL);
	     act.build().perform();
	     
	     act.keyDown(Keys.CONTROL);
	     act.sendKeys("c");
	     act.keyUp(Keys.CONTROL);
	     act.build().perform();
	     
	     act.keyDown(Keys.TAB);
	     act.build().perform();
	     
	     act.keyDown(Keys.TAB);
	     act.build().perform();
	     
	     act.keyDown(Keys.CONTROL);
	     act.sendKeys("v");
	     act.keyUp(Keys.CONTROL);
	     act.build().perform();
	     
	     
	}

}
