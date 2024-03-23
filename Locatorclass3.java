package Daylaunch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Locatorclass3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.Firefox.driver", "/home/student/Desktop/Salma/Driver/geckodriver.exe");
				
				WebDriver wd=new FirefoxDriver();
				
				wd.get("https://www.google.com/");
				wd.findElement(By.className("gLFyf")).sendKeys("Selenium");

	}
	

}
