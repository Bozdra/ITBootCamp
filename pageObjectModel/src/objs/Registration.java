package objs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Registration {

	public static final String URL = "http://demo.guru99.com/test/newtours/register.php";
	public static final String TXTUSERNAME_XPATH =	"//*[@id=\"email\"]";
	
	public static void inputUsername(WebDriver driver, String username) {
		driver.findElement(By.xpath(TXTUSERNAME_XPATH)).sendKeys(username);	
	}
	public static void inputPassword (WebDriver driver, String password) {
		driver.findElement(By.name("password")).sendKeys(password);
	}
	public static void inputConfirmPassword (WebDriver driver, String password) {
		driver.findElement(By.name("confirmPassword")).sendKeys(password);

}
	public static void submit(WebDriver driver) {
		driver.findElement(By.name("submit")).click();
	}
}