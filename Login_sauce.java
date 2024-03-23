package daypom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login_sauce {
	//create constructor
	WebDriver wd; //global variable
	public Login_sauce(WebDriver wd)
	{
		this.wd=wd;
	}
	
	//Repositary of webelement
	By uname=By.id("user-name");
	By pword=By.id("password");
	By lin=By.id("login-button");
	By ham=By.xpath("/html/body/div/div[1]/div/div[3]/div");
	By lout=By.id("logout_sidebar_link");
	
	//Repository of methods
	
	public void url()
	{
		wd.get("https://www.saucedemo.com/v1/");
	}
	public void username(String un)
	{
		wd.findElement(uname).sendKeys(un);
	}
	
	public void password(String pw)
	{
		wd.findElement(pword).sendKeys(pw);
	}
	
	public void login()
	{
		wd.findElement(lin).click();
	}
	
	public void ham()
	{
		wd.findElement(ham).click();
	}
	
	public void logout()
	{
		wd.findElement(lout).click();
	}
	

}
