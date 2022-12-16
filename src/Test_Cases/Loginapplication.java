package Test_Cases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import Object_repository.Facebook_Home;
import Object_repository.Facebook_login_page;
import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class Loginapplication {

	@Test
	public void Login() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "E:\\eclipse\\chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
			WebDriver driver=new ChromeDriver(options);
			driver.get("https://www.facebook.com/login");
			Facebook_login_page rd=new Facebook_login_page(driver);
			rd.email().sendKeys("rahuldahikar18@gmail.com");
			rd.password().sendKeys("Rahul@$1812");
			rd.login().click();
			
			System.out.println(driver.getTitle());
			System.out.println("web auotomation");
			System.out.println("API AUtomation");
		//Thread.sleep(50000);
			//Facebook_Home dh=new Facebook_Home(driver);
			//dh.search().sendKeys("Rahul");
			
		
	
	//		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
			
			
			
			
			
			
			
		
	}
	

	

}
