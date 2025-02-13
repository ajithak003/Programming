package praticeFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelSheetMain {

	public static void main(String[] args) throws IOException {

		readFileUsingPOI();
	}
	
	public static void readFileUsingPOI() throws IOException {
		Iterator<Row> excelRows= null;
	    Iterator<Cell> excelcells= null;
		try {
	  //ClassLoader classLoader = ReadExcelSheetMain.class.getClassLoader();
	//  String excelFile = "Countrydetails.xlsx";
		FileInputStream inputStream = new FileInputStream(new File("D:/training/tourist management app/Code Pratice Project/Countrydetails.xlsx"));	    
	    Workbook workbook = new XSSFWorkbook(inputStream);
	    Sheet sheet = workbook.getSheetAt(0);
	    
	    excelRows = sheet.rowIterator();
	     while(excelRows.hasNext()) {
	    	 Row nextRow = excelRows.next();
	    	 excelcells = nextRow.cellIterator();
	    	 while(excelcells.hasNext()) {
	    		 Cell cell = excelcells.next();
	    		 switch(cell.getCellType()){
	    		 case Cell.CELL_TYPE_STRING:
	    			 System.out.print(cell.getStringCellValue());
	    			 break;
	    		 case Cell.CELL_TYPE_NUMERIC:
	    			 System.out.print(cell.getNumericCellValue());
	    			 break;
	    		 case Cell.CELL_TYPE_BOOLEAN:
	    			 System.out.print(cell.getBooleanCellValue());
	    			 break;
	    		 }
	    		 System.out.print("  ");
	    	 }
	    	 System.out.println();
	     }
	     workbook.close();
	     inputStream.close();
	     
	}catch(Exception e) {
		e.printStackTrace();
	}
	}

}
