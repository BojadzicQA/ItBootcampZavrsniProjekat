package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import objects.Home;
import objects.Screenshoot;

public class ScreenShootTest {

	private WebDriver driver;

	@BeforeTest
	public void SetUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenijum\\ChromeDriver.exe");
	    driver = new ChromeDriver();
		driver.get("https://www.humanity.com/");
		driver.manage().window().fullscreen();
		driver.findElement(By.xpath(Home.CLOSE_POP_UP_XPATH)).click();
	}
	
	@AfterTest
	public void tearDown() {
		driver.close();
		driver.quit();
	}
	
	@Test
	public void AboutUs() {
		driver.navigate().to(Screenshoot.ABOUT_US_URL);
		driver.manage().window().fullscreen();
		Screenshoot.takeScreenshot(driver);
		String actual = driver.getCurrentUrl();
		String expected = Screenshoot.ABOUT_US_URL;
		Assert.assertEquals(actual, expected);
		
	}
}