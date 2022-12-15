package Object_repository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Facebook_login_page {
	
	WebDriver driver;
	public  Facebook_login_page(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By username=By.id("email");
	By password=By.id("pass");
	By Login=By.name("login");
	
	public WebElement email()
	{
		return driver.findElement(username);
	}
	public WebElement password()
	{
	 return	driver.findElement(password);
	}
	public WebElement login()
	{
		 return driver.findElement(Login);
	}
	
	
	
}
