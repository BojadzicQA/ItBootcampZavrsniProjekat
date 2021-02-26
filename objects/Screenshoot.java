package objects;

import java.io.File;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Screenshoot {
	
	public static final String ABOUT_US_URL = "https://www.humanity.com/about";
	
	public static void takeScreenshot(WebDriver driver) {
		File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	}
}
