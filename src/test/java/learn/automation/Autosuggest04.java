package learn.automation;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
public class Autosuggest04 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		driver.findElement(By.name("q")).sendKeys("Mukesh Otwani");
		
		Thread.sleep(2000);
		
		List<WebElement> allsuggestions= driver.findElements(By.xpath("//div[@role='option']//div[@role='presentation']//span"));
		
		for(WebElement ele:allsuggestions) {
			
			String value=ele.getText();
			
			if(value.length()>0)
			{
				System.out.println("Values are "+value);
				
				if(value.contains("course"))
				{
					ele.click();
					break;
				}
			
		}

	}
	}
}


