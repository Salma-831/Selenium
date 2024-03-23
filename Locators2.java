package Daylaunch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Locators2 {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.Firefox.driver", "/home/student/Desktop/Salma/Driver/geckodriver.exe");
				
				WebDriver wd=new FirefoxDriver();
				
				wd.get("https://opensource-demo.orangehrmlive.com/");
				Thread.sleep(2000);
				wd.findElement(By.name("username")).sendKeys("Admin");
				wd.findElement(By.name("password")).sendKeys("admin123");
				wd.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
			//	wd.findElement(By.cssSelector("button[type=submit]")).click();
			//	wd.findElement(By.xpath("/html/body/div/div[1]/div[1]/header/div[1]/div[2]/ul/li/span/i")).click();
			//	wd.findElement(By.cssSelector("p#oxd-userdropdown-name")).click();
			//	wd.findElement(By.cssSelector("a#oxd-userdropdown-link")).click();
				wd.findElement(By.xpath("/html/body/div/div[1]/div[1]/header/div[1]/div[2]/ul/li")).click();

}
}
