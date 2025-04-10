package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HMR_Assignment {

	public static void main (String[] args) throws InterruptedException {
ChromeDriver cd= new ChromeDriver();
cd.get("https://bsadar.github.io/hmrbuild1/Loging.html");
Thread.sleep(2000);
WebElement uid=cd.findElement(By.xpath("//input[@name='id']"));
uid.sendKeys("sadar");
Thread.sleep(2000);

WebElement pass=cd.findElement(By.xpath("//input[@name='pass']"));
pass.sendKeys("sadar");
Thread.sleep(2000);

WebElement login=cd.findElement(By.xpath("//input[@value='Login']"));
login.click();
Thread.sleep(2000);

WebElement ups=cd.findElement(By.xpath("//b[normalize-space()='Update Profile&Skills']"));
ups.click();
Thread.sleep(2000);

WebElement EmpId=cd.findElement(By.xpath("//input[@id='EID']"));
EmpId.sendKeys("12345");
WebElement Fname=cd.findElement(By.xpath("//input[@id='fname']"));
Fname.sendKeys("sadar");
Thread.sleep(2000);

WebElement Lname=cd.findElement(By.xpath("//input[@id='lname']"));
Lname.sendKeys("b");
Thread.sleep(2000);

WebElement gender=cd.findElement(By.xpath("//input[@id='sex-0']"));
gender.click();
Thread.sleep(2000);

WebElement YoE=cd.findElement(By.xpath("//input[@id='exp-1']"));
YoE.click();
Thread.sleep(2000);

WebElement date=cd.findElement(By.xpath("//input[@id='datepicker']"));
date.sendKeys("6/3/2025");
Thread.sleep(2000);

WebElement prof=cd.findElement(By.xpath("//input[@id='profession-0']"));
prof.click();

WebElement file=cd.findElement(By.xpath("//input[@id='photo']"));
file.click();
Thread.sleep(2000);
WebElement at=cd.findElement(By.xpath("//input[@id='tool-0']"));
at.click();
	}

}
