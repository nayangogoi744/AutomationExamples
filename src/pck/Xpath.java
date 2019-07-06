package pck;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String exePath = "C:\\Old-data\\programming\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		
		String url = "https://www.amazon.in";
		driver.get(url);
		
		driver.findElement(By.xpath("//form/div[3]/div[1]/input[@id='twotabsearchtextbox']")).sendKeys("Hello");
		driver.findElement(By.xpath("//input[contains(@id,'twotabsearchtextbox')]")).sendKeys("Nayan");
		
		//*[@id="tsf"]/div[2]/div/div[3]/center/input[2]
	}

}
