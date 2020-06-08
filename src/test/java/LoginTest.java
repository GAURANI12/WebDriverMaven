import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {
	
	public static WebDriver driver;
	
	@BeforeSuite
	public void setUp() {
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
	}
	
	@Test
	public void doLogin() {
		driver.get("https://www.rediff.com/");
		driver.findElement(By.xpath("/html/body/div[2]/div/div[3]/p/a[1]")).click();
		driver.findElement(By.id("login1")).sendKeys("gauravkumarsingh2008.2008");
		driver.findElement(By.id("password")).sendKeys("something");
	}
	
	@AfterSuite
	public void tearDown() {
		driver.quit();
	}
}