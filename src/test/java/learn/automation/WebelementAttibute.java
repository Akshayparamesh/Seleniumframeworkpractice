package learn.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebelementAttibute {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://freelance-learn-automation.vercel.app/login");
		
	    WebElement username=driver.findElement(By.id("email1"));
	    
	    driver.findElement(By.id("email1")).getAttribute("placeholder");
	    
	    String placeholerattribute=username.getAttribute("placeholder");
	    
	    String cssvalue=username.getCssValue("border-radius");
	    
	    System.out.println(cssvalue);
	    
	    
	    
	    System.out.println(placeholerattribute);
	    
	    if (placeholerattribute.equals("Enter Email"))
	    {
	    	System.out.println("Validation-1, passed");
	    }
	    else {
	    	System.out.println("Validation-1, failed");
	    }
		

	}

}
