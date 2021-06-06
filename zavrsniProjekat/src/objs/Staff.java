package objs;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import constants.Constants;

public class Staff {
	
	public static void clickAddEmployee(WebDriver driver) {
		driver.findElement(By.xpath(Constants.ADDEMPLOYEEBTNBTN_XPATH)).click();
	}
	public static void inputFirstName(WebDriver driver, String name) {
		driver.findElement(By.xpath(Constants.FIRSTNAMEBAR_XPATH)).sendKeys(name);
	}
	public static void inputLastName(WebDriver driver, String lName) {
		driver.findElement(By.xpath(Constants.LASTNAMEBAR_XPATH)).sendKeys(lName);
	}
	public static void inputEmail(WebDriver driver, String email) {
		driver.findElement(By.xpath(Constants.EMAILBARSTAFF_XPATH)).sendKeys(email);
	}
	public static void saveEmployee(WebDriver driver) {
		driver.findElement(By.id(Constants.SAVEEMPLOYEESBTN_XPATH)).click();
	}
	public static void selectAllStaff(WebDriver drier) {
		driver.findElement(By.id(Constants.SLCTALLSTAFF_XPATH)).click();
	}
	public static void selectEmployeeName(WebDriver driver) {
		driver.findElement(By.xpath(Constants.SLCTEMP_XPATH)).click();
	}
	
	
	
}
