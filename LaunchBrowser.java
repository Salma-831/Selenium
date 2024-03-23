package Daylaunch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchBrowser {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.Firefox.driver", "/home/student/Desktop/Salma/Driver/geckodriver.exe");
		
		WebDriver wd=new FirefoxDriver();
		
		wd.get("https://sourceforge.net/projects/geckodriver.mirror/");
		Thread.sleep(2000);
		wd.manage().window().minimize();
		Thread.sleep(2000);
		wd.manage().window().maximize();
		Thread.sleep(3000);
	}


}
