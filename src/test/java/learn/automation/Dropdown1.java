package learn.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


public class Dropdown1 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://freelance-learn-automation.vercel.app/signup");
		
		Thread.sleep(5000);
		
        WebElement dropdown = driver.findElement(By.id("state"));
		
		Select state=new Select(dropdown);
		
		state.selectByVisibleText("Goa");
		
       String statename	=state.getFirstSelectedOption().getText();
       
       if (statename.contains("Goa")) {
    	   
    	   System.out.println("dropdown working as expected");
       }
       
       else {
    	   System.out.println("dropdown not working as expected");
       }
       
       Select hobbies = new Select(driver.findElement(By.name("hobbies")));
       
       
       System.out.println("is dropdown multiselect"+hobbies.isMultiple());
       
       hobbies.selectByVisibleText("Playing");
       hobbies.selectByVisibleText("Swimming");
       
       
       
       
	}

}
