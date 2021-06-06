package objs;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ListOfVideos {
	


public static final String URL_VIDEO = "https://www.youtube.com/watch?v=dQw4w9WgXcQ";


public static void clickOnVideo (WebDriver driver, String name) {
	
	WebElement d = driver.findElement(By.partialLinkText(name));
	d.click();
}
}
