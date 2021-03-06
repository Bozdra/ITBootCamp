package tests;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import objs.Home;
import objs.Registration;

public class RegistrationTest {
	private static WebDriver driver;
	
	@BeforeClass
	public void createDriver() {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		 driver = new ChromeDriver();
	}
	
	@Test
	public void testRegBtn() {
		driver.navigate().to(Home.URL);
		
		Home.clickRegBtn(driver);
		String currentUrl = driver.getCurrentUrl();
		String expectedUrl = Registration.URL;
		Assert.assertEquals(currentUrl, expectedUrl);
	}
	@Test
	public void testRegForm() {
		File f = new File("data.xlsx");
		try {
			InputStream in = new FileInputStream(f);
			XSSFWorkbook wb = new XSSFWorkbook(in);
			Sheet sheet = wb.getSheetAt(0);
			SoftAssert sa = new SoftAssert();
			
			
			for(int i = 0; i < 3; i++) {
				Row row = sheet.getRow(i);
				Cell c0 = row.getCell(0);
				Cell c1 = row.getCell(1);
				Cell c2 = row.getCell(2);
				
				String username1 = c0.toString();
				String password1 = c1.toString();
				String cPassword1 = c2.toString();

				driver.navigate().to(Registration.URL);
				
				Registration.inputUsername(driver, username1);
				Registration.inputPassword(driver, password1);
				Registration.inputConfirmPassword(driver, cPassword1);
				Registration.submit(driver);
				
				String expectedUrl = "http://demo.guru99.com/test/newtours/register_sucess.php";
				String currentUrl = driver.getCurrentUrl();
				
				sa.assertEquals(currentUrl, expectedUrl, username1 + " " + i); // uzima informacije za assert
				
			}
			sa.assertAll();
			wb.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
	
		
	
	}
}
