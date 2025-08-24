package learn.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Breakoutonepart2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver2 = new ChromeDriver();
		
		driver2.get("https://freelance-learn-automation.vercel.app/login");
		
		driver2.findElement(By.xpath("//input[@type='email']")).sendKeys("akshayp141@gmail.com");
		
		driver2.findElement(By.xpath("//input[@type='password']")).sendKeys("MysoreAunified@98");
		
		driver2.findElement(By.xpath("//button[text()='Sign in']")).click();

	}

}
