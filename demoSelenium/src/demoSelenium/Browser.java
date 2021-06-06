package demoSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		//1. tacka
		WebDriver driver = new ChromeDriver();
		
		//2. tacka 
		String url = "http://demo.guru99.com/test/newtours/";
		driver.get(url);
		
		 // 3. tacka
		 String title = driver.getTitle();
		 int titleLength = title.length();
		
		 //4. tacka
		 System.out.println("Title is: " + title);
		 System.out.println("Title length is: " + titleLength);
		 
		// 5. tacka 
		// String actualUrl = driver.getCurrentUrl(); 
		// if(actualUrl.equals(url)) {
		 
		 //6. tacka
		 String pageSource = driver.getPageSource();
		 int pageSourceLength = pageSource.length();
		 
		 //7. tacka 
		 System.out.println("Page Source length is :" + pageSourceLength);
		 
		 //8. tacka
		 driver.close();
	}

}
