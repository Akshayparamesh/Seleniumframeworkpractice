package learn.automation;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

public class WebElementyoutube {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.youtube.com/");
		
		driver.findElement(By.name("search_query")).sendKeys("Redbull miracle f1");
		
		driver.findElement(By.id("video-title")).click();
		

	}

}
