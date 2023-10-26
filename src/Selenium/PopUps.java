package Selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class PopUps {
	
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver.exe");
		
		 driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		 driver.findElement(By.xpath("//button[contains(text(),\"Click for JS Alert\")]")).click();
		 driver.switchTo().alert().accept();
		 
		String text= driver.findElement(By.xpath("//p[@id=\"result\"]")).getText();
		System.out.println(text);
		
		if(text.equalsIgnoreCase("You successfully clicked an alert")) {
			System.out.println("correct out");
		}
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[contains(text(),\"Click for JS Prompt\")]")).click();
		
		Alert text1=driver.switchTo().alert();
		System.out.println(text1.getText());
		
		text1.sendKeys("kabsc");
		text1.accept();
		
		String text2=driver.findElement(By.xpath("//p[@id=\"result\"]")).getText();
		System.out.println(text2);
		if(text2.equalsIgnoreCase("kabsc")) {
			System.out.println("correct out2");
		}

}
}