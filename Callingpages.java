package daypom;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Callingpages {

	public static void main(String[] args) {
        System.setProperty("webdriver.Firefox.driver", "/home/student/Desktop/Salma/Driver/geckodriver.exe");
		
		WebDriver wd=new FirefoxDriver();//interface
		
		Login_sauce lp=new Login_sauce(wd);
		
		lp.url();
		lp.username("standard_user");
		lp.password("secret_sauce");
		lp.login();
		lp.ham();
		lp.logout();
	}

}
