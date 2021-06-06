package com.sgtesting.log4jassignments;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class CreateModifyDeleteUser extends Coding {
	public static Logger log=Logger.getLogger("Assignment-2");
	
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
	static void createUser()
	{
		Coding.CreateUser();
	}
	@Test(priority=3)
	static void modifyUser()
	{
		try
		{
			getbrowser.navigate().refresh();
			Thread.sleep(1000);
			log.info("Selecting The User");
			getbrowser.findElement(By.xpath("//tr[1]//td[@class='userNameCell first']")).click();
			Thread.sleep(2000);	
			log.info("Entering The Required Modification Changes");
			getbrowser.findElement(By.xpath("//div[@class='inputGroup']//input[@name='firstName']")).clear();
			getbrowser.findElement(By.xpath("//div[@class='inputGroup']//input[@name='firstName']")).sendKeys("sai123");
			getbrowser.findElement(By.xpath("//input[@type='text'and@name='lastName']")	).clear();
			getbrowser.findElement(By.xpath("//input[@type='text'and@name='lastName']")	).sendKeys("prakash123");
			log.info("Saving The User Details");
			getbrowser.findElement(By.xpath("//div[@id='userDataLightBox_commitBtn']//div//span[@class='buttonTitle']")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=4)
	static void deleteUser()
	{
		Coding.deleteUser();
	}
	@Test(priority=5)
	static void exit()
	{
		Coding.logout();
		Coding.closeBrowser();
		
	}

}
