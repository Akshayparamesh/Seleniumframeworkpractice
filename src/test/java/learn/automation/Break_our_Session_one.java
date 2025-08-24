package learn.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Break_our_Session_one {

	public static void main(String[] args) throws InterruptedException {


		WebDriver driver1= new ChromeDriver();
		
		driver1.get("https://freelance-learn-automation.vercel.app/login");
		
		//WebElement element= driver1.findElement(By.xpath("//button[text()='Sign in']"));
		
		driver1.findElement(By.xpath("//button[text()='Sign in']")).click();
		
		
		
		driver1.findElement(By.xpath("//a[text()='New user? Signup']")).click();
		
		Thread.sleep(5000);
		
		String VerifyURL = driver1.getCurrentUrl();
		
		if(VerifyURL.contains("Singup")) {
			
			System.out.println("Yes logined to Signup");
		}
		
		else {
			System.out.println("Verify the URL for Signup");
		}
		
		
		driver1.findElement(By.xpath("//button[text()='Sign up']")).isDisplayed();
		
		driver1.findElement(By.xpath("//input[contains(@id,'name')]")).sendKeys("Akshayparemesh");
		
		driver1.findElement(By.xpath("//input[@id='email']")).sendKeys("akshayp141@gmail.com");
		
		driver1.findElement(By.xpath("//input[@name='password']")).sendKeys("MysoreAunified@98");
		
		driver1.findElement(By.xpath("//input[@type='checkbox']")).click();
		
		driver1.findElement(By.xpath("//input[@value='Male']")).click();
		
		WebElement element = driver1.findElement(By.id("state"));
		
		Select dropdown1 = new Select(element);
		
	    dropdown1.selectByVisibleText("Karnataka");
		
	  //  String selectstate= dropdown1.getFirstSelectedOption().getText();
	    
	    
	    //	System.out.println("Selected state"+ dropdown1.selectByVisibleText("Karnataka"));
		
		
	    WebElement multielement =  driver1.findElement(By.xpath("//select[@id=\"hobbies\"]"));
	    
	    Select multisel = new Select(multielement);
	    
	    multisel.isMultiple();
	    
	    System.out.println("drop down multiple"+multisel.isMultiple());
	    
	    multisel.selectByVisibleText("Playing");
	    
	    multisel.selectByVisibleText("Dancing");
	    
	    driver1.findElement(By.xpath("//button[text()='Sign up']")).isEnabled();
	    
	    driver1.findElement(By.xpath("//button[text()='Sign up']")).click();
	    
	 
	    
	    
	    
		

	}

}
