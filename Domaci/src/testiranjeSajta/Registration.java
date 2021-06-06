package testiranjeSajta;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Registration {
	public static final String URL = "http://demo.guru99.com/test/newtours/register.php";
	
	public static final String FIRSTNAME_NAME = "firstName";
	public static final String LNAME_SELECTOR = "body > div:nth-child(5) > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(4) > td > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(5) > td > form > table > tbody > tr:nth-child(3) > td:nth-child(2) > input"; 
	public static final String PHONE_SELECTOR = "body > div:nth-child(5) > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(4) > td > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(5) > td > form > table > tbody > tr:nth-child(4) > td:nth-child(2) > input"; 
	public static final String EMAIL_XPATH = "//*[@id=\"userName\"]";
	public static final String ADRESS_NAME = "address1"; 
	public static final String CITY_SELECTOR = "body > div:nth-child(5) > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(4) > td > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(5) > td > form > table > tbody > tr:nth-child(8) > td:nth-child(2) > input";
	public static final String STATE_XPATH = "/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[9]/td[2]/input";
	public static final String POSTALCODE_NAME = "postalCode";
	public static final String COUNTRY_XPATH = "/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[11]/td[2]/select/option[1]"; 
	public static final String USERNAME_XPATH = "//*[@id=\"email\"]";
	public static final String PASSWORD_XPATH = "/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[14]/td[2]/input"; 
	public static final String CONFIRMPASSWORD_NAME = "confirmPassword";
	public static final String SUBMIT_XPATH = "/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[17]/td/input";

public static void ispunitiFormu(WebDriver driver) {
	driver.findElement(By.name(FIRSTNAME_NAME)).sendKeys("Boris");
	driver.findElement(By.cssSelector(LNAME_SELECTOR)).sendKeys("Nedeljkovic");
	driver.findElement(By.cssSelector(PHONE_SELECTOR)).sendKeys("691395913");
	driver.findElement(By.xpath(EMAIL_XPATH)).sendKeys("bozdra@gmail.com");
	driver.findElement(By.name(ADRESS_NAME)).sendKeys("Maksima Gorkog 45");
	driver.findElement(By.cssSelector(CITY_SELECTOR)).sendKeys("Beograd");
	driver.findElement(By.xpath(STATE_XPATH)).sendKeys("Serbia");
	driver.findElement(By.name(POSTALCODE_NAME)).sendKeys("11000");
	driver.findElement(By.xpath(COUNTRY_XPATH)).click();
	driver.findElement(By.xpath(USERNAME_XPATH)).sendKeys("Bozdra");
	driver.findElement(By.xpath(PASSWORD_XPATH)).sendKeys("Lalala123");
	driver.findElement(By.name(CONFIRMPASSWORD_NAME)).sendKeys("Lalala123");
	driver.findElement(By.xpath(SUBMIT_XPATH)).click();
	
	}
}