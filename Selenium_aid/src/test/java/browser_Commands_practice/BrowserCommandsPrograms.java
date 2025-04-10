package browser_Commands_practice;

import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserCommandsPrograms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ChromeDriver cd= new ChromeDriver();
cd.get("https://www.redbus.in/");
String s=cd.getTitle();
System.out.println(s);
String cu=cd.getCurrentUrl();
System.out.println(cu);
Navigation nv=cd.navigate();
nv.to("https://www.facebook.com/");
nv.back();
nv.forward();
nv.refresh();
cd.quit();
		// this is git update
	}

}
