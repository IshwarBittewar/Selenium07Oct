package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBox1 {
static WebDriver driver;
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver.exe");
		
		 driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[@class=\"_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy\"]")).click();
		
       
		WebElement dates = driver.findElement(By.xpath("//select[@id=\"day\"]"));
		WebElement months = driver.findElement(By.xpath("//select[@id=\"month\"]"));
		WebElement year = driver.findElement(By.xpath("//select[@id=\"year\"]"));
		
		String data = "12/10/1997";
		
		String b []=data.split("/");
		
		selectdaterequried(dates, b[0]);
		selectdaterequried(months, b[1]);
		selectdaterequried(year, b[2]);
		
         Teardown();
	}
	
	public static void selectdaterequried (WebElement element ,String value) {
		
		Select s1= new Select(element);
		s1.selectByValue(value);
		
	}
	
	public static void Teardown() {
		driver.close();
	}

}
