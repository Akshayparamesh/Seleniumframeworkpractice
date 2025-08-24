package learn.automation;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Autosuggestion1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		 WebDriver driver1 = new ChromeDriver();
	        
		 driver1.manage().window().maximize();
			
			driver1.get("https://seleniumpractise.blogspot.com/2016/08/how-to-handle-autocomplete-feature-in.html");
			
			
			
			driver1.findElement(By.xpath("//input[contains(@class,'autocomplete')]")).sendKeys("A");
			
			Thread.sleep(2000);
			
		List<WebElement> courses=	driver1.findElements(By.xpath("//ul[contains(@class,'autocomplete')]//div"));
		
		for(WebElement ele2:courses) {
			
			String values=ele2.getText();
			
			System.out.println(values);
			
			if(values.equalsIgnoreCase("Java")) {
				
				ele2.click();
				break;
				
			}
		}

	}

}
