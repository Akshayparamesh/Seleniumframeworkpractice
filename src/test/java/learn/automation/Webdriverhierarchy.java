package learn.automation;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class Webdriverhierarchy {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub

		//ChromeDriver driver = new ChromeDriver();
		
		WebDriver driver1 = new EdgeDriver();
		
	//	WebDriver driver2 = new RemoteWebDriver(new URL(" "),new DesiredCapabilities());
		
		driver1.get("https://www.selenium.dev/documentation/webdriver/getting_started/first_script/");
//		
//		driver1.get("https://courses.learn-automation.com/");
////		
//		 driver1.get("http://www.google.com/");
		 
		driver1.navigate().to("http://www.google.com");
		 
//		 String title=driver1.getTitle();
//		 
//		 System.out.println("Title "+title);
//		 
//		 String Url= driver1.getCurrentUrl();
//		 
//		 System.out.println("url "+Url);
		 
		// driver1.quit();
		 
		// driver1.close(); 
		 
//		  String pageSource =driver1.getPageSource();
//		  
//		  driver1.manage().window().maximize();
//		  driver1.manage().window().minimize();
//		  
//		Options opt=driver1.manage();
//		
//	
//		
//	
//	     Window win=opt.window();
//	     
//	     
//	     
//	     win.maximize();
		  
		 // System.out.println(pageSource);
		  
		  
//		  
//		  driver1.navigate().back();
//		  
//		  driver1.navigate().forward();
//		  
//		  driver1.navigate().refresh();
//		 
//		  
//		  driver1.navigate();
//		  
//		  Navigation nav = driver1.navigate();
		  
		  
	
		
	}

}
