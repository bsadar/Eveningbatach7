package login;
//sadarssingh is not worrrkrkrkrkrkrerjewrjsadargggg
///jjjjjjjjjjjjjjjjjjj
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testcaeses {
 
	WebDriver bo;
	String bpth="http://apps.qaplanet.in/qahrm/login.php";
	
	
	@Test(enabled=true,priority=1,groups="login")
  public void tc0001() {
	  
			bo.findElement(By.xpath("//input[@name='txtUserName']")).sendKeys("qaplanet1");
			bo.findElement(By.name("txtPassword")).sendKeys("lab1");
			bo.findElement(By.name("Submit")).click();

			
			Assert.assertEquals(bo.getTitle(), "OrangeHRM");

		  
  }
    @Test(enabled=true,priority=2,groups="admin")
	  public void tc0002() {
		
		bo.findElement(By.xpath("//td[2]/input")).sendKeys("");
        bo.findElement(By.name("txtPassword")).sendKeys("");
      bo.findElement(By.name("Submit")).click();
        Assert.assertEquals(bo.switchTo().alert().getText(),"User Name not given!");
        bo.switchTo().alert().accept(); 
   
	  }
	
	@BeforeMethod
	void be(){
		System.setProperty("webdriver.gecko.driver", "D:\\SelWD\\Drvers\\geckodriver.exe");
		bo=new FirefoxDriver();
		bo.get(bpth);
	}
  
	@AfterMethod
	void bc(){
		bo.close();
	}
  
  
}
