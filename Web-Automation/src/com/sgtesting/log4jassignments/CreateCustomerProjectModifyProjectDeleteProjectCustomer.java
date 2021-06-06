package com.sgtesting.log4jassignments;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.apache.log4j.Logger;

public class CreateCustomerProjectModifyProjectDeleteProjectCustomer extends Coding {
	public static Logger log=Logger.getLogger("Assignment-6");
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
	static void createProject()
	{
		Coding.createProject();
	}
	@Test(priority=4)
	static void modifyProject()
	{
		try
		{
			log.info("Selecting Project");
			getbrowser.findElement(By.xpath("//div[@class='node projectNode selected']//div[@class='editButton available']")).click();
			Thread.sleep(2000);
			log.info("Modifying Details Required");
			getbrowser.findElement(By.xpath("//textarea[@class='textarea'][@placeholder='Enter project description...']")).sendKeys("it's a complex project");
			Thread.sleep(2000);
			log.info("Saving Project Details");
			getbrowser.findElement(By.xpath("//div[@class='edit_project_sliding_panel sliding_panel']//div[@class='closeButton']")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}
	@Test(priority=5)
	static void deleteProject()
	{
		Coding.deleteProject();
	}
	@Test(priority=6)
	static void deleteCustomer()
	{
		Coding.deleteCustomer();
	}
	@Test(priority=7)
	static void exit()
	{
		Coding.logout();
		Coding.closeBrowser();

	}

}
