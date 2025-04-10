package excelSheetPractice;

import java.io.FileInputStream;
import java.io.IOException;


import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ExcelSheetRead {
	public static void main(String[] args) throws IOException    {
		FileInputStream fs= new FileInputStream("C:\\sheet_workbook\\datpr.xlsx");
		
		 XSSFWorkbook workbook = new XSSFWorkbook(fs) ;
			XSSFSheet sh = workbook.getSheet("Sheet2");
			int noOfRow=sh.getLastRowNum()-sh.getFirstRowNum();
			System.out.println(noOfRow);
			XSSFRow row =sh.getRow(1); // 2nd row
			
			XSSFCell col=row.getCell(0);// first column
			XSSFCell col1=row.getCell(1);// second column

			System.out.println(col);
			System.out.println(col1);
			
		
		
	} 
	}
		
//	}
	
//	 public static void main(String[] args) {
//	        try {
//	            // File path of the Excel file
//	            FileInputStream fis = new FileInputStream(new File("C:/sheet_workbook/datpr.xlsx"));
//	            
//	            // Create a Workbook instance for .xlsx files
//	            Workbook workbook = new XSSFWorkbook(fis);
//	            
//	            // Get the sheet by name or index (0 = first sheet)
//	            Sheet sheet = workbook.getSheetAt(1);
//	            
//	            // Iterate through each row
//	            for (Row row : sheet) {
//	                // Iterate through each cell in the row
//	                for (org.apache.poi.ss.usermodel.Cell cell : row) {
//	                    // Print the cell value based on its type
//	                    switch (cell.getCellType()) {
//	                        case STRING:
//	                            System.out.print(cell.getStringCellValue() + "\t");
//	                            break;
//	                        case NUMERIC:
//	                            System.out.print(cell.getNumericCellValue() + "\t");
//	                            break;
//	                        case BOOLEAN:
//	                            System.out.print(cell.getBooleanCellValue() + "\t");
//	                            break;
//	                        default:
//	                            System.out.print("Unknown Type" + "\t");
//	                    }
//	                }
//	                System.out.println();
//	            }
//	            
//	            // Close the workbook and FileInputStream
//	            workbook.close();
//	            fis.close();
//	        } catch (IOException e) {
//	            e.printStackTrace();
//	        }
//	    }

	
	
	
	

