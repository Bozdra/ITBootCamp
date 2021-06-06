package seleniumVezbanje;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class Haljine {
	public static final String URL = "http://shop.demoqa.com/";
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get(URL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		WebDriverWait wait = new WebDriverWait(driver, 3);
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//driver.findElement(By.linkText("Search")).click();
		WebElement search = wait.until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText("Sea")));
		search.click();
		//WebElement search = driver.findElement(By.partialLinkText("Searc"));
		
		driver.navigate().to("http://shop.demoqa.com/product/black-cross-back-maxi-dress/");
		
		List<WebElement> imgs = driver.findElements(By.className("noo-woo-thumbnails__image"));
		
	
		for(WebElement img: imgs) {
			img.click();
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
/*package seleniumVezbanje;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Haljine {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://shop.demoqa.com");
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); 
		
		WebDriverWait wait = new WebDriverWait(driver, 3); 
		
		//WebElement search = driver.findElement(By.linkText("Search"));
		//search.click();
		
		//WebElement search = wait.until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText("Sea")));
				
		//WebElement search = driver.findElement(By.partialLinkText("Sea"));
		//search.click();
		
		driver.navigate().to("http://shop.demoqa.com/product/black-cross-back-maxi-dress/");
		
		List<WebElement> imgs = driver.findElements(By.className("noo-woo-thumbnails__image"));
	
		driver.manage().window().maximize(); 
		for(WebElement img: imgs) {       
			img.click();
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
} */

