package Demoframework;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoKDF {

		public static void main(String[] args) throws Exception {
			System.setProperty("webdriver.Firefox.driver", "/home/student/Desktop/Salma/Driver/geckodriver.exe");
					
					WebDriver wd=new FirefoxDriver();
					
					wd.get("https://www.saucedemo.com");
					
					//File reading
					
					FileInputStream fis=new FileInputStream ("/home/student/Desktop/Salma/DataExcel.xlsx");
					XSSFWorkbook wk=new XSSFWorkbook(fis);
					XSSFSheet sh=wk.getSheet("Kdf");
					
					for (int i=1; i<=sh.getLastRowNum();i++)
					{
						XSSFRow rw=sh.getRow(i);
						
						String key=rw.getCell(1).toString();
						System.out.println("Key");
						
						switch (key) {
						case "username":
							wd.findElement(By.id("user-name")).sendKeys("standard_user");
						break;
						
						case "password":
							wd.findElement(By.name("password")).sendKeys("secret_sauce");
						break;
						
						case "login":
							wd.findElement(By.name("login-button")).click();
						break;
						
						case "clklogout":
							wd.findElement(By.cssSelector("button#react-burger-menu-btn")).click();
						break;
						
						case "logout":
							wd.findElement(By.linkText("Logout")).click();
						break;
						
						
							
						}
					}
	}

}
