package vezbaTryCatch;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class PisanjeUExcelu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		XSSFWorkbook wb = new XSSFWorkbook(); //simulira excel file
		Sheet sh = wb.createSheet(); 
		Row row = sh.createRow(7);
		Cell cell = row.createCell(9);
		cell.setCellValue("LALALA");
		
		Row row1 = sh.createRow(5);
		Cell cell1 = row1.createCell(5);        // pazi na sintaksu! row1 cell1!
		cell1.setCellValue(124);

		try {
			OutputStream os = new FileOutputStream("Izlazni.xlsx"); // pravi konkretan fajl
			wb.write(os); // upisuje sve iz workbooka u os fajl
			wb.close();
		} catch (IOException e) {
			System.out.println("Doslo je do greske.");   // jedini nacin da se obezbedimo sa greskom
			e.printStackTrace();
		}

	}

}
