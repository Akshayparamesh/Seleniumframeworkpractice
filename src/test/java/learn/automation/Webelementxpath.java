package learn.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
public class Webelementxpath {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://freelance-learn-automation.vercel.app/login");
		
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("admin@email.com");
		
		driver.findElement(By.xpath("//input[@placeholder='Enter Password']")).sendKeys("admin@123");
		
		driver.findElement(By.xpath("//button[text()='Sign in']")).click();

	}

}
