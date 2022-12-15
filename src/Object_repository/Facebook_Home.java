package Object_repository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Facebook_Home {
	
	WebDriver driver;
	public  Facebook_Home(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By Search=By.xpath("//*[@id=\"mount_0_0_rx\"]/div/div[1]/div/div[2]/div[2]/div/div/div[1]/div/div/label");
	public WebElement search()
	{
		 return driver.findElement(Search);
	}
	
	

}
