import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Screenshot {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setUp()
	{
		//Adding comment
		//updated the comment and pushing into local branch
		driver= new EdgeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
	}
	

	@org.testng.annotations.Test
	public void test1() throws IOException, InterruptedException
	{
		String title= driver.getCurrentUrl();
		Thread.sleep(1000);
		File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File destination = new File("C:\\Users\\Nitin Shetty\\Desktop\\DEMO\\ScreenShot.PNG");
		
		FileUtils.copyFile(screenshot, destination);
		
	}
	//added code in eclipse
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
}
