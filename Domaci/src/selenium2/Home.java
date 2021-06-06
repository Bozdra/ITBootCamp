package selenium2;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Home {
	public static final String URL = "https://itbootcamp.rs/";
	public static final String URL_DONACIJE = "https://itbootcamp.rs/donacije/";
	public static final String SEARCHBTN_XPATH = "//*[@id=\"masthead\"]/div[2]/div/div/div[2]/a";
	public static final String SEARCH_XPATH = "//*[@id=\"masthead\"]/div[2]/div/div/form/div/div/input";
	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get(URL);
		driver.getTitle();
		Dimension d = driver.manage().window().getSize();
		driver.manage().window().maximize();
		driver.navigate().to(URL_DONACIJE);
		driver.navigate().refresh();
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().back();
		
		driver.findElement(By.xpath(SEARCHBTN_XPATH)).click();
		driver.findElement(By.xpath(SEARCH_XPATH)).sendKeys("Testiranje");
		driver.findElement(By.xpath(SEARCH_XPATH)).sendKeys(Keys.ENTER);
		TakesScreenshot ts = (TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		driver.manage().window().setSize(d);
		
		FileUtils.copyFile(source, new File("C:\\Users\\bozdr\\eclipse-workspace\\Domaci\\screenshot\\screenshot.png"));
		
		driver.close();
	}
	
}
	
