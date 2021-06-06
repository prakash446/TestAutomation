package com.sgtesting.log4jassignments;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.apache.log4j.Logger;

public class Create3Users extends Coding {
	public static Logger log=Logger.getLogger("Assignment-8");
	
	@Test(priority=1)
	static void entrance()
	{
		Coding.launchBrowserandNavigate();
		Coding.loginAdmin();
		Coding.minimizeFlyOutWindow();
	}
	@Test(priority=2)
	static void create3Users()
	{	
		try
		{
			log.info("Entering the Users Page");
			for(int i=1;i<=3;i++)
			{
				getbrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[2]")).click();
				Thread.sleep(1000);
				log.info("Adding a New User-"+i);
				getbrowser.findElement(By.xpath("//*[@id=\'createUserDiv\']/div/div[2]")).click();
				Thread.sleep(1000);
				log.info("Giving The Required Details");
				getbrowser.findElement(By.name("firstName")).sendKeys("sai"+i);
				getbrowser.findElement(By.name("lastName")).sendKeys("last"+i);
				getbrowser.findElement(By.name("email")).sendKeys("sai"+i+"@gmail.com");
				getbrowser.findElement(By.name("username")).sendKeys("user"+i);
				getbrowser.findElement(By.name("password")).sendKeys("password"+i);
				getbrowser.findElement(By.name("passwordCopy")).sendKeys("password"+i);
				log.info("Saving The User-"+i+ " Details");
				getbrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span")).click();
				Thread.sleep(1500);
			}
			Coding.logout();

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	/*@Test(priority = 3)
	static void loginandlogoutusers()
	{
		try
		{
			for(int i=1;i<=3;i++)
			{
				log.info("Giving Credentials For User"+i);
				getbrowser.findElement(By.name("username")).sendKeys("user"+i);		
				Thread.sleep(1000);
				getbrowser.findElement(By.name("pwd")).sendKeys("password"+i);	
				Thread.sleep(1000);
				log.info("Logging In As User"+i);
				getbrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();	
				Thread.sleep(500);
				log.info("Click On Start exploring actiTIME");
				//getbrowser.findElement(By.xpath("//*[@id=\'welcomeScreenBoxId\']/div[3]/div/span[1]")).click(); 
				getbrowser.findElement(By.xpath("html//div//div//div//span[@class=\"startExploringText\"]")).click();
				//getbrowser.findElement(By.xpath("html//div//div//div//span[text()=\"Start exploring actiTIME\"]")).click();
				Thread.sleep(2000);
				Coding.logout();
				Thread.sleep(2000);
			}

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}*/
	@Test(priority=3)

	static void loginandlogoutuser1()
	{
		try
		{
			log.info("Giving Credentials For User1");
			getbrowser.findElement(By.name("username")).sendKeys("user1");	
			Thread.sleep(1000);
			getbrowser.findElement(By.name("pwd")).sendKeys("password1");	
			Thread.sleep(1000);
			log.info("Logging In As User1");
			getbrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();	
			Thread.sleep(1000);
			log.info("Click On Start exploring actiTIME");
			getbrowser.findElement(By.xpath("html//div//div//div//span[@class=\"startExploringText\"]")).click();
			Thread.sleep(2000);
			Coding.logout();
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=4)
	static void loginandlogoutuser2()
	{
		try
		{
			log.info("Giving Credentials For User2");
			getbrowser.findElement(By.name("username")).sendKeys("user2");		
			Thread.sleep(1000);
			getbrowser.findElement(By.name("pwd")).sendKeys("password2");	
			Thread.sleep(1000);
			log.info("Logging In As User2");
			getbrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();	
			Thread.sleep(1000);
			log.info("Click On Start exploring actiTIME");
			getbrowser.findElement(By.xpath("html//div//div//div//span[@class=\"startExploringText\"]")).click();
			Thread.sleep(2000);
			Coding.logout();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=5)
	static void loginandlogoutuser3()
	{
		try
		{
			log.info("Giving Credentials For User3");
			getbrowser.findElement(By.name("username")).sendKeys("user3");		
			Thread.sleep(1000);
			getbrowser.findElement(By.name("pwd")).sendKeys("password3");	
			Thread.sleep(1000);
			log.info("Logging In As User3");
			getbrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();	
			Thread.sleep(1000);
			log.info("Click On Start exploring actiTIME");
			getbrowser.findElement(By.xpath("html//div//div//div//span[@class=\"startExploringText\"]")).click(); 
			Thread.sleep(2000);
			Coding.logout();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=6) 
	static void deleteUser()
	{
		try
		{	
			Coding.loginAdmin();
			for(int i=1;i<=3;i++)
			{
				log.info("Deleting User"+i);
				getbrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[2]")).click();		
				Thread.sleep(1000);
				getbrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[1]")).click(); 
				Thread.sleep(1500);
				getbrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_deleteBtn\']")).click();	
				Thread.sleep(1500);
				Alert check=getbrowser.switchTo().alert();	
				check.accept();	
				Thread.sleep(2000);

			}

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=7)
	static void exit()
	{
		Coding.logout();
		Coding.closeBrowser();

	}

}
