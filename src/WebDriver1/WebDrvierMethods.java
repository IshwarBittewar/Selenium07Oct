package WebDriver1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDrvierMethods {

	public static void main(String[] args) throws InterruptedException {
		int a=99;
		int b=99;
		System.out.println(a+b);

System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver.exe");

WebDriver driver= new ChromeDriver();

driver.get("https://www.facebook.com/login/");

driver.findElement(By.xpath("//input[@id=\"email\"]")).sendKeys("ishwar@gmail.com");

Thread.sleep(4000);

driver.close();

	}

}
