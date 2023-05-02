package Resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelData {
	
private XSSFSheet sheet;

	public ExcelData(String filepath,String sheetname) throws IOException {
		FileInputStream xl=new FileInputStream(filepath);
		XSSFWorkbook workbook1=new XSSFWorkbook(xl);
		
	    sheet=workbook1.getSheet(sheetname);
		 
	}
	public String getData(int rownum, int colnum) {
		XSSFRow row=sheet.getRow(rownum);
		XSSFCell cell=row.getCell(colnum);
		cell.setCellType(CellType.STRING);
		return cell.getStringCellValue();
	}
	public int rowcount() {
		
		return sheet.getLastRowNum();
	}
	
}
