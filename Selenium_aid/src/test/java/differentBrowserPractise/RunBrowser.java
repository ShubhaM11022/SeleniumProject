package differentBrowserPractise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RunBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver bo = new ChromeDriver();
//WebDriver bo= new FirefoxDriver();

bo.get("");
bo.quit();
	}

}
