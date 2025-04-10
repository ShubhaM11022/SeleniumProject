package login_testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TC_1 {

public	void testcase01() throws InterruptedException {
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
		
		if(ActualResult.equals(ExpectedResult)) {
			System.out.println("test case passed");
			
		}
		else {
			System.out.println("test case failed");
		}
		
		cd.close();
	}
	

}
