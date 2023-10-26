package Selenium;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Paramterzitoin {
static  WebDriver driver;
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
//driver = new ChromeDriver();
String path ="C:\\Users\\SCOREME-LT-EISHWAR\\Desktop\\parameterzatoin.xlsx";
		FileInputStream file = new FileInputStream(path);
		
//		String value=WorkbookFactory.create(file).getSheet("sheet1").getRow(1).getCell(0).toString();
//
//		System.out.println(value);
		
	Sheet	data =WorkbookFactory.create(file).getSheet("sheet1");
	
	int noofrows =data.getLastRowNum();
		System.out.println(noofrows);
	int noofcolumn =data.getRow(0).getLastCellNum();
	System.out.println(noofcolumn);
	
	for(int i=0; i<=data.getLastRowNum(); i++) {
		
	for(int j=0; j<data.getRow(i).getLastCellNum(); j++) {
		
	String alldata=data.getRow(i).getCell(j).toString();
	
	System.out.print(alldata +" |");
		
	}
	System.out.println();
	}
		
	}

}
