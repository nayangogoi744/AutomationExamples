// Example of handling dynamic table
package pck;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableSecond {

	public static void main(String[] args) {
		String exePath = "C:\\Old-data\\programming\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);
		WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		String url = "http://toolsqa.com/automation-practice-table/";
		int sRow = 1;
		int sCol = 2;
		String col = "Clock Tower Hotel";
		driver.get(url);
		
		String du = driver.findElement(By.xpath("//*[@id='content']/table/tbody/tr["+sRow+"]/td["+sCol+"]")).getText();
		System.out.println(du);
		
		for(int i=1;i<5;i++){
			String s = driver.findElement(By.xpath("//*[@id='content']/table/tbody/tr["+i+"]/th")).getText();
			if(s.equals(col)){
				for(int j=1;j<=5;j++){
					String s1 = driver.findElement(By.xpath("//*[@id='content']/table/tbody/tr["+i+"]/td["+j+"]")).getText();
					System.out.println(s1);
					
				}
				}
		}
		
		
		driver.quit();
	}

}
