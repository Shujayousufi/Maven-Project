package com.test.prroject;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.Assert;

//@Listeners(CustomListenner.class)
public class ScreenshotTest extends Base {

	@BeforeMethod
	public void setUp() {
		initialization();

	}

	@AfterMethod
	public void tearDown() throws InterruptedException {

		Thread.sleep(3000);
		driver.close();
	}

	@Test
	public void takeScreenshotTest() {

		Assert.assertEquals(false, true);
	}

	@Test
	public void takeScreenshotTest2() {

		Assert.assertEquals(false, true);
	}
}