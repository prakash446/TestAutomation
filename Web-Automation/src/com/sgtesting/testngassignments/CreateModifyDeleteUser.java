package com.sgtesting.testngassignments;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;


public class CreateModifyDeleteUser extends Coding {
	
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
	
		try
		{
			getbrowser.findElement(By.xpath("//td[@class='navItem navCell relative notSelected']//a[@class='content users']")).click();
			Thread.sleep(2000);
			getbrowser.findElement(By.xpath("//div[@class='buttonText']")).click();
			Thread.sleep(2000);
			getbrowser.findElement(By.xpath("//div[@class='inputGroup']//input[@name='firstName']")).sendKeys("sai");
			getbrowser.findElement(By.xpath("//input[@type='text'and@name='lastName']")).sendKeys("prakash");
			getbrowser.findElement(By.xpath("//input[@type='text'and@name='email']")).sendKeys("prakash@gmail.com");
			getbrowser.findElement(By.xpath("//input[@type='text'and@name='username']")).sendKeys("surya");
			getbrowser.findElement(By.xpath("//input[@type='password'and@name='password']")).sendKeys("1234");
			getbrowser.findElement(By.xpath("//input[@type='password'and@name='passwordCopy']")).sendKeys("1234");
			getbrowser.findElement(By.xpath("//div[@id='userDataLightBox_commitBtn']")).click();
			Thread.sleep(1000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=3)
	static void modifyUser()
	{
		try
		{
			getbrowser.navigate().refresh();Thread.sleep(1000);
			getbrowser.findElement(By.xpath("//tr[1]//td[@class='userNameCell first']")).click();Thread.sleep(2000);	
			getbrowser.findElement(By.xpath("//div[@class='inputGroup']//input[@name='firstName']")).clear();
			getbrowser.findElement(By.xpath("//div[@class='inputGroup']//input[@name='firstName']")).sendKeys("sai123");
			getbrowser.findElement(By.xpath("//input[@type='text'and@name='lastName']")	).clear();
			getbrowser.findElement(By.xpath("//input[@type='text'and@name='lastName']")	).sendKeys("prakash123");
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
		try
		{
			getbrowser.navigate().refresh();
			getbrowser.findElement(By.xpath("//tr[1]//td[@class='userNameCell first']")).click();
			Thread.sleep(2000);				
			getbrowser.findElement(By.xpath("//button[@id='userDataLightBox_deleteBtn']")).click();
			Thread.sleep(2000);
			Alert obj=getbrowser.switchTo().alert();
			obj.accept();
			Thread.sleep(1000);
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}
	@Test(priority=5)
	static void exit()
	{
		Coding.logout();
		Coding.closeBrowser();
		
	}

}
