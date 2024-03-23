package DemoS2;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {

		public static void main(String[] args) throws Exception {
			System.setProperty("webdriver.Firefox.driver", "/home/student/Desktop/Salma/Driver/geckodriver.exe");
			
			WebDriver wd=new FirefoxDriver();
			wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			wd.get("https://demo.opencart.com/");
			TakesScreenshot ts=(TakesScreenshot)wd;
			FileHandler.copy(ts.getScreenshotAs (OutputType.FILE),new File ("./screen.png"));


	}

}
