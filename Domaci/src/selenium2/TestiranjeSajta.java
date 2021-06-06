package selenium2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestiranjeSajta {
	public static final String URL = "https://itbootcamp.rs/";
	public static final String XPATH_DONACIJE = "//*[@id=\"menu-item-6402\"]/a";

	@Test
	public static void testSajta() {
	System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get(URL);
	driver.manage().window().maximize();
	driver.findElement(By.xpath(XPATH_DONACIJE)).click();
	String actual = driver.getCurrentUrl();
	String expected = "https://itbootcamp.rs/donacije/";
	driver.close();
	Assert.assertEquals(actual, expected);
}
}