package learn.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumTest {
    public static void main(String[] args) {
        // Set up WebDriver Manager to download ChromeDriver automatically
       //WebDriverManager.chromedriver().setup();

        // Launch Chrome browser
        WebDriver driver = new ChromeDriver();

        // Open Google
        driver.get("https://www.google.com");

        // Print title of the webpage
        System.out.println("Page Title: " + driver.getTitle());
        
        System.out.println("Chrome Version: " + ((ChromeDriver) driver).getCapabilities().getBrowserVersion());


        
        WebDriverManager.chromedriver().clearResolutionCache();
        WebDriverManager.chromedriver().setup();

        // Close the browser
        driver.quit();
    }
}