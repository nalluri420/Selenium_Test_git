package seleniumPrograms;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadFromExcel {
	public void readExcel(String filePath,String fileName,String sheetName ) throws IOException {
	try {
		//Create an object of  File Class to open xlsx file
			File file = new File(filePath+"\\"+fileName);
		//Create an object of FileInsputStream Class to read excel file
			FileInputStream inputStream = new FileInputStream(file);
			Workbook testWorkBook = null;
		//Find the file extension by splitting the file name in substring and getting only extension name
			String fileExtentionName = fileName.substring(fileName.indexOf("."));
		//Check condition if the file is XLSX file
			if (fileExtentionName.equals(".xlsx")) {
		//If it is xlsx file the create object of XSSFWorkbook class
				testWorkBook = new XSSFWorkbook(inputStream);
			}
			
		//Read Sheet inside the workbook by its name
			
			
			else if (fileExtentionName.equals(".xls")) {
		//if it is xls file the create object of HSSFWorkbook class
				testWorkBook = new HSSFWorkbook(inputStream);
			}
	
			
			org.apache.poi.ss.usermodel.Sheet testSheet;
			testSheet =  testWorkBook.getSheet(sheetName);
			
			
			//find the no of rows in the excel file
			
			int rowCount = testSheet.getLastRowNum() - testSheet.getFirstRowNum();
			
			//Create a loop for reading excel file
			
			for(int i = 0;i< rowCount ;i++) {
					Row row = testSheet.getRow(i);
										
					//System.out.println("RowCount "+rowCount+"i value "+i);
					
			//Create a loop to print cell values in a row
					int presentrowno = row.getRowNum();
					//System.out.println("Present row "+presentrowno);
	
					int lastcellno = row.getLastCellNum();
					
			for (int j = 0; j < row.getLastCellNum(); j++ ) {
				
				
				System.out.print(row.getCell(j).getStringCellValue()+"|| ");
			}
			//System.out.println("RowCount "+rowCount+"i value "+i);

			System.out.println();
			   System.out.println("--------------");	
				
			}
			
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
	
	
	
	
	}
	
	
	
	
	
	
	
	
	// Main program started.........
	
	public static void main(String...strings ) {
	try {
		//Create an object of ReadFromExcel Class of this Program
			ReadFromExcel objExcelFile; // Initializing the object with Class
			objExcelFile = new ReadFromExcel();
		//Prepare the path of Excel file
			String filePath;
			//filePath = System.getProperty("C:\\Users\\ANAND\\Documents\\");
			filePath = "C:\\Users\\ANAND\\Documents\\";
			
			System.out.println("file path............"+filePath);
		//Call Read file method of the Class to read data
			objExcelFile.readExcel(filePath,"Test_Selenium_Excel_XLSX.xlsx","Sheet1");
			
			
			
			
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		

	}

}
