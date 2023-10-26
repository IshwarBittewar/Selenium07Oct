package Selenium;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;


public class ScreenShot {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws IOException {
//		C:\WorkSpaceForScoreme\Selenium07Oct1\ScreenShot
		System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		String file="fb";
		String Random =RandomString.make(3);
//		File destination=new File("C:\\Screenshots\\"+file+""+Random+".jpg");

		File destination = new File("C:\\WorkSpaceForScoreme\\Selenium07Oct1\\"+file+""+Random+".png");
		
		FileHandler.copy(source, destination);
	}

}
