package learn.automation;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatepickerAssign01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        WebDriver driver1 = new ChromeDriver();
        
        driver1.manage().window().maximize();
		
		driver1.get("https://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		
		driver1.findElement(By.id("datepicker")).click();
		
		driver1.findElement(By.xpath("//span[text()='Next']")).click();
		
		
		
		List<WebElement> allmonths=driver1.findElements(By.xpath("//span[contains(@class,'datepicker-month')]"));
		
		for(WebElement ele1:allmonths ) {
			
		  String Month=ele1.getText();
		  
		  System.out.println("Months "+ Month);
		  
		  
		  List<WebElement> years= driver1.findElements(By.xpath("//span[contains(@class,'datepicker-year')]"));
		  
		  for(WebElement ele2: years) {
			  
			  String Year=ele2.getText();
			  
			  System.out.println("Year "+ Year);
		  }
		  
		  if (Month.equalsIgnoreCase("June")  ) {
			  
			//  if(Year.equalsIgnoreCase(" "))
			  
			  ele1.click();
		  }
		}
		

	}

}
