package DemoS2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Amazon1 {

	public static void main(String[] args) {
System.setProperty("webdriver.Firefox.driver", "/home/student/Desktop/Salma/Driver/geckodriver.exe");
		
		WebDriver wd=new FirefoxDriver();
		
		wd.get("https://total-qa.com/");
		
	}

}
