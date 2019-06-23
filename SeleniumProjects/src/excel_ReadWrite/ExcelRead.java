package excel_ReadWrite;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



    public class ExcelRead {

	public static void main(String[] args) throws Exception {

		FileInputStream fis = new FileInputStream("\\Selenium_Req_Soft\\Registration.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheet("RegistrationDe");
		XSSFRow row = sheet.getRow(0);

		int rowCount = sheet.getLastRowNum();

		//System.out.println("Total row. count "+rowCount);

		int calCount = row.getLastCellNum();


		for(int i = 2; i<= rowCount; i++)
		{
			for(int j=0; j<=calCount; j++) 
			{

				Row row1 = sheet.getRow(i);
				if (row1 != null)
				{
					Cell cell = row1.getCell(j);
					if(cell != null) 
					{
						System.out.print(cell+" |");
					}

				}

			}
			System.out.println("\n");
		}

		fis.close();
		wb.close();
	}
}



