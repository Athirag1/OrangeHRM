package utilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
public class OrangeExcelutils {
	 public static int getRowCount(String xlFile, String sheetName) {
	        try (FileInputStream fis = new FileInputStream(xlFile);
	             Workbook workbook = WorkbookFactory.create(fis)) {
	            Sheet sheet = workbook.getSheet(sheetName);
	            return sheet.getPhysicalNumberOfRows();
	        } catch (IOException e) {
	            e.printStackTrace();
	            return 0;
}
	 }	 
	 

 public static String getCellValue(String xlFile, String sheetName, int row, int col) {
	        try (FileInputStream fis = new FileInputStream(xlFile);
	        		
	             Workbook workbook = WorkbookFactory.create(fis)) {
	            Sheet sheet = workbook.getSheet(sheetName);
	            Row r = sheet.getRow(row);
	            if (r != null) {
	                Cell c = r.getCell(col);
	                if (c != null) {
	                    switch (c.getCellType()) {
	                        case STRING:
	                            return c.getStringCellValue();
	                        case NUMERIC:
	                            return String.valueOf(c.getNumericCellValue());
	                        case BOOLEAN:
	                            return String.valueOf(c.getBooleanCellValue());
	                        default:
	                            return "";
	                    }
	                }
	            }
	            return "";
	        } catch (IOException e) {
	            e.printStackTrace();
	            return null;
	            		
	        }
 }


 
 
   
 }
 
	            		
	            		
	            		
	            		
	            		
	            		