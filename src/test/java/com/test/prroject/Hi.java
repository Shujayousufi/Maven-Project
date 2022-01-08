package com.test.prroject;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestListener;

public class Hi extends Base implements ITestListener{

	
	public static WebDriver  driver;
	public static void inititalization() {
		
//		System.setProperty("webdriver.chrome.driver", "/Users/shujayousufi/eclipse-workspace/SeleniumLecture/Drivers/chromedriver");
//		driver = new ChromeDriver();
//		driver.get("https://www.facebook.com");
	}
	public void failed() throws IOException {
		
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
		FileUtils.copyFile(scrFile, new File("/Users/shujayousufi/eclipse-workspace/HelloWorld/ScrennShot"));
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
}
