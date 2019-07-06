package pck;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		String exePath = "C:\\Old-data\\programming\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		
		String url = "https://www.toolsqa.com/automation-practice-form/";
		driver.get(url);
		List radios= driver.findElements(By.name("sex"));
		boolean b = ((WebElement) radios.get(1)).isSelected();
		if (b==false){
			((WebElement) radios.get(1)).click();
			System.out.println("Clicked Female checkbox");
		}
		WebElement nextradios = driver.findElement(By.id("exp-2"));
		nextradios.click();
		System.out.println("Click 3 years of experience");
		
		List treeradios = driver.findElements(By.name("profession"));
		int count = treeradios.size();
		for(int i=0;i<count;i++){
			String s = ((WebElement) treeradios.get(i)).getAttribute("value");
			if(s.equals("Automation Tester")){
				((WebElement) treeradios.get(i)).click();
				System.out.println("Clicked the Automation Tester");
				break;
			}
		}
		WebElement last = driver.findElement(By.cssSelector("input[value='Selenium IDE']"));
		last.click();
				
				
				
		driver.close();
	}
}
