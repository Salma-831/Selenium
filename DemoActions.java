package DemoS2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DemoActions {

	public static void main(String[] args) {
System.setProperty("webdriver.Firefox.driver", "/home/student/Desktop/Salma/Driver/geckodriver.exe");
		
		WebDriver wd=new FirefoxDriver();//interface
		wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		wd.get("https://demo.opencart.com/");
		
		Actions act=new Actions (wd);
		//act.moveToElement(wd.findElement(By.xpath("/html/body/main/div[1]/nav/div[2]/ul/li[1]/a"))).perform();
		//act.scrollByAmount(0, 500).perform();
		List<WebElement>menu=wd.findElements(By.xpath("//*[@id=\"narbar-menu\"]"));
		for(int i=0;i<menu.size();i++)
		{
			System.out.println("display" + menu.get(i));
			System.out.println(menu.get(i).getText());
			act.moveToElement(menu.get(i)).build().perform();
		}
		

	}

}