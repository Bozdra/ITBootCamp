package testiranjeSajta;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Home {
	public static final String URL = "http://demo.guru99.com/test/newtours/";

	public static final String REGISTER_XPATH = "/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[2]/a";
	


	public static void clickRegister(WebDriver driver) {
		driver.findElement(By.xpath(REGISTER_XPATH)).click();
	}	
}