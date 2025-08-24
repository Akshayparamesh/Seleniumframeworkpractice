package learn.automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Datepicker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver1 = new ChromeDriver();
		
		driver1.get("https://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");

		driver1.findElement(By.id("datepicker")).sendKeys("05/08/2025");
		
		 //table[contains(@class,'datepicker-calendar')]//td//a
		 //table[contains(@class,'datepicker-calendar')]//a
		
	List<WebElement> allDates=	driver1.findElements(By.xpath("//table[contains(@class,'datepicker-calendar')]//a"));
	
	for(WebElement ele:allDates) {
		
		System.out.println(ele.getText());
	}
		
	}

}
