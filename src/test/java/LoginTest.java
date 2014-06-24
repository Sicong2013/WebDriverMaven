import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;


public class LoginTest {
	public static WebDriver driver;
	
	public void setUp()
	{
		driver = new FirefoxDriver();
		
	}
	@Test
	public void doLogin()
	{
		driver.get("http://gmail.com");
		driver.findElement(By.id("Email")).sendKeys("trainer@way2automatoin.com");
		driver.findElement(By.id("Passwd")).sendKeys("sdfdsf");
		
	}
	
	public void tearDown()
	{
		driver.quit();
	}
}
