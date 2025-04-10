package login_testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TC_6 {

	public void testcase06() throws InterruptedException {
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
		
		if(ActualResult.equals(ExpectedResult)) {
			System.out.println("test case passed");
			
		}
		else {
			System.out.println("test case failed");
		}
		
cd.quit();
}

}
