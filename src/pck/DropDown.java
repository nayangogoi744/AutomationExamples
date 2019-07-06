package pck;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class DropDown {

	public static void main(String[] args) {
		String exePath = "C:\\Old-data\\programming\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);
		WebDriver driver = new ChromeDriver();
		//JavascriptExecutor js = (JavascriptExecutor) driver; // JavascriptExecutor is the interface by using which we can execute javascript command on browser
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//driver.manage().window().maximize();
		String url = "http://seleniumpractise.blogspot.com/2019/01/dropdown-demo-for-selenium.html";
		driver.get(url);
		
		Select sel = new Select(driver.findElement(By.id("tools1")));
		List<WebElement> getlist = sel.getOptions();
		
		List actuallist = new ArrayList();
		for(WebElement el:getlist){
			String data = el.getText();
			actuallist.add(data);
		}
		
		List temp = new ArrayList();
		temp.addAll(actuallist);
		
		for(int i=0;i<temp.size();i++){
			System.out.println(temp.get(i));
		}
		
		Collections.sort(temp);
		//Assert.assertEquals(actuallist, temp);
		for(int i=0;i<temp.size();i++){
			System.out.println(temp.get(i));
		}
		
		//Assert.assertTrue(actuallist.equals(temp));
		
	
	}

}
