package test;

import static org.testng.Assert.assertEquals;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import objs.Home;
import objs.ListOfVideos;
//za dodatni zadatak - spisak youtube pesama koje treba pretraziti/pustiti - spisak u excelu
//dodatni zadatak 2 (nakon uradjena prethodna 2) - pustiti 3.pesmu iz recommended liste 
//(s desne strane) nakon pustanja poslednje odabrane pesme

public class TestVideo {
	public static final String RICK_NAME = "Rick Astley - Never Gonna Give You Up (Video)";
	public static final String STARDUST_NAME = "Stardust - Music Sounds Better With You (Official Music Video)";
	public static final String MODJO_NAME = "Modjo - Lady (Hear Me Tonight) (Official Video)";
	public static final String THIRDSONG_XPATH = "//*[@id=\"video-title\"]";
	ChromeDriver driver;
	@Test
	public void testYt() {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		File f = new File("spisak.xlsx");
		
		XSSFWorkbook wb;
		try {
			InputStream is = new FileInputStream(f);
			wb = new XSSFWorkbook(is);
			SoftAssert sa = new SoftAssert();
			Sheet sheet = wb.getSheetAt(0);
			
			for (int i = 0; i <= 2; i++) {
				
			Row row = sheet.getRow(i);
			Cell cell = row.getCell(0);
			Cell cell1 = row.getCell(1);
			String titl = cell1.getStringCellValue();
			String pesma = cell.getStringCellValue();
			
			Home.goToYT(driver);
			Home.findVideo(driver, pesma);
			driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
			ListOfVideos.clickOnVideo(driver, pesma);
			
			sa.assertEquals(driver.getTitle(), titl);
		}
			sa.assertAll();
			wb.close();
			driver.quit();
		}
			catch (IOException e) {
			e.printStackTrace();
		}
		}
	
	}

	

	
	
		
		
		
	

	


