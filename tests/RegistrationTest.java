package tests;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.google.common.util.concurrent.Uninterruptibles;

import objects.Home;

public class RegistrationTest {

	private WebDriver driver;
	private Home homepage;
	
	@BeforeTest
	public void SetUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenijum\\ChromeDriver.exe");
	    driver = new ChromeDriver();
	    homepage = new Home(driver);
		driver.get("https://www.humanity.com/");
		driver.manage().window().fullscreen();
		driver.findElement(By.xpath(Home.CLOSE_POP_UP_XPATH)).click();
	}
	
	@Test
	public void RegistrationFirst() {
		homepage.enterFullName("Fili Siljic");
		homepage.enterEmail("fili.zdera@gmail.com");
		homepage.startFreeClick();
		homepage.enterCompanyName("Fast Food");
		homepage.chooseIndustry("Restaurant / Food Service");
		homepage.chooseFunctionalRole("Operations");
		homepage.enterPhoneNumber("068565656");
		homepage.enterPassword("zdera123");
		homepage.enterRepeatPassword("zdera123");
		homepage.startScheduling();
	}
	
	@AfterTest
	public void tearDown() {
		driver.close();
		driver.quit();
	}
	
	@Test
	public void RegistrationSecond() {
		homepage.startFreeSecondClick();
		homepage.enterSecondFullName("Aaki Strike");
		homepage.enterSecondEmail("aaki.strike@gmail.com");
		homepage.startFreeTrialClick();
		homepage.enterCompanyName("Fast Food");
		homepage.chooseIndustry("Restaurant / Food Service");
		homepage.chooseFunctionalRole("Operations");
		homepage.enterPhoneNumber("068565656");
		homepage.enterPassword("zdera123");
		homepage.enterRepeatPassword("zdera123");
		homepage.startScheduling();
	}
}
