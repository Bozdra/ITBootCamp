package objs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Home {
		public static final String POLITIKA_XPATH = "//*[@id=\"main-content\"]/div[1]/div[4]/div/div/div/nav/div[2]/ul/li[3]/a";
		public static final String URL = "https://www.politika.rs/";
		
		public static void clickPolBtn(WebDriver driver) {
			driver.findElement(By.xpath(POLITIKA_XPATH)).click();;

}
}