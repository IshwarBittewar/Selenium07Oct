package Selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListBox2 {
static WebDriver driver;
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver.exe");
		 driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[@class=\"_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy\"]")).click();


		
		String DayXpath="//select[@id=\"day\"]//option";
		String MonthXpath="//select[@id=\"month\"]//option";
		String YearXpath = "//select[@id=\"year\"]//option";

		String date="12/10/2007";
		
		String b[]= date.split("/");
		selectvalue(DayXpath,b[0]);
		selectvalue(MonthXpath,b[1]);
		selectvalue(YearXpath,b[2]);
		
	}
	public static void selectvalue (String path,String Vlaue) {
		
		List<WebElement> name = driver.findElements(By.xpath(path));
		System.out.println(name.size());
		
		for(int i=0; i<name.size(); i++)
		{
			System.out.println(name.get(i).getText());
			
			if(name.get(i).getText().equals(Vlaue)) {
				
				name.get(i).click();
			}
		}
		
	}

}
