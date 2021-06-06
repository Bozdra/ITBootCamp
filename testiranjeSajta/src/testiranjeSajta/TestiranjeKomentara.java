package testiranjeSajta;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import objs.Home;
import objs.Politika;
import objs.Vest;

public class TestiranjeKomentara {
	private static WebDriver driver;
	
	@BeforeClass
	public void createDriver() {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		 driver = new ChromeDriver();
	}
	@Test
	public void testKomentara() {
		driver.get("https://www.politika.rs/");
		Home.clickPolBtn(driver);
		Politika.clickLatBtn(driver);
		Politika.clickOnNews(driver);
		Vest.inputComment(driver);
		
	}
}
