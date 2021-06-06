package demoSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Registration {
//testirati ovuu formu za last name, country, username, password I confirm password

	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		//1. tacka
		WebDriver driver = new ChromeDriver();
		
		//2. tacka 
		String url = "http://demo.guru99.com/test/newtours/";
		driver.get(resources.Constants.URL);
		
		WebElement register = driver.findElement(By.xpath(resources.Constants.REGISTER_XPATH));
		
		register.click();
		
		WebElement firstName = driver.findElement(By.name("firstName"));
		firstName.sendKeys("Boris");
		
		WebElement lastName = driver.findElement(By.xpath(resources.Constants.TXTLNAME_XPATH));
		lastName.sendKeys("Nedeljkovic");
		
		WebElement phone = driver.findElement(By.xpath(resources.Constants.TXTPHONE_XPATH));
		phone.sendKeys("0644554623");
		
		WebElement email = driver.findElement(By.xpath(resources.Constants.TXTEMAIL_XPATH));
		email.sendKeys("Bozdra@gmail.com");
		
		WebElement adress = driver.findElement(By.xpath(resources.Constants.TXTADRESS_XPATH));
		adress.sendKeys("Maksima Gorkog 45");
		
		WebElement city = driver.findElement(By.xpath(resources.Constants.TXTCITY_XPATH));
		city.sendKeys("Beograd");
		
		WebElement state = driver.findElement(By.xpath(resources.Constants.TXTSTATE_XPATH));
		state.sendKeys("Serbia");
		
		WebElement postalCode = driver.findElement(By.xpath(resources.Constants.TXTPOSTALCODE_XPATH));
		postalCode.sendKeys("11000");
		
		WebElement country = driver.findElement(By.xpath(resources.Constants.MENUCOUNTRY_XPATH));
		country.click();
		WebElement serbia = driver.findElement(By.xpath(resources.Constants.MENUSERBIA_XPATH));
		serbia.click();
		
		//WebElement username = driver.findElement(By.xpath(TXTUSERNAME_XPATH));
	    WebElement username = driver.findElement(By.id("email"));
		username.sendKeys("Bozdra@gmail.com");
		
		WebElement password = driver.findElement(By.xpath(resources.Constants.TXTPASSWORD_XPATH));
		password.sendKeys("lalala123123");
		
		WebElement confirmPassword = driver.findElement(By.xpath(resources.Constants.TXTCONFIRMPASSWORD_XPATH));
		confirmPassword.sendKeys("lalala123123");
		
		WebElement submit = driver.findElement(By.xpath(resources.Constants.BTTNSUBMIT_XPATH));
		
		submit.click();
		
	//	driver.navigate().back();     //navigacija kroz sajt
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//driver.close();
		
		
		
	}

}
