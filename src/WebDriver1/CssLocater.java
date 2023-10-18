package WebDriver1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssLocater {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://login.yahoo.com/?.src=ym&.intl=in");
//		1 css selector by using the tagname anad id value syntax tagname#idvalue
//		driver.findElement(By.cssSelector("input#login-username")).sendKeys("123@gmail.com");
//		2 by usinf id value syntac #idvalue
		driver.findElement(By.cssSelector("#login-username")).sendKeys("123@gmail.com");
		
		driver.findElement(By.linkText("Create an account")).click();
		
		
		
		Thread.sleep(3000);
		
		driver.close();
		
		
	}

}
