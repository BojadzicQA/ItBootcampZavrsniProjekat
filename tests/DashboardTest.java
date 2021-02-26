package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import objects.Dashboard;

public class DashboardTest {

	private static WebDriver driver;

	@BeforeTest
	public void SetUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenijum\\ChromeDriver.exe");
	    driver = new ChromeDriver();
		driver.manage().window().fullscreen();
		driver.get(Dashboard.DASHBOARD_URL);
		Dashboard.registrationDashboard(driver);
	}
	
	@AfterTest
	public void tearDown() {
		driver.close();
		driver.quit();
	}
	@Test
	public void DashboardTabs() {
		Dashboard.checkShiftPlanning(driver);
		Dashboard.checkTimeClock(driver);
		Dashboard.checkLeave(driver);
		Dashboard.checkTraining(driver);
		Dashboard.checkStaff(driver);
		Dashboard.checkAvailability(driver);
		Dashboard.checkPayroll(driver);
		Dashboard.checkReports(driver);
		Dashboard.checkSetings(driver);
	}
}
