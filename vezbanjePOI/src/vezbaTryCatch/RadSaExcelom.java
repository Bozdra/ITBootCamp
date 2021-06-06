package vezbaTryCatch;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class RadSaExcelom {

	public static void main(String[] args) {
		
		File f = new File("Dokument.xlsx");
		
		try {
			InputStream is = new FileInputStream(f);
			XSSFWorkbook wb = new XSSFWorkbook(is);
			Sheet sheet = wb.getSheetAt(0);
			Row row = sheet.getRow(8);
			Cell cell = row.getCell(5);
			System.out.println(cell.toString());
			
			Row row1 = sheet.getRow(0);
			Cell cell1 = row1.getCell(0);
			
			System.out.println(cell1.toString());
			
			int zadnjiIndex = sheet.getLastRowNum();
			System.out.println(zadnjiIndex + 1); // + 1 zbog toga sto je prvi indeks 0
			wb.close();  //zatvara fajl
			
		} catch (IOException e) {
			System.out.println("Fajl nije pronadjen!");
			e.printStackTrace();
		}
	}

}
