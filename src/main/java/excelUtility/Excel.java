package excelUtility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

	public class Excel {
		public  String excel_username(int a) throws IOException {
			  
			  FileInputStream fil = new FileInputStream(new File("C:\\Users\\BLTuser.BLT54\\Desktop\\MercuryLoginExcel.xlsx"));
			  XSSFWorkbook workbook = new XSSFWorkbook(fil);
			  XSSFSheet sheet=workbook.getSheet("logindata");
				  String un=sheet.getRow(a).getCell(0).getStringCellValue();
				  
	            
			return un;
	}
		public  String excel_password(int b) throws IOException {
			  
			  FileInputStream fil = new FileInputStream(new File("C:\\Users\\BLTuser.BLT54\\Desktop\\MercuryLoginExcel.xlsx"));
			  XSSFWorkbook workbook = new XSSFWorkbook(fil);
			  XSSFSheet sheet=workbook.getSheet("logindata");
			  String pwd=sheet.getRow(b).getCell(1).getStringCellValue();
			  
	return pwd;
	}
	}


