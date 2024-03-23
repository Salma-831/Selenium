package Daylaunch;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoAlert {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.Firefox.driver", "/home/student/Desktop/Salma/Driver/geckodriver.exe");
		
		WebDriver wd=new FirefoxDriver();
		
		wd.get("https://vinothqaacademy.com/alertandpopup/");
	//	wd.findElement(By.name("alertbox")).click();
	//	Alert alt=(Alert)wd.switchTo().alert();
	//	Thread.sleep(2000);
	//	alt.accept();
		
	//	wd.findElement(By.name("confirmalertbox")).click();
	//	Alert alt2=(Alert)wd.switchTo().alert();
	//	Thread.sleep(2000);
		//alt2.accept();
	//	alt2.dismiss();
		
		wd.findElement(By.name("promptalertbox1234")).click();
		Alert alt3=(Alert)wd.switchTo().alert();
		Thread.sleep(2000);
		alt3.sendKeys("yes");
		alt3.accept();
		//alt3.dismiss();
	}

}
