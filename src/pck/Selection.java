package pck;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selection {

	public static void main(String[] args) {
		String exePath = "C:\\Old-data\\programming\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);
		WebDriver driver = new ChromeDriver();
		JavascriptExecutor js = (JavascriptExecutor) driver; // JavascriptExecutor is the interface by using which we can execute javascript command on browser
		
		//driver.manage().window().maximize();
		String url = "https://www.toolsqa.com/automation-practice-form/";
		driver.get(url);
		js.executeScript("window.scrollBy(0,1000)");   // It will scroll down by 1000 pixel vertically
		
		WebElement se = driver.findElement(By.id("continents"));
		Select s = new Select(se);
		s.selectByIndex(1);
		s.selectByVisibleText("Africa");
		
		
		// Display all the select options
		List<WebElement> count = s.getOptions();
		int total = count.size();
		for(int i=0;i<total;i++){
			System.out.println(count.get(i).getText());
		}
		
		driver.quit();
	}

}
