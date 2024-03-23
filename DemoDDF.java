package Demoframework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoDDF {

	public static void main(String[] args) throws Exception {
System.setProperty("webdriver.Firefox.driver", "/home/student/Desktop/Salma/Driver/geckodriver.exe");
		
		WebDriver wd=new FirefoxDriver();
		
		wd.get("https://www.saucedemo.com");
		
		//File reading
		
		FileInputStream fis=new FileInputStream ("/home/student/Desktop/Salma/DataExcel.xlsx");
		XSSFWorkbook wk=new XSSFWorkbook(fis);
		XSSFSheet sh=wk.getSheet("ddf");
		
		for(int i=0;i<sh.getLastRowNum();i++)
		{
			XSSFRow rw=sh.getRow(i);
			XSSFCell un=rw.getCell(0);
			XSSFCell pw=rw.getCell(1);
			
			wd.findElement(By.id("user-name")).sendKeys(un.toString());
			wd.findElement(By.name("password")).sendKeys(pw.toString());
			wd.findElement(By.name("login-button")).click();
			wd.findElement(By.cssSelector("button#react-burger-menu-btn")).click();
			wd.findElement(By.cssSelector("a#logout_sidebar_link")).click();
			
		}
		
		

	}

}
