package com.sgtesting.assertionassignments;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Create3Users extends Coding {
	public static WebElement add=null, fname=null, lname=null, email=null, uname=null, pwd=null, repwd=null, create=null, login=null, logout=null;

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
	static void create3Users()
	{	

		try
		{
			for(int i=1;i<=3;i++)
			{
				getbrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[2]")).click();
				Thread.sleep(1000);
				add=getbrowser.findElement(By.xpath("//*[@id=\'createUserDiv\']/div/div[2]"));	add.click();
				Thread.sleep(1000);
				fname=getbrowser.findElement(By.name("firstName"));		fname.sendKeys("sai"+i);
				lname=getbrowser.findElement(By.name("lastName"));		lname.sendKeys("last"+i);
				email=getbrowser.findElement(By.name("email"));			email.sendKeys("sai"+i+"@gmail.com");
				uname=getbrowser.findElement(By.name("username"));		uname.sendKeys("user"+i);
				pwd=getbrowser.findElement(By.name("password"));		pwd.sendKeys("password"+i);
				repwd=getbrowser.findElement(By.name("passwordCopy"));	repwd.sendKeys("password"+i);
				create=getbrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span"));	create.click();
				Thread.sleep(1500);
			}
			

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=3)
	static void loginandlogoutuser1()
	{
		try
		{
			Coding.logout();Thread.sleep(1000);
			uname=getbrowser.findElement(By.name("username"));		uname.sendKeys("user1");	
			Thread.sleep(1000);
			pwd=getbrowser.findElement(By.name("pwd"));		pwd.sendKeys("password1");	
			Thread.sleep(1000);
			login=getbrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div"));		login.click();	
			Thread.sleep(1000);
			//getbrowser.findElement(By.xpath("*//*[text()=\"Start exploring actiTIME\"]")).click();
			getbrowser.findElement(By.xpath("html//div//div//div//span[@class=\"startExploringText\"]")).click();
			//getbrowser.findElement(By.xpath("//*[@id=\'welcomeScreenBoxId\']/div[3]/div/span[1]")).click(); 
			Thread.sleep(2000);
			Coding.logout();
			//logout=getbrowser.findElement(By.linkText("Logout"));	logout.click(); 
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
			uname=getbrowser.findElement(By.name("username"));		uname.sendKeys("user2");		
			Thread.sleep(1000);
			pwd=getbrowser.findElement(By.name("pwd"));		pwd.sendKeys("password2");	
			Thread.sleep(1000);
			login=getbrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div"));		login.click();	
			Thread.sleep(1000);
			//getbrowser.findElement(By.xpath("*//*[text()=\"Start exploring actiTIME\"]")).click();
			getbrowser.findElement(By.xpath("html//div//div//div//span[@class=\"startExploringText\"]")).click();
			//getbrowser.findElement(By.xpath("//*[@id=\'welcomeScreenBoxId\']/div[3]/div/span[1]")).click();  
			Thread.sleep(2000);
			Coding.logout();
			//logout=getbrowser.findElement(By.linkText("Logout"));	logout.click(); 
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
			uname=getbrowser.findElement(By.name("username"));		uname.sendKeys("user3");		
			Thread.sleep(1000);
			pwd=getbrowser.findElement(By.name("pwd"));		pwd.sendKeys("password3");	
			Thread.sleep(1000);
			login=getbrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div"));		login.click();	
			Thread.sleep(1000);
			//getbrowser.findElement(By.xpath("*//*[text()=\"Start exploring actiTIME\"]")).click();
			getbrowser.findElement(By.xpath("html//div//div//div//span[@class=\"startExploringText\"]")).click();
			//getbrowser.findElement(By.xpath("//*[@id=\'welcomeScreenBoxId\']/div[3]/div/span[1]")).click();  
			Thread.sleep(2000);
			Coding.logout();
			//logout=getbrowser.findElement(By.linkText("Logout"));	logout.click(); 
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
