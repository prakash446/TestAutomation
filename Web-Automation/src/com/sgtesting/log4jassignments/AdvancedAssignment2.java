package com.sgtesting.log4jassignments;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.apache.log4j.Logger;

public class AdvancedAssignment2 extends Coding{
	public static Logger log=Logger.getLogger("Assignment-9");
	public static WebElement add=null, fname=null, lname=null, email=null, uname=null, pwd=null, repwd=null, create=null, login=null, logout=null;
	
	@Test(priority=1)
	static void entrance()
	{
		Coding.launchBrowserandNavigate();
		Coding.loginAdmin();
		Coding.minimizeFlyOutWindow();
	}
	@Test(priority=2)
	static void createUser1()
	{	

		try
		{
			log.info("Entering the Users Page");
			getbrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(1000);
			log.info("Adding a New User-1");
			add=getbrowser.findElement(By.xpath("//*[@id=\'createUserDiv\']/div/div[2]"));	add.click();
			Thread.sleep(1000);
			log.info("Giving The Required Details");
			fname=getbrowser.findElement(By.name("firstName"));		fname.sendKeys("sai1");
			lname=getbrowser.findElement(By.name("lastName"));		lname.sendKeys("last1");
			email=getbrowser.findElement(By.name("email"));			email.sendKeys("user1@mail.com");
			uname=getbrowser.findElement(By.name("username"));		uname.sendKeys("user1");
			pwd=getbrowser.findElement(By.name("password"));		pwd.sendKeys("password1");
			repwd=getbrowser.findElement(By.name("passwordCopy"));	repwd.sendKeys("password1");
			log.info("Saving The User-1 Details");
			create=getbrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span"));	create.click();
			Thread.sleep(1500);
			Coding.logout();
			Thread.sleep(1500);

		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	@Test(priority=3)
	static void loginuser1()
	{
		try
		{
			log.info("Giving Credentials For User1");
			uname=getbrowser.findElement(By.name("username"));		uname.sendKeys("user1");		
			Thread.sleep(1000);
			pwd=getbrowser.findElement(By.name("pwd"));		pwd.sendKeys("password1");	
			Thread.sleep(1000);
			log.info("Logging In As User1");
			login=getbrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div"));		login.click();	
			Thread.sleep(1000);
			log.info("Click On Start exploring actiTIME");
			getbrowser.findElement(By.xpath("html//div//div//div//span[@class=\"startExploringText\"]")).click();
			Thread.sleep(2000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=4)
	static void createUser2()
	{	

		try
		{
			log.info("Entering the Users Page");
			getbrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(1000);
			log.info("Adding a New User-2");
			add=getbrowser.findElement(By.xpath("//*[@id=\'createUserDiv\']/div/div[2]"));	add.click();
			Thread.sleep(1000);
			log.info("Giving The Required Details");
			fname=getbrowser.findElement(By.name("firstName"));		fname.sendKeys("sai2");
			lname=getbrowser.findElement(By.name("lastName"));		lname.sendKeys("last2");
			email=getbrowser.findElement(By.name("email"));			email.sendKeys("user2@mail.com");
			uname=getbrowser.findElement(By.name("username"));		uname.sendKeys("user2");
			pwd=getbrowser.findElement(By.name("password"));		pwd.sendKeys("password2");
			repwd=getbrowser.findElement(By.name("passwordCopy"));	repwd.sendKeys("password2");
			log.info("Saving The User-2 Details");
			create=getbrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span"));	create.click();
			Thread.sleep(1500);
			Coding.logout();
			Thread.sleep(1500);

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=5)
	static void loginuser2()
	{
		try
		{
			log.info("Giving Credentials For User2");
			uname=getbrowser.findElement(By.name("username"));		uname.sendKeys("user2");		
			Thread.sleep(1000);
			pwd=getbrowser.findElement(By.name("pwd"));		pwd.sendKeys("password2");	
			Thread.sleep(1000);
			log.info("Logging In As User2");
			login=getbrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div"));		login.click();	
			Thread.sleep(1000);
			log.info("Click On Start exploring actiTIME");
			getbrowser.findElement(By.xpath("html//div//div//div//span[@class=\"startExploringText\"]")).click(); 
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=6)
	static void createUser3()

	{	

		try
		{
			log.info("Entering the Users Page");
			getbrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(1000);
			log.info("Adding a New User-3");
			add=getbrowser.findElement(By.xpath("//*[@id=\'createUserDiv\']/div/div[2]"));	add.click();
			Thread.sleep(1000);
			log.info("Giving The Required Details");
			fname=getbrowser.findElement(By.name("firstName"));		fname.sendKeys("sai3");
			lname=getbrowser.findElement(By.name("lastName"));		lname.sendKeys("last3");
			email=getbrowser.findElement(By.name("email"));			email.sendKeys("user3@mail.com");
			uname=getbrowser.findElement(By.name("username"));		uname.sendKeys("user3");
			pwd=getbrowser.findElement(By.name("password"));		pwd.sendKeys("password3");
			repwd=getbrowser.findElement(By.name("passwordCopy"));	repwd.sendKeys("password3");
			log.info("Saving The User-3 Details");
			create=getbrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span"));	create.click();
			Thread.sleep(1500);
			Coding.logout();
			Thread.sleep(1500);
			Coding.loginAdmin();
			Thread.sleep(1500);

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=7)
	static void modifyUser1()
	{
		try
		{
			log.info("Entering the Users Page");
			getbrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(1000);
			log.info("Selecting The User");
			getbrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[1]")).click(); 
			Thread.sleep(1500);
			log.info("Doing The Modifications");
			fname=getbrowser.findElement(By.name("firstName"));	
			fname.clear(); Thread.sleep(1000); 	fname.sendKeys("user1new"); 
			Thread.sleep(1000);
			lname=getbrowser.findElement(By.name("lastName"));		
			lname.clear(); Thread.sleep(1000); 	lname.sendKeys("last1new");	
			Thread.sleep(1000);
			uname=getbrowser.findElement(By.name("username"));	
			uname.clear();  Thread.sleep(1000);	uname.sendKeys("user1new");  
			Thread.sleep(1000);
			log.info("Saving The Data");
			getbrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span")).click(); 
			Thread.sleep(1000);
			Coding.logout();
			Thread.sleep(1500);
		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}
	@Test(priority=8)
	static void loginModifieduser1()
	{
		try
		{
			log.info("Entering user-1 Credentials");
			uname=getbrowser.findElement(By.name("username"));		uname.sendKeys("user1new");		
			Thread.sleep(1000);
			pwd=getbrowser.findElement(By.name("pwd"));		pwd.sendKeys("password1");	
			Thread.sleep(1000);
			log.info("Logging As User-1");
			login=getbrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div"));		login.click();	
			Thread.sleep(2000);  
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=9)
	static void modifyUser2()
	{
		try
		{
			log.info("Entering the Users Page");
			getbrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(1000);
			log.info("Selecting The User");
			getbrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[2]")).click();
			Thread.sleep(1500);
			log.info("Doing The Modifications");
			fname=getbrowser.findElement(By.name("firstName"));	
			fname.clear(); Thread.sleep(1000); 	fname.sendKeys("user2new"); 
			Thread.sleep(1000);
			lname=getbrowser.findElement(By.name("lastName"));		
			lname.clear(); Thread.sleep(1000); 	lname.sendKeys("last2new");	
			Thread.sleep(1000);
			uname=getbrowser.findElement(By.name("username"));	
			uname.clear();  Thread.sleep(1000);	uname.sendKeys("user2new");  
			Thread.sleep(1000);
			log.info("Saving The Data");
			getbrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span")).click(); 
			Thread.sleep(1000);
			Coding.logout();
			Thread.sleep(1500);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=10)
	static void loginModifieduser2()
	{
		try
		{
			log.info("Entering User-2 Credentials");
			uname=getbrowser.findElement(By.name("username"));		uname.sendKeys("user2new");		
			Thread.sleep(1000);
			pwd=getbrowser.findElement(By.name("pwd"));		pwd.sendKeys("password2");	
			Thread.sleep(1000);
			log.info("Logging As User-2");
			login=getbrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div"));		login.click();	
			Thread.sleep(2000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=11)
	static void modifyUser3()
	{
		try
		{
			log.info("Entering the Users Page");
			getbrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(1000);
			log.info("Selecting The User");
			getbrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[3]")).click(); 
			Thread.sleep(1500);
			log.info("Doing The Modifications");
			fname=getbrowser.findElement(By.name("firstName"));	
			fname.clear(); Thread.sleep(1000); 	fname.sendKeys("user3new"); 
			Thread.sleep(1000);
			lname=getbrowser.findElement(By.name("lastName"));		
			lname.clear(); Thread.sleep(1000); 	lname.sendKeys("last3new");	
			Thread.sleep(1000);
			uname=getbrowser.findElement(By.name("username"));	
			uname.clear();  Thread.sleep(1000);	uname.sendKeys("user3new");  
			Thread.sleep(1000);
			log.info("Saving The Data");
			getbrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span")).click(); 
			Thread.sleep(1000);
			Coding.logout();
			Thread.sleep(1500);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=12)
	static void deleteuser3()
	{
		try
		{
			AdvancedAssignment2.loginModifieduser2();
			Thread.sleep(1000);
			log.info("Entering Users Page");
			getbrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(1000);
			log.info("Selecting The User");
			getbrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[3]")).click(); 
			Thread.sleep(1500);
			log.info("Deleting The User");
			getbrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_deleteBtn\']")).click();	
			Thread.sleep(1500);
			Alert check=getbrowser.switchTo().alert();	check.accept();	
			Thread.sleep(2000);
			Coding.logout();
			Thread.sleep(1500);

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=13)
	static void deleteuser2()
	{
		try
		{
			AdvancedAssignment2.loginModifieduser1();
			Thread.sleep(1000);
			log.info("Entering Users Page");
			getbrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(1000);
			log.info("Selecting The User");
			getbrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[2]")).click(); 
			Thread.sleep(1500);
			log.info("Deleting The User");
			getbrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_deleteBtn\']")).click();	
			Thread.sleep(1500);
			Alert check=getbrowser.switchTo().alert();	check.accept();
			Thread.sleep(2000);
			Coding.logout();
			Thread.sleep(1500);

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=14)
	static void deleteuser1()
	{
		try
		{
			Coding.loginAdmin();
			Thread.sleep(1000);
			log.info("Entering Users Page");
			getbrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(1000);
			log.info("Selecting The User");
			getbrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[1]")).click(); 
			Thread.sleep(1500);
			log.info("Deleting The User");
			getbrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_deleteBtn\']")).click();	
			Thread.sleep(1500);
			Alert check=getbrowser.switchTo().alert();	check.accept();	
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=15 )
	static void exit()
	{
		try
		{
			Coding.logout();
			Thread.sleep(1000);
			Coding.closeBrowser();
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
	}

}
