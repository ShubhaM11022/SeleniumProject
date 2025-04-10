package testNg_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Testcases {
  @Test
  public void tc1() throws InterruptedException {
	//ChromeDriver cd= new ChromeDriver();  passed
			FirefoxDriver cd= new FirefoxDriver();  //passed
			//EdgeDriver cd = new EdgeDriver();    passed
			cd.get("https://bsadar.github.io/hmrbuild1/Loging.html");
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
			cd.close();
  }
  @Test
 public void tc2() throws InterruptedException{
	  EdgeDriver cd = new EdgeDriver();    //passed
		cd.get("https://bsadar.github.io/hmrbuild1/Loging.html");
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

		cd.quit();
  }
  @Test
  public void tc3() throws InterruptedException{
	  ChromeDriver cd= new ChromeDriver();//  passed
		//		FirefoxDriver cd= new FirefoxDriver();  //passed
				//EdgeDriver cd = new EdgeDriver();    //passed
				cd.get("https://bsadar.github.io/hmrbuild1/Loging.html");
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

				cd.quit();
	  
  }
  @Test
  public void tc5() throws InterruptedException{
	  FirefoxDriver cd= new FirefoxDriver();  //passed
		//EdgeDriver cd = new EdgeDriver();    //passed
		cd.get("https://bsadar.github.io/hmrbuild1/Loging.html");
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

		cd.quit();
  }
  @Test
  public void tc6() throws InterruptedException{
	  ChromeDriver cd= new ChromeDriver();//  passed
		//FirefoxDriver cd= new FirefoxDriver();  //passed
		//EdgeDriver cd = new EdgeDriver();    //passed
		cd.get("https://bsadar.github.io/hmrbuild1/Loging.html");
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

		
cd.quit();
  }
  
}
