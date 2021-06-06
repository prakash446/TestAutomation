package com.sgtesting.log4jassignments;

import org.testng.annotations.Test;

public class CreateCustomerProjectDeleteProjectCustomer extends Coding {
	@Test(priority=1)
	static void entrance()
	{
		Coding.launchBrowserandNavigate();
		Coding.loginAdmin();
		Coding.minimizeFlyOutWindow();
		try
		{
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=2)
	static void createCustomer()
	{
		Coding.createCustomer();
	}
	@Test(priority=3)
	static void createProject()
	{
		Coding.createProject();
	}

	@Test(priority=4)
	static void deleteProject()
	{
		Coding.deleteProject();
	}
	@Test(priority=5)
	static void deleteCustomer()
	{
		Coding.deleteCustomer();
	}
	@Test(priority=6)
	static void exit()
	{
		Coding.logout();
		Coding.closeBrowser();
		
	}
}
