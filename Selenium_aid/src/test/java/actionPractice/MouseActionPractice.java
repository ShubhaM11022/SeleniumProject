package actionPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActionPractice {

	public static void main(String[] args) {
WebDriver bo= new ChromeDriver();
bo.get("https://www.redbus.in/");

Actions action= new Actions(bo);
//Actions ac=action.moveToElement(bo.findElement(By.xpath("//div[@class='img_new_wrap']//img[@title='Online Train Tickets Booking']"))).click();
//ac.perform();

action.sendKeys(Keys.PAGE_DOWN).perform();
action.sendKeys(Keys.PAGE_DOWN).perform();

//Actions ac=action.moveToElement(bo.findElement(By.xpath("//div[@class='img_new_wrap']//img[@title='Online Train Tickets Booking']"))).contextClick();
//ac.perform();

Actions ac=action.moveToElement(bo.findElement(By.xpath("//div[@class='img_new_wrap']//img[@title='Online Train Tickets Booking']"))).doubleClick();
ac.perform();

	}

}
