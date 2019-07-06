package pck;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindows {

	public static void main(String[] args) throws InterruptedException {
		String exePath = "C:\\Old-data\\programming\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);
		WebDriver driver = new ChromeDriver();
		//JavascriptExecutor js = (JavascriptExecutor) driver; // JavascriptExecutor is the interface by using which we can execute javascript command on browser
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//driver.manage().window().maximize();
		driver.get("https://chandanachaitanya.github.io/selenium-practice-site/");
		String parentwindowhandle = driver.getWindowHandle();
		System.out.println("Parent window" +parentwindowhandle);
		 WebElement clickElement = driver.findElement(By.id("win2")); 
		 clickElement.click();
		 
		 String allWindowHandles = driver.getWindowHandle();
		 String lastWindowHandle = "";
		 
		 System.out.println("Switching to window - > " + allWindowHandles);
		 driver.switchTo().window(allWindowHandles); //Switch to the desired window first and then execute commands using driver
		 driver.get("http://facebook.com");
		 Thread.sleep(5000);
		 lastWindowHandle = allWindowHandles;
		 
		 
		 
		 
		// driver.findElement(By.name("q")).sendKeys("google");
		// driver.findElement(By.cssSelector("input[value='Google Search']")).click();
		 
		 
		 driver.quit();
		 }
	}


