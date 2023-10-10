package WebDriver1;

import java.awt.Dimension;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetPostion {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
//		driver.get("https://www.facebook.com/login/");
		
//		org.openqa.selenium.Dimension dimension = new org.openqa.selenium.Dimension(1920, 1080);
//		
//		driver.manage().window().setSize(dimension);
//		Point p= new Point(2, 3);
		
//		driver.manage().window().setPosition(p);
		
		driver.navigate().to("https://www.facebook.com/login/");
		Thread.sleep(4000);
		driver.get("https://login.yahoo.com/?.src=ym&.intl=in");
		
		
		Thread.sleep(4000);
		driver.getClass();
		driver.close();
		
		
		
		
	}
	

}
