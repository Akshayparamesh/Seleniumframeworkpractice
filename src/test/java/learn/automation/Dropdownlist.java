package learn.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;


public class Dropdownlist {

	public static void main(String[] args) throws InterruptedException {
	
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://freelance-learn-automation.vercel.app/signup");
		
		Thread.sleep(5000);
		
		WebElement dropdown = driver.findElement(By.id("state"));
		
		Select state=new Select(dropdown);
		
		state.selectByIndex(4);
		
		Thread.sleep(5000);
		
		state.selectByValue("Haryana");
		
		Thread.sleep(5000);
		
		state.selectByVisibleText("Goa");
		

	}

}
