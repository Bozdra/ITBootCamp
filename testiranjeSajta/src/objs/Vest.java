package objs;
import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class Vest {

	public static final String KOMENTAR_XPATH = "//*[@id=\"main-comment-text\"]";
	
	public static void inputComment(WebDriver driver) {
		driver.findElement(By.xpath(KOMENTAR_XPATH)).sendKeys("LALALA");
	}
	
}
