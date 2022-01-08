package com.test.prroject;


import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import org.testng.Assert;
import org.testng.ITestListener;

public class CustomListenner extends Base implements ITestListener {

	@BeforeMethod

	public void onTestStart(ITestResult result) {

	}

	@AfterMethod
	public void onTestSucess(ITestResult result) {

	}

	@Test
	public void onTestFailure(ITestResult result) {

		Assert.assertEquals(false, true);

	}

}
