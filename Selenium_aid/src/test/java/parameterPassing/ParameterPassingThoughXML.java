package parameterPassing;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class ParameterPassingThoughXML {
	ChromeDriver cd;
	
	@Parameters({"url"})
	  @BeforeMethod
	  public void precondition(String buildpath) {
		cd= new ChromeDriver();
		  cd.get(buildpath);
	  }

	  @AfterMethod
	  public void postcondition() {
		  cd.quit();
	  }
	  
  @Test(enabled=true,priority=1, groups="Login",dependsOnMethods="tc2")
  public void tc1() throws InterruptedException {
		Thread.sleep(3000);
		WebElement uId=cd.findElement(By.xpath("//input[@name='id']"));
		uId.sendKeys("sadar");
		WebElement pass=cd.findElement(By.name("pass"));
		pass.sendKeys("sadar");
		WebElement log=cd.findElement(By.xpath("//input[@value='Login']"));
		log.click();	
		
		String ActualResult=cd.getTitle();
		System.out.println(ActualResult);
		String ExpectedResult;
		ExpectedResult="MainHMR";
		Assert.assertEquals(ActualResult, ExpectedResult);
  }
  @Test(enabled=true,priority=1, groups="Login")
  public void tc2() throws InterruptedException {
	  
			Thread.sleep(3000);
			WebElement uId=cd.findElement(By.xpath("//input[@name='id']"));
			uId.sendKeys("sadar");
			WebElement pass=cd.findElement(By.name("pass"));
			pass.sendKeys("shubham");
			Thread.sleep(3000);

			WebElement log=cd.findElement(By.xpath("//input[@value='Login']"));
			log.click();	
			Thread.sleep(3000);

			String ActualResult=cd.switchTo().alert().getText();
			
			System.out.println(ActualResult);
			String ExpectedResult="Invalid Password";
			
			Assert.assertEquals(ActualResult, ExpectedResult);

			
			cd.switchTo().alert().accept();
			Thread.sleep(3000);

  }
  @Test(enabled=true,priority=1, groups="Login")
  public void tc3() throws InterruptedException {
	  
					Thread.sleep(2000);
					WebElement uId=cd.findElement(By.xpath("//input[@name='id']"));
					uId.sendKeys("shubham123");
					WebElement pass=cd.findElement(By.name("pass"));
					pass.sendKeys("sadar");
					WebElement log=cd.findElement(By.xpath("//input[@value='Login']"));
					log.click();
					Thread.sleep(2000);

					String ActualResult=cd.switchTo().alert().getText();
					
					System.out.println(ActualResult);
					String ExpectedResult="Invalid UserID";
				
					Assert.assertEquals(ActualResult, ExpectedResult);

					cd.switchTo().alert().accept();
					Thread.sleep(2000);

		  
  }
  @Test(enabled=true,priority=0, groups="Login")
  public void tc5() throws InterruptedException {
	
			Thread.sleep(3000);
			WebElement uId=cd.findElement(By.xpath("//input[@name='id']"));
			uId.sendKeys("");
			WebElement pass=cd.findElement(By.name("pass"));
			pass.sendKeys("");
			WebElement log=cd.findElement(By.xpath("//input[@value='Login']"));
			log.click();
			String ActualResult=cd.switchTo().alert().getText();
			
			System.out.println(ActualResult);
			String ExpectedResult="Invalid UserID";
			
			Assert.assertEquals(ActualResult, ExpectedResult);

			
			cd.switchTo().alert().accept();
			Thread.sleep(2000);

  }
  @Test(enabled=true,priority=0, groups="Login")
  public void tc6() throws InterruptedException {
	  
			Thread.sleep(3000);
			String ActualResult=cd.getTitle();
			System.out.println(ActualResult);
			WebElement uId=cd.findElement(By.xpath("//input[@name='id']"));
			uId.sendKeys("sadar");
			WebElement pass=cd.findElement(By.name("pass"));
			pass.sendKeys("shubham");
			Thread.sleep(1000);
			WebElement rst=cd.findElement(By.xpath("//input[@type='Reset']"));
			rst.click();
			
			String ExpectedResult=cd.getTitle();
			System.out.println(ExpectedResult);
			
			Assert.assertEquals(ActualResult, ExpectedResult);

			
  }



}
