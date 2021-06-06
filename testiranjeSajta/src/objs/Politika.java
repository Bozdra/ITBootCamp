package objs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Politika {
	public static final String LATINICA_XPATH = "//*[@id=\"main-content\"]/div[1]/header/div/div/div[1]/div[2]/div[2]/a";
	public static final String URL = "https://www.politika.rs/scc/rubrika/2/Politika";
	public static final String NEWS_XPATH = "//*[@id=\"main-content\"]/div[1]/section[2]/div/div/div/div[2]/div/div[1]/div/div[1]/div/div/div[2]/h3/a";
	
	public static void clickLatBtn(WebDriver driver) {
		driver.findElement(By.xpath(LATINICA_XPATH)).click();
	}
	public static void clickOnNews(WebDriver driver) {
			driver.findElement(By.xpath(NEWS_XPATH)).click();	
}
	
}