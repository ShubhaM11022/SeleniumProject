package parameterPassing;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterProgram {
 @Parameters({"url"})
  @Test
  public void tc1(String buildpath) {
	  ChromeDriver cd= new ChromeDriver();
	  cd.get(buildpath);
  }
}
