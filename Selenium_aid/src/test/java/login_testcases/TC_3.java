package login_testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class TC_3 {

	public void testcase03() throws InterruptedException {
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
					
						if(ExpectedResult.equals(ActualResult)) {
							System.out.println("Test case pass");
							
						}
						else {
							System.out.println("test case failed");
					}
						
						cd.switchTo().alert().accept();
						Thread.sleep(2000);

						cd.quit();
	}

}
