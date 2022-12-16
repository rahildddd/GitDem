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
	
	By Search=By.xpath("//input[@class='x1i10hfl xggy1nq x1s07b3s x1kdt53j x1yc453h xhb22t3 xb5gni xcj1dhv x2s2ed0 xq33zhf xjyslct xjbqb8w x6umtig x1b1mbwd xaqea5y xav7gou xnwf7zb x40j3uw x1s7lred x15gyhx8 x9f619 xzsf02u xdl72j9 x1iyjqo2 xs83m0k xjb2p0i x6prxxf xeuugli x1a2a7pz x1n2onr6 x15h3p50 xm7lytj x1sxyh0 xdvlbce xurb0ha x1vqgdyp xo6swyp x1ad04t7 x1glnyev x1ix68h3 x19gujb8']");
	public WebElement search()
	{
		 return driver.findElement(Search);
	}
	
	

}
