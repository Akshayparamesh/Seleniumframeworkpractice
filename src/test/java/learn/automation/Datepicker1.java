package learn.automation;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Datepicker1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        WebDriver driver1 = new ChromeDriver();
        
        driver1.manage().window().maximize();
		
		driver1.get("https://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		
		driver1.findElement(By.id("datepicker")).click();
		
		List<WebElement> allDates=	driver1.findElements(By.xpath("//table[contains(@class,'datepicker-calendar')]//a"));
		
		for(WebElement ele:allDates) {
			
			String Date =ele.getText();
			
			System.out.println("Date are"+Date);
			
			if(Date.equalsIgnoreCase("22")) {
				
				ele.click();
				break;
			}
		}

	}

}
