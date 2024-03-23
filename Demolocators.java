package Daylaunch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demolocators {

	public static void main(String[] args) throws Exception {
System.setProperty("webdriver.Firefox.driver", "/home/student/Desktop/Salma/Driver/geckodriver.exe");
		
		WebDriver wd=new FirefoxDriver();
		
		wd.get("https://www.saucedemo.com");
		//wd.findElement(By.id("user-name")).sendKeys("standard_user");
		wd.findElement(By.cssSelector("input#user-name")).sendKeys("standard_user");
		//wd.findElement(By.name("password")).sendKeys("secret_sauce");
		wd.findElement(By.cssSelector("input#password")).sendKeys("secret_sauce");
		//wd.findElement(By.name("login-button")).click();
		wd.findElement(By.cssSelector("input#login-button")).click();
		Thread.sleep(1000);
		//wd.findElement(By.linkText("Sauce Labs Backpack")).click();
		
		wd.findElement(By.cssSelector("button#react-burger-menu-btn")).click();
		//	wd.findElement(By.xpath("//*[@id=\"logout_sidebar_link\"]")).click();
		wd.findElement(By.cssSelector("a#logout_sidebar_link")).click();
		
	//d.findElement(By.className("bm-item menu-item")).click();
		
	}

}
