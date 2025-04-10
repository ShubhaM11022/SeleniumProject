package excelSheetPractice;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Excel_DataDriven {

	public static void main(String[] args) throws IOException, InterruptedException {
		FileInputStream fs= new FileInputStream("C:\\sheet_workbook\\datpr.xlsx"); //.
		
		 XSSFWorkbook workbook = new XSSFWorkbook(fs) ;
			XSSFSheet sh = workbook.getSheet("Sheet2");
			int noOfRow=sh.getLastRowNum()-sh.getFirstRowNum();
			System.out.println(noOfRow);
			System.out.println("userid"+" "+"password");
			for(int i=0;i<noOfRow;i++) {
				XSSFRow row =sh.getRow(1); // 2nd row
				
				XSSFCell ud=row.getCell(0);// first column
				XSSFCell pd=row.getCell(1);// second column

				System.out.println(ud+" "+pd);
				
				FirefoxDriver cd= new FirefoxDriver();  //passed
				//EdgeDriver cd = new EdgeDriver();    passed
				cd.get("https://bsadar.github.io/hmrbuild1/Loging.html");
				Thread.sleep(3000);
				WebElement uId=cd.findElement(By.xpath("//input[@name='id']"));
				uId.sendKeys(ud.toString());
				WebElement pass=cd.findElement(By.name("pass"));
				pass.sendKeys(pd.toString());
				WebElement log=cd.findElement(By.xpath("//input[@value='Login']"));
				log.click();	
				
				String ActualResult=cd.getTitle();
				System.out.println(ActualResult);
				String ExpectedResult;
				ExpectedResult="MainHMR";
				
				if(ActualResult.equals(ExpectedResult)) {
					System.out.println("test case passed");
					
				}
				else {
					System.out.println("test case failed");
				}
				
				cd.quit();
			}
			
	}

}
