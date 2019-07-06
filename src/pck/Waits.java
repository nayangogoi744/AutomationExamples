package pck;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waits {

	public static void main(String[] args) {
		String exePath = "C:\\Old-data\\programming\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);
		WebDriver driver = new ChromeDriver();
		//JavascriptExecutor js = (JavascriptExecutor) driver; // JavascriptExecutor is the interface by using which we can execute javascript command on browser
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//driver.manage().window().maximize();
		String url = "https://www.toolsqa.com/automation-practice-switch-windows/";
		driver.get(url);
		
		driver.findElement(By.xpath("//*[@id='timingAlert']")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		Alert myalert=wait.until(ExpectedConditions.alertIsPresent());
		myalert.accept();
		driver.quit();
	}

}
