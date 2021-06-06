package com.sgtesting.log4jassignments;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.apache.log4j.Logger;

public class CreateAndDeleteUser {
	public static Logger log=Logger.getLogger("Assignment1 Output");
	public static WebDriver getbrowser=null;
	@Test(priority=1)
	static void entrance()
	{
		Coding.launchBrowserandNavigate();
		Coding.loginAdmin();
		Coding.minimizeFlyOutWindow();
	}

	@Test(priority=2)
	static void createUser()
	{
		Coding.CreateUser();
	}
	@Test(priority=3)
	static void deleteUser()
	{
		Coding.deleteUser();
	}
	@Test(priority=4)
	static void exit()
	{
		Coding.logout();
		Coding.closeBrowser();

	}
}
