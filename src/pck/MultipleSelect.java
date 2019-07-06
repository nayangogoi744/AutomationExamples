package pck;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleSelect {

	public static void main(String[] args) throws InterruptedException {
		String exePath = "C:\\Old-data\\programming\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);
		WebDriver driver = new ChromeDriver();
		JavascriptExecutor js = (JavascriptExecutor) driver; // JavascriptExecutor is the interface by using which we can execute javascript command on browser
		
		//driver.manage().window().maximize();
		String url = "https://www.toolsqa.com/automation-practice-form/";
		driver.get(url);
		js.executeScript("window.scrollBy(0,1000)");
		
		WebElement msel = driver.findElement(By.name("selenium_commands"));
		Select se = new Select(msel);
		se.selectByIndex(0);
		se.deselectByIndex(0);
		se.selectByVisibleText("Navigation Commands");
		se.deselectByVisibleText("Navigation Commands");
		
		List<WebElement> le = se.getOptions();
		int count = le.size();
		for(int i=0;i<count;i++){
			System.out.println(le.get(i).getText());
			se.selectByIndex(i);
		}
		se.deselectAll();
		Thread.sleep(2000);
		driver.quit();
	}

}
