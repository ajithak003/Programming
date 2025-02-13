package praticeFile;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.io.File;

import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcelSheetMain {

	public static void main(String[] args) throws IOException {
		writeFileUsingPOI();
	}

	public static void writeFileUsingPOI() throws IOException {
		XSSFWorkbook workBook = new XSSFWorkbook();

		XSSFSheet sheet = workBook.createSheet("Country");

		ArrayList<Object[]> data = new ArrayList<>();
		data.add(new Object[] { "Name", "capital", "population" });
		data.add(new Object[] { "India", "Delhi", "150079" });
		data.add(new Object[] { "Us", "Washingdon", "1079" });
		data.add(new Object[] { "England", "London", "10079" });

		int rowNum = 0;

		for (Object[] countries : data) {
             if(rowNum == 1) {
            	 XSSFRow rowGap = sheet.createRow(rowNum++);
            }
			XSSFRow row = sheet.createRow(rowNum++);
            
			int cellNum = 0;

			for (Object obj : countries) {
				XSSFCell cell = row.createCell(cellNum++);
				if (obj instanceof String) {
					cell.setCellValue((String) obj);
				} else if (obj instanceof Integer) {
					cell.setCellValue((Integer) obj);
				} else if (obj instanceof Double) {
					cell.setCellValue((Double) obj);
				}
 
				if(rowNum == 1) {
					CellStyle style = null;
					XSSFFont font = workBook.createFont() ;
					font.setBold(true);
					style = workBook.createCellStyle();
					style.setFont(font);
					cell.setCellStyle(style);
				}
			}
			
		}
		
		try {
			
			FileOutputStream file = new FileOutputStream(new File("Countrydetails.xlsx"));
			workBook.write(file);
			file.close();
			System.out.println("CountriesDetails.xlsx has been created successfully");
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			workBook.close();
		}

	}

}
