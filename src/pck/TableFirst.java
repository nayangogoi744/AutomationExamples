package pck;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableFirst {
	public static void main(String args[]) throws InterruptedException{
		String exePath = "C:\\Old-data\\programming\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);
		WebDriver driver = new ChromeDriver();
		//JavascriptExecutor js = (JavascriptExecutor) driver; // JavascriptExecutor is the interface by using which we can execute javascript command on browser
		
		//driver.manage().window().maximize();
		String url = "https://www.toolsqa.com/automation-practice-table";
		driver.get(url);
		//js.executeScript("window.scrollBy(0,1000)");
		String du = driver.findElement(By.xpath("//*[@id='content']/table/tbody/tr[1]/td[2]")).getText();
		System.out.println(du);
		
		driver.findElement(By.xpath("//*[@id='content']/table/tbody/tr[1]/td[6]/a")).click();
		Thread.sleep(2000);
		
		driver.quit();
	}

}
