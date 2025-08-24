package learn.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;


public class Webelements {

	public static void main(String[] args) {
	
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://freelance-learn-automation.vercel.app/login");
		
  WebElement username=	driver.findElement(By.id("email1"));
  
  username.sendKeys("admin@gmail.com");
  
  username.clear();
  
  username.sendKeys("mukesh@email.com");
  
 boolean displaystatus=  username.isDisplayed();
 
 System.out.println("DisplayStatus:"+displaystatus);
 
 if(displaystatus) {
	 System.out.println("validation-passed-display");
 }
 
 else {
	 System.out.println("validation-failed-display");
 }
  
 boolean enablestatus=  username.isEnabled();
  
  System.out.println("Enabledstatus "+enablestatus);
  
  boolean selectstatus =username.isSelected();
  
  System.out.println("Selectstatus "+selectstatus);
  if(!selectstatus) {
		 System.out.println("validation-passed-select");
	 }
	 
	 else {
		 System.out.println("validation-failed-select");
	 }
  
  
  
  username.isSelected();
  
  
  
		

	}

}
