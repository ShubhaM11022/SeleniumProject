package find_element_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Find_element_program {

	public static void main(String[] args) throws InterruptedException {
		
ChromeDriver cb = new ChromeDriver();
cb.get("https://bsadar.github.io/suta/index.html");
Thread.sleep(3000);
WebElement tf=cb.findElement(By.xpath("//a[normalize-space()='tarun']"));
tf.click();
Thread.sleep(3000);

WebElement bk=cb.findElement(By.xpath("//a[normalize-space()='back']"));
bk.click();
Thread.sleep(3000);

WebElement sf=cb.findElement(By.xpath("//a[normalize-space()='subham']"));
sf.click();

Thread.sleep(3000);
WebElement wf=cb.findElement(By.linkText("back"));
wf.click();
Thread.sleep(3000);



	}

}
