package DemoS2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoS2 {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.Firefox.driver", "/home/student/Desktop/Salma/Driver/geckodriver.exe");
		
		WebDriver wd=new FirefoxDriver();
		
		wd.get("https://demo.opencart.com/");
		wd.findElement(By.xpath("/html/body/main/div[1]/nav/div[2]/ul/li[1]/a")).click();

	}

}
