
/*import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.events.WebDriverEventListener;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class LoginTest {
	//What is log? : capturing info/activities at the time of program execution. 
	// types of logs:
		//1. info
		//2. warn
		//3. debug
		//4. fatal
		
	//how to generate the logs? : use Apache log4j API (log4j jar)
	//How it works? : it reads log 4j configuration from log4j.properties file
	//where to create: create inside resources folder
	
	public static WebDriver driver;
	
	Logger log = Logger.getLogger(LoginTest.class);
	
	
	@BeforeMethod
	public void setup(){
		log.info("****************************** Starting test cases execution  *****************************************");

			
				driver = new ChromeDriver(); 
		log.info("launching chrome broswer");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://classic.crmpro.com/login.cfm");
		log.info("entering application URL");
		log.warn("Hey this just a warning message");
		log.fatal("hey this is just fatal error message");
		log.debug("this is debug message");
	}
	
	
	@Test(priority=1)
	public void freeCrmTitleTest(){
		log.info("****************************** starting test case *****************************************");
		log.info("****************************** freeCrmTitleTest *****************************************");
		String title = driver.getTitle();
		System.out.println(title);
		log.info("login page title is--->"+title);
		Assert.assertEquals(title,"CRMPRO Log In Screen");
		
		log.info("****************************** ending test case *****************************************");
		log.info("****************************** freeCrmTitleTest *****************************************");

	}
	
	@Test(priority=2)
	public void freemCRMLogoTest(){
		log.info("****************************** starting test case *****************************************");
		log.info("****************************** freemCRMLogoTest *****************************************");

		boolean b = driver.findElement(By.xpath("//img[@class='img-responsive']")).isDisplayed();
		Assert.assertTrue(b);
		
		log.info("****************************** ending test case *****************************************");
		log.info("****************************** freemCRMLogoTest *****************************************");

	}
	
	

	@AfterMethod
	public void tearDown(){
		driver.quit();
		log.info("****************************** Browser is closed *****************************************");

		}
	}
	*/
	
	
	
	
	
	
	







import java.util.concurrent.TimeUnit;
//import java.util.logging.Logger;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

//import junit.framework.Assert;

public class LoginTest {

	
	public static WebDriver driver;
	
	Logger log=Logger.getLogger(LoginTest.class);
	@BeforeMethod()
	public void setup() {
		driver=new ChromeDriver();
		driver.get("https://classic.crmpro.com/login.cfm");
		log.info(";;;;;;;;;;;;;;;;;;;;;;;;;chrome Application is launched';;;;;;;;;;;;;;;;;;;;;;;;;;;;;");
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		log.error("there is a error message");
		log.fatal("fatal error");
		log.warn("-------------------------------There is a warning message-----------------------------");
		log.debug("There is debug message");
	
		
	}
	
	@Test(priority=1)
	public void freecrmtitle() {
	String ac=	driver.getTitle();
		System.out.println(ac);
	
		Assert.assertEquals(ac,"CRMPRO Log In Screen");
	}
	
	@Test(priority=2)
	public void logotest() throws Throwable {
		
		boolean b = driver.findElement(By.xpath("//img[@class='img-responsive']")).isDisplayed();
		Assert.assertTrue(b);
	

	}
	@AfterMethod
	public void teardown() {
		driver.close();
		
	}
}
