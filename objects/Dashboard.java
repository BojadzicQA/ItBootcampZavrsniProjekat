package objects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.google.common.util.concurrent.Uninterruptibles;

public class Dashboard {
	
	public static final String DASHBOARD_URL = "https://markomaric.humanity.com/app/dashboard/";
	private static final String EMAIL_USER_XPATH = "//*[@id=\"email\"]";
	private static final String PASS_USER_XPATH = "//*[@id=\"password\"]";
	private static final String LOGIN_XPATH = "//*[@id=\"LoginForm\"]/div[3]/div/button[1]";
	private static final String DASHBOARD_XPATH = "//*[@id=\"sn_dashboard\"]/span";
	private static final String SHIFT_PLANNING_XPATH = "/html/body/table/tbody/tr/td/div[7]/div/div[2]/ul/li[2]/a/span";
	private static final String TIME_CLOCK_XPATH = "/html/body/table/tbody/tr/td/div[7]/div/div[2]/ul/li[3]/a/span/p";
	private static final String LEAVE_XPATH = "/html/body/table/tbody/tr/td/div[7]/div/div[2]/ul/li[4]/a/span/p";
	private static final String TRAINING_XPATH = "/html/body/table/tbody/tr/td/div[7]/div/div[2]/ul/li[5]/a/span/p";
	private static final String STAFF_XPATH = "/html/body/table/tbody/tr/td/div[7]/div/div[2]/ul/li[6]/a/span/p";
	private static final String AVAILABILITY_XPATH = "/html/body/table/tbody/tr/td/div[7]/div/div[2]/ul/li[7]/a/span/p";
	private static final String PAYROLL_XPATH = "/html/body/table/tbody/tr/td/div[7]/div/div[2]/ul/li[8]/a/span";
	private static final String REPORTS_XPATH = "/html/body/table/tbody/tr/td/div[7]/div/div[2]/ul/li[9]/a/span/p";
	private static final String SETINGS_XPATH = "/html/body/table/tbody/tr/td/div[7]/div/div[3]/ul/li/a/span/i";

	public static void registrationDashboard(WebDriver driver) {
		driver.findElement(By.xpath(EMAIL_USER_XPATH)).sendKeys("leto1979@gmail.com");
		driver.findElement(By.xpath(PASS_USER_XPATH)).sendKeys("leto1979");
		driver.findElement(By.xpath(LOGIN_XPATH)).click();
		Uninterruptibles.sleepUninterruptibly(7, TimeUnit.SECONDS);
	}
	
	public static void checkShiftPlanning(WebDriver driver) {
		driver.findElement(By.xpath(SHIFT_PLANNING_XPATH)).click();
		Uninterruptibles.sleepUninterruptibly(7, TimeUnit.SECONDS);
		String actual = driver.getTitle();
		String expected = "ShiftPlanning - Humanity";
		Assert.assertEquals(actual, expected);
	}
	
	public static void checkTimeClock(WebDriver driver) {
		driver.findElement(By.xpath(TIME_CLOCK_XPATH)).click();
		Uninterruptibles.sleepUninterruptibly(7, TimeUnit.SECONDS);
		String actual = driver.getTitle();
		String expected = "Timeclock - Overview - Humanity";
		Assert.assertEquals(actual, expected);
	}
	public static void checkLeave(WebDriver driver) {
		driver.findElement(By.xpath(LEAVE_XPATH)).click();
		Uninterruptibles.sleepUninterruptibly(7, TimeUnit.SECONDS);
		String actual = driver.getTitle();
		String expected = "Leave - Vacation - Humanity";
		Assert.assertEquals(actual, expected);
}
	public static void checkTraining(WebDriver driver) {
		driver.findElement(By.xpath(TRAINING_XPATH)).click();
		Uninterruptibles.sleepUninterruptibly(7, TimeUnit.SECONDS);
		String actual = driver.getTitle();
		String expected = "Training - Overview - Humanity";
		Assert.assertEquals(actual, expected);
}
	public static void checkStaff(WebDriver driver) {
		driver.findElement(By.xpath(STAFF_XPATH )).click();
		Uninterruptibles.sleepUninterruptibly(7, TimeUnit.SECONDS);
		String actual = driver.getTitle();
		String expected = "Staff - List - Humanity";
		Assert.assertEquals(actual, expected);
}
	public static void checkAvailability(WebDriver driver) {
		driver.findElement(By.xpath(AVAILABILITY_XPATH )).click();
		Uninterruptibles.sleepUninterruptibly(7, TimeUnit.SECONDS);
		String actual = driver.getTitle();
		String expected = "Humanity";
		Assert.assertEquals(actual, expected);
}
	public static void checkPayroll(WebDriver driver) {
		driver.findElement(By.xpath(PAYROLL_XPATH )).click();
		Uninterruptibles.sleepUninterruptibly(7, TimeUnit.SECONDS);
		String actual = driver.getTitle();
		String expected = "Payroll - Scheduled-hours - Humanity";
		Assert.assertEquals(actual, expected);
	}
	public static void checkReports(WebDriver driver) {
		driver.findElement(By.xpath(REPORTS_XPATH )).click();
		Uninterruptibles.sleepUninterruptibly(7, TimeUnit.SECONDS);
		String actual = driver.getTitle();
		String expected = "Reports - Reports Home - Humanity";
		Assert.assertEquals(actual, expected);
	}
	public static void checkSetings(WebDriver driver) {
		driver.findElement(By.xpath(SETINGS_XPATH )).click();
		Uninterruptibles.sleepUninterruptibly(7, TimeUnit.SECONDS);
		String actual = driver.getTitle();
		String expected = "Settings - Manage Settings - Humanity";
		Assert.assertEquals(actual, expected);
	}
	
}
