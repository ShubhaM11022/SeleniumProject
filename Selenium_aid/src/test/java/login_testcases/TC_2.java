package login_testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TC_2 {

	public void testcase02() throws InterruptedException {
		//ChromeDriver cd= new ChromeDriver();  passed
		//		FirefoxDriver cd= new FirefoxDriver();  //passed
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
				
				if(ExpectedResult.equals(ActualResult)) {
					System.out.println("Test case pass");
					
				}
				else {
					System.out.println("test case failed");
				}
				
				cd.switchTo().alert().accept();
				Thread.sleep(3000);

				cd.quit();
}

}
