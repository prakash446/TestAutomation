package com.sgtesting.log4jassignments;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.apache.log4j.Logger;

public class CreateModifyDeleteCustomer extends Coding {
	public static Logger log=Logger.getLogger("Assignment-4");
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
	static void modifyCustomer()
	{
		try
		{
			log.info("Selecting The Customer");
			getbrowser.findElement(By.xpath("//div[@class='node customerNode selected']//div[@class='editButton available']")).click();
			Thread.sleep(2000);	
			log.info("Entering The Required Modification Changes");
			getbrowser.findElement(By.xpath("//textarea[@class='textarea'][@placeholder='Enter customer description...']")).sendKeys("Customer is new to this field");
			Thread.sleep(2000);	
			log.info("Saving The Customer Details");
			getbrowser.findElement(By.xpath("//div[@class='edit_customer_sliding_panel sliding_panel']//div//div[@class='closeButton']")).click();
			Thread.sleep(2000);	

		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}
	@Test(priority=4)
	static void deleteCustomer()
	{
		Coding.deleteCustomer();
	}
	@Test(priority=5)
	static void exit()
	{
		Coding.logout();
		Coding.closeBrowser();

	}

}
