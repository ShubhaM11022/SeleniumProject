package expectedConditionPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExpectedConditionPractice {

	public static void main(String[] args) {
//WebDriver wd= new ChromeDriver();
WebDriver wd= new FirefoxDriver();
wd.get("https://bsadar.github.io/hmrbuild1/Loging.html");
//wd.manage().timeouts().implicitlyWait(2000, null);
WebDriverWait wait= new WebDriverWait(wd, Duration.ofMillis(2000));

if(wait.until(ExpectedConditions.titleIs("HMR"))) {
	System.out.println("page displayed");
}
else {
	System.out.println("page not displayed");
}

WebElement uId=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@name='id']")));
if(uId.isDisplayed()) {
	System.out.println("user id field displayed");
	
}
else {
	System.out.println("page is not displayed");
}
uId.sendKeys("sadar");

	}

}
