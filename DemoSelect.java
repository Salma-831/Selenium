package Daylaunch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DemoSelect {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.Firefox.driver", "/home/student/Desktop/Salma/Driver/geckodriver.exe");
				
				WebDriver wd=new FirefoxDriver();
				
				wd.get("https://blazedemo.com/");
				Select s1=new Select(wd.findElement(By.name("fromPort")));
				//s1.selectByIndex(2);
				s1.selectByValue("Paris");
				
				Select s2=new Select(wd.findElement(By.name("toPort")));
				s2.selectByIndex(4);
				
				wd.findElement(By.xpath("/html/body/div[3]/form/div/input")).click();

	}

}
