package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	
	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		
		
		driver.manage().window().maximize();
		
		driver.get("https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html");
		
		WebElement ele = driver.findElement(By.xpath("//table[@id=\"customers\"]"));
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView()", ele);
		
		Thread.sleep(2000);
		int noofcol=driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr/th")).size();
		int noofrow= driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr")).size();
		
	System.out.println(noofcol);
	System.out.println(noofrow);
	Thread.sleep(2000);
//	String value1=driver.findElement(By.xpath("//table[@id=\"customers\"]//tbody/tr[2]/th[2]")).getText();
	String value1=driver.findElement(By.xpath("//table[@id=\"customers\"]//tbody/tr[3]/td[1]")).getText();

	System.out.println(value1);
	
	for(int i=2; i<=noofrow; i++) {
		
	for(int j=1; j<=noofcol; j++) {
		String alldata=driver.findElement(By.xpath("//table[@id=\"customers\"]/tbody/tr["+i+"]/td["+j+"]")).getText();
//    String data=	   driver.findElement(By.xpath("//table[@id=\"customers\"]/tbody/tr["+i+"]/td["+j+"]")).getText();

	System.out.print(alldata+"| ");	
	}
	System.out.println();
	}

	}

}
