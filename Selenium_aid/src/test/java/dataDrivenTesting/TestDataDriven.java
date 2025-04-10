package dataDrivenTesting;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;

public class TestDataDriven {
  @Test(dataProvider = "dp")
  public void testcase1(String ud, String pd) throws InterruptedException {
	  
	  FirefoxDriver cd= new FirefoxDriver();  //passed
		//EdgeDriver cd = new EdgeDriver();    passed
		cd.get("https://bsadar.github.io/hmrbuild1/Loging.html");
		Thread.sleep(3000);
		WebElement uId=cd.findElement(By.xpath("//input[@name='id']"));
		uId.sendKeys(ud);
		WebElement pass=cd.findElement(By.name("pass"));
		pass.sendKeys(pd);
		WebElement log=cd.findElement(By.xpath("//input[@value='Login']"));
		log.click();	
		
		String ActualResult=cd.getTitle();
		System.out.println(ActualResult);
		String ExpectedResult;
		ExpectedResult="MainHMR";
		Assert.assertEquals(ActualResult, ExpectedResult);
        cd.quit() ;
}
  
  

  @DataProvider
  public Object[][] dp() {
	//  int[] a= new int[4];
	  Object[][] inputdata= new Object[4][2];
	  
	  inputdata[0][0]="sadar";
	  inputdata[0][1]="sadar";
	  inputdata[1][0]="sadar";
	  inputdata[1][1]="sadar";
	  inputdata[2][0]="sadar";
	  inputdata[2][1]="sadar";
	  inputdata[3][0]="sadar";
	  inputdata[3][1]="sadar";

	  
	  
 return inputdata;
  }
}
