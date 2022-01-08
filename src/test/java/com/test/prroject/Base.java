package com.test.prroject;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {

	public static WebDriver driver;

	public static void initialization() {

		System.setProperty("webdriver.chrome.driver",
				"/Users/shujayousufi/eclipse-workspace/SeleniumLecture/Drivers/chromedriver");
		driver = new ChromeDriver();
		driver.get("http://www.amazon.com");

	}

	public void failed() throws IOException {

		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(scrFile,
					new File("/Users/shujayousufi/eclipse-workspace/HelloWorld/Screen/TestFailure.jpg"));
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
