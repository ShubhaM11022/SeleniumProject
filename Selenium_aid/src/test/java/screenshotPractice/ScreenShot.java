package screenshotPractice;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShot {

	public static void main(String[] args) throws IOException {
WebDriver wd= new ChromeDriver();
wd.get("https://www.redbus.in/");

File file= ((TakesScreenshot)wd).getScreenshotAs(OutputType.FILE);
FileUtils.copyFile(file,new File("C:\\Users\\TUF\\Desktop\\ss.jpg"));
System.out.println(file.getAbsolutePath());


	}

}
