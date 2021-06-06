package objs;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Home {
	public static final String SEARCHBAR_XPATH = "//*[@id=\"search\"]";
	public static final String URL_HOME = "https://www.youtube.com/";
	public static final String URL_VIDEO = "https://www.youtube.com/watch?v=dQw4w9WgXcQ";
	public static final String SEARCHBTN_XPATH = "//*[@id=\"search-icon-legacy\"]/yt-icon";
	
	
	public static void goToYT(WebDriver driver){
	driver.get(URL_HOME);
}
	
	public static void findVideo(WebDriver driver, String name) {
		driver.findElement(By.xpath(SEARCHBAR_XPATH)).sendKeys(name);;
		driver.findElement(By.xpath(SEARCHBTN_XPATH)).click();
	}
	
}