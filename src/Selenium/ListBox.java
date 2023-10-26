package Selenium;


import java.util.List;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBox {

	
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver.exe");
					
					WebDriver driver=new ChromeDriver();
					
					driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
					
					driver.manage().window().maximize();
					
					driver.get("https://www.facebook.com/");
					driver.findElement(By.xpath("//a[@class=\"_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy\"]")).click();
					

					
					
				List<WebElement> dates =	driver.findElements(By.xpath("//select[@id=\"day\"]//option"));
				System.out.println(dates.size());
				
				List<WebElement>  months = driver.findElements(By.xpath("//select[@name=\"birthday_month\"]//option"));
				
				System.out.println(months.size());
				
				List<WebElement>years = driver.findElements(By.xpath("//select[@id=\"year\"]//option"));
				
				System.out.println(years.size());
				
				
//				ListIterator it = dates.listIterator();
//				
//				while (it.hasNext()) {
//					
//					Integer I =(Integer) it.next();  
//					
//					String Noofdates =dates.get().getText();
//					System.out.println(Noofdates);
//				}
				
				for(int i=0; i<=dates.size(); i++) {
					
					String datesvalues =dates.get(i).getText();
					
					System.out.println(datesvalues);
					
					if(datesvalues.equals("20")) {
						
						dates.get(i).click();
						
						continue;
						
					}
					
				}
				
			
				
				Thread.sleep(4000);
					driver.close();
					
	}
	
}