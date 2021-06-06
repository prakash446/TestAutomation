package com.sgtesting.log4jassignments;

import org.testng.annotations.Test;

public class CreateAndDeleteCustomer extends Coding {

	@Test(priority=1)
	static void entrance()
	{
		Coding.launchBrowserandNavigate();
		Coding.loginAdmin();
		Coding.minimizeFlyOutWindow();
	}
	@Test(priority=2)
	static void createCustomer()
	{
		Coding.createCustomer();
	}
	@Test(priority=3)
	static void deleteCustomer()
	{
		Coding.deleteCustomer();
	}
	@Test(priority=4)
	static void exit()
	{
		Coding.logout();
		Coding.closeBrowser();	
	}
}
