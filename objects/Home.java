package objects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.google.common.util.concurrent.Uninterruptibles;

//import objs.Home;
//import objs.Registration;

public class Home {
	
	public static final String URL = "https://www.humanity.com/";
	public static final String CLOSE_POP_UP_XPATH = "//html/body/div[2]/div/div/div[1]/button";
	public static final String ABOUT_US_XPATH = "//*[@id=\"navbarSupportedContent\"]/ul/li[6]/a";
	private static final String START_XPATH = "//*[@id=\"navbarSupportedContent\"]/div/a[3]";
	private static final String FULL_NAME_FIRST_XPATH = "//*[@id=\"top-form\"]/div/div[1]/input";
	private static final String FULL_NAME_SECOND_XPATH = "//*[@id=\"popup-form\"]/div[1]/input";
	private static final String WORK_EMAIL_FIRST_XPATH = "//*[@id=\"top-form\"]/div/div[2]/input";
	private static final String WORK_EMAIL_SECOND_XPATH = "//*[@id=\"popup-form\"]/div[2]/input";
	private static final String START_FREE_FIRST_XPATH = "//*[@id=\"free-trial-link-01\"]";
	private static final String START_FREE_SECOND_XPATH = "//*[@id=\"navbarSupportedContent\"]/div/a[3]";
	private static final String COMPANY_NAME_XPATH = "//*[@id=\"root\"]/div/div/form/div[1]/div/div[1]/div/div/input";
	private static final String INDUSTRY_XPATH = "//*[@id=\"root\"]/div/div/form/div[1]/div/div[2]/div/div";
	private static final String FUNCTIONAL_ROLE_XPATH = "//*[@id=\"root\"]/div/div/form/div[1]/div/div[3]/div/div";
	private static final String FUNCTIONAL_UL_ROLE_XPATH = "//*[@id=\"root\"]/div/div/form/div[1]/div/div[3]/div/div/ul/li[5]";
	private static final String PHONE_NUMBER_XPATH = "//*[@id=\"root\"]/div/div/form/div[1]/div/div[4]/div/input";
	private static final String PASSWORD_XPATH = "//*[@id=\"root\"]/div/div/form/div[1]/div/div[5]/div/input";
	private static final String REPEAT_PASSWORD_XPATH = "//*[@id=\"root\"]/div/div/form/div[1]/div/div[6]/div/input";
	private static final String START_SCHEDULING_XPATH = "//*[@id=\"root\"]/div/div/form/div[2]/span/input";
	private static final String START_FREE_TRIAL_XPATH = "//*[@id=\"popup-free-trial-link\"]";
	
	private WebDriver driver;
	
	public Home(WebDriver driver) {
		this.driver = driver;
	}
	
	public void aboutUs(WebDriver driver) {
		WebElement aboutUs = driver.findElement(By.xpath(ABOUT_US_XPATH));
		Assert.assertTrue(aboutUs.isDisplayed(), "Element is not visible!"); 
		aboutUs.click();
	}
	
	public void enterFullName(String fullName) {
		WebElement fullNameInput = driver.findElement(By.xpath(FULL_NAME_FIRST_XPATH));
		Assert.assertTrue(fullNameInput.isDisplayed(), "Element is not visible!"); 
		fullNameInput.sendKeys(fullName);
	}

	public void enterEmail(String workEmail) {
		WebElement workEmailInput = driver.findElement(By.xpath(WORK_EMAIL_FIRST_XPATH));
		Assert.assertTrue(workEmailInput.isDisplayed(), "Element is not visible!"); 
		workEmailInput.sendKeys(workEmail);
	}

	public void startFreeClick() {
		WebElement startFree = driver.findElement(By.xpath(START_FREE_FIRST_XPATH));
		Assert.assertTrue(startFree.isDisplayed(), "Element is not visible!"); 
		startFree.click();
		Uninterruptibles.sleepUninterruptibly(5, TimeUnit.SECONDS);
	}
	
	public void enterCompanyName(String companyName) {
		WebElement companyNameInput = driver.findElement(By.xpath(COMPANY_NAME_XPATH));
		Assert.assertTrue(companyNameInput.isDisplayed(), "Element is not visible!"); 
		companyNameInput.sendKeys(companyName);
	}
	
	public void chooseIndustry(String industryName) {
		WebElement industryDropdown = driver.findElement(By.xpath(INDUSTRY_XPATH));
		Assert.assertTrue(industryDropdown.isDisplayed(), "Element is not visible!");
		industryDropdown.click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		industryDropdown.sendKeys(Keys.ARROW_DOWN);
		industryDropdown.sendKeys(Keys.ARROW_DOWN);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		industryDropdown.sendKeys(Keys.ENTER);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	
	public void chooseFunctionalRole(String functionalRole) {
		WebElement functionalRoleDropdown = driver.findElement(By.xpath(FUNCTIONAL_ROLE_XPATH));
		Assert.assertTrue(functionalRoleDropdown.isDisplayed(), "Element is not visible!");
		functionalRoleDropdown.click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement functionalUlRoleDropdown = driver.findElement(By.xpath(FUNCTIONAL_UL_ROLE_XPATH));
		Assert.assertTrue(functionalUlRoleDropdown.isDisplayed(), "Element is not visible!");
		functionalUlRoleDropdown.click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	
	public void enterPhoneNumber(String phoneNumber) {
		WebElement phoneNumberInput = driver.findElement(By.xpath(PHONE_NUMBER_XPATH));
		Assert.assertTrue(phoneNumberInput.isDisplayed(), "Element is not visible!"); 
		phoneNumberInput.sendKeys(phoneNumber);
	}
	
	public void enterPassword(String password) {
		WebElement passwordInput = driver.findElement(By.xpath(PASSWORD_XPATH));
		Assert.assertTrue(passwordInput.isDisplayed(), "Element is not visible!"); 
		passwordInput.sendKeys(password);
	}
	
	public void enterRepeatPassword(String repeatPassword) {
		WebElement repeatPasswordInput = driver.findElement(By.xpath(REPEAT_PASSWORD_XPATH));
		Assert.assertTrue(repeatPasswordInput.isDisplayed(), "Element is not visible!"); 
		repeatPasswordInput.sendKeys(repeatPassword);
	}
	
	public void startScheduling() {
		WebElement startScheduling = driver.findElement(By.xpath(START_SCHEDULING_XPATH));
		Assert.assertTrue(startScheduling.isDisplayed(), "Element is not visible!"); 
		startScheduling.click();
		Uninterruptibles.sleepUninterruptibly(5, TimeUnit.SECONDS);
	}
	
	public void startFreeSecondClick() {
		WebElement startFree = driver.findElement(By.xpath(START_FREE_SECOND_XPATH));
		Assert.assertTrue(startFree.isDisplayed(), "Element is not visible!"); 
		startFree.click();
		Uninterruptibles.sleepUninterruptibly(5, TimeUnit.SECONDS);
	}
	
	public void enterSecondFullName(String fullName) {
		WebElement fullNameInput = driver.findElement(By.xpath(FULL_NAME_SECOND_XPATH));
		Assert.assertTrue(fullNameInput.isDisplayed(), "Element is not visible!"); 
		fullNameInput.sendKeys(fullName);
	}
	
	public void enterSecondEmail(String workEmail) {
		WebElement workEmailInput = driver.findElement(By.xpath(WORK_EMAIL_SECOND_XPATH));
		Assert.assertTrue(workEmailInput.isDisplayed(), "Element is not visible!"); 
		workEmailInput.sendKeys(workEmail);
	}
	
	public void startFreeTrialClick() {
		WebElement startFree = driver.findElement(By.xpath(START_FREE_TRIAL_XPATH));
		Assert.assertTrue(startFree.isDisplayed(), "Element is not visible!"); 
		startFree.click();
		Uninterruptibles.sleepUninterruptibly(5, TimeUnit.SECONDS);
	}
}
	
		
	
	
	
	
	
	

