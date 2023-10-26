package Selenium;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.findElement(By.xpath("//a[contains(text(),\"OrangeHRM, Inc\")]")).click();
		
		Set winid =driver.getWindowHandles();
		
	Iterator <String>it =winid.iterator();
	
	String loginwinid =it.next();
	String seondwinid =it.next();
	
	System.out.println(loginwinid);
	System.out.println(seondwinid);
	
	
	for(Object tit:winid) {
		
		String title=driver.switchTo().window(loginwinid).getTitle();
		System.out.println(title);
	}
	
		
	}

}
