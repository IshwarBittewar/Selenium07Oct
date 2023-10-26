package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExcecutor1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		
		driver.get("https://demo.automationtesting.in/Register.html");
		WebElement name=driver.findElement(By.xpath("//input[@placeholder=\"First Name\"]"));
		Thread.sleep(3000);
		JavascriptExecutor js= (JavascriptExecutor)driver;
		
//		to reload the window or brower
//		js.executeScript("location.reload()");
		
//		to send keys in to the webelement
		
//		js.executeScript("document.getElementById('eid').value='xyz@gmail.com';");
//		js.executeScript("document.getElementById('email').value='ishwar@yahoo';");
		Thread.sleep(3000);
//		js.executeScript("arguments[0].value='selenium';",name);
//		js.executeScript("arguments[0].value='5568';", pw);
		
		
//		generate alter popup
		//js.executeScript("alert('hello world');");
//		get title of current webpage
		
//		String currenttitle=js.executeScript("return document.title;").toString();
//		System.out.println(currenttitle);
		
//		scroll by pixel
//		js.executeScript("window.scrollBy(0,150);", "");for the vertical scroll down
//		js.executeScript("window.scrollBy(0,-150);", "");for the vertical scroll up
//		for horziontal scroll
		
//		js.executeScript("window.scrollBy(150,0);", "");
		
//		scroll by element
//		WebElement ele=driver.findElement(By.xpath("//button[@id=\"submitbtn\"]"));
//		js.executeScript("arguments[0].scrollIntoView()", ele);
////		click method
//		WebElement clc=driver.findElement(By.xpath("//select[@id=\"yearbox\"]"));
//		js.executeScript("arguments[0].click();", clc);
		
//		Scroll bottom and top
		
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)", "");
	Thread.sleep(2000);
		js.executeScript("document.documentElement.ScrollTop=0", "");
		
	WebElement ele1=	driver.findElement(By.xpath("//img[@id=\"imagetrgt\"]"));
//		js.executeScript("arguments[0].style.border='10px solid orange'", ele1);
	
	js.executeScript("arguments[0].style.background='orange'", ele1);
	
	
	 	
	}

}
