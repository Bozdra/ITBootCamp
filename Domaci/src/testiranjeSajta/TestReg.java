package testiranjeSajta;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;





public class TestReg {
	private static WebDriver driver;
	 
	@BeforeClass
	public void createDriver() {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		 driver = new ChromeDriver();
		 
	}
	@Test
	public void testRegBtn() {
		driver.navigate().to(Home.URL);
		
		Home.clickRegister(driver);
		String currentUrl = driver.getCurrentUrl();
		String expectedUrl = Registration.URL;
		Assert.assertEquals(currentUrl, expectedUrl);
	}
	@Test
	public void testRegForm() {
		driver.navigate().to(Registration.URL);
		Registration.ispunitiFormu(driver);
		
		String expectedUrl = "http://demo.guru99.com/test/newtours/register_sucess.php";
		String currentUrl = driver.getCurrentUrl();
		
		Assert.assertEquals(currentUrl, expectedUrl);
}
}
