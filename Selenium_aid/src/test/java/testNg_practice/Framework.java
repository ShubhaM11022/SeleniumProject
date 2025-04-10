package testNg_practice;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Framework {
	String buildpath="";
	  
	  @BeforeMethod
	  public void buildexecution() {
	  }

	  @AfterMethod
	  public void buildclose() {
	  }
	  @Test(enabled=true,priority=1, groups="Login")
	  public void tc1() {
	  }
}
