package utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Exceldata {
	
	public static String getstringdataE(String sheetname,int row,int cell) throws IOException  {
		String path="C:\\Users\\shubh\\eclipse-workspace\\Semi_finalMav\\Testdataexcel\\dataE1.xlsx";
		FileInputStream fis1=new FileInputStream(path);
		XSSFWorkbook xwb=new XSSFWorkbook(fis1);
		return xwb.getSheet(sheetname).getRow(row).getCell(cell).getStringCellValue();
		
	
	}

}
