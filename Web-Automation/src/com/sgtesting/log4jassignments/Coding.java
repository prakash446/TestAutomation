package com.sgtesting.log4jassignments;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.log4j.Logger;

class code
{
	public static Logger log=Logger.getLogger("Commonly Using Methods");
	public static WebDriver getbrowser=null;
	static void logout()
	{
		try
		{
			log.info("logging out");
			getbrowser.findElement(By.xpath("//a[@class='logout']")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void closeBrowser()
	{
		try
		{	
			log.info("Closing The Browser");
			log.info("*****************************************************************************************************");
			getbrowser.close();

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}

public class Coding extends code {

	static void launchBrowserandNavigate()
	{
		String path=null;
		try
		{
			path=System.getProperty("user.dir");
			System.setProperty("webdriver.chrome.driver",path+"\\Library\\drivers\\chromedriver.exe");
			log.info("Launching The Browser");
			getbrowser = new ChromeDriver();
			log.info("Maximizing The Window");
			getbrowser.manage().window().maximize();
			Thread.sleep(1000);
			log.info("Navigating To The URL");
			getbrowser.get("http://localhost:81/login.do");
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	static void loginAdmin()
	{
		try
		{
			log.info("Giving The Admin Login Credentials");
			getbrowser.findElement(By.xpath("//input[@type='text']")).sendKeys("admin");
			Thread.sleep(1000);
			getbrowser.findElement(By.xpath("//input[@class='textField pwdfield']")).sendKeys("manager");
			Thread.sleep(1000);
			log.info("logging In Admin");
			getbrowser.findElement(By.xpath("//div[text()='Login ']")).click();
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void minimizeFlyOutWindow()
	{
		try
		{
			log.info("Minimizing The Fly Out Window");
			getbrowser.findElement(By.xpath("//div[@id='gettingStartedShortcutsPanelId']")).click();
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	static void CreateUser()
	{
		try
		{
			log.info("Entering the Users Page");
			getbrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(2000);
			log.info("Adding a New User");
			getbrowser.findElement(By.xpath("//*[@id='createUserDiv']/div/div[2]")).click();
			Thread.sleep(2000);
			log.info("Giving The Required Details");
			getbrowser.findElement(By.name("firstName")).sendKeys("sai");
			getbrowser.findElement(By.name("lastName")).sendKeys("prakash");
			getbrowser.findElement(By.name("email")).sendKeys("user1@gmail.com");
			getbrowser.findElement(By.name("username")).sendKeys("thota");
			getbrowser.findElement(By.name("password")).sendKeys("1234");
			getbrowser.findElement(By.name("passwordCopy")).sendKeys("1234");
			log.info("Saving The User Details");
			getbrowser.findElement(By.xpath("//*[@id='userDataLightBox_commitBtn']/div/span")).click();
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	static void deleteUser()
	{
		try
		{
			log.info("Deleting The User");
			getbrowser.findElement(By.xpath("//*[@id='userListTableContainer']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
			Thread.sleep(3000);				
			getbrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Thread.sleep(2000);
			Alert obj=getbrowser.switchTo().alert();
			obj.accept();
			Thread.sleep(2000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}
	
	static void createCustomer()
	{
		try
		{
			log.info("Entering The Tasks Page");
			getbrowser.findElement(By.xpath("//td[@class='navItem navCell relative notSelected']//a[@class='content tasks']")).click();
			Thread.sleep(2000);
			log.info("Clicking On Add New");
			getbrowser.findElement(By.xpath("//div[@class='addNewContainer']//div[@class='addNewButton']//div[@class='title ellipsis']")).click();
			Thread.sleep(1000);
			log.info("Creating a New Customer");
			getbrowser.findElement(By.xpath("//div[@class='item createNewCustomer ellipsis']")).click();
			Thread.sleep(1000);
			log.info("Giving Required Details");
			getbrowser.findElement(By.xpath("//input[@id='customerLightBox_nameField']")).sendKeys("Customer1");
			log.info("Saving Details");
			getbrowser.findElement(By.xpath("//div[@id='customerLightBox_commitBtn']//div//span[@class='buttonTitle']")).click();
			Thread.sleep(2000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}
	
	static void deleteCustomer()
	{
		try
		{
			log.info("Deleting a Customer");
			getbrowser.findElement(By.xpath("//div[@class='node customerNode selected']//div[@class='editButton available']")).click();
			Thread.sleep(2000);				
			getbrowser.findElement(By.xpath("//div[@class='edit_customer_sliding_panel sliding_panel']//div[@class='img']/following-sibling::div[@class='action']")).click();
			Thread.sleep(1000);
			getbrowser.findElement(By.xpath("//div[@class='dropdownContainer actionsMenu']//div//div[@class='deleteButton'][@style='display: inline-block;']")).click();
			Thread.sleep(1000);
			getbrowser.findElement(By.xpath("//span[@id='customerPanel_deleteConfirm_submitTitle']")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}
	
	static void createProject()
	{
		try
		{	
			
			getbrowser.findElement(By.xpath("//div[@class='addNewContainer']//div[@class='addNewButton']//div[@class='title ellipsis']")).click();
			Thread.sleep(1000);
			log.info("Creating a Project");
			getbrowser.findElement(By.xpath("//div[@class='item createNewProject ellipsis']")).click();
			Thread.sleep(1000);
			log.info("Entering Details Required");
			getbrowser.findElement(By.xpath("//input[@id='projectPopup_projectNameField']")).sendKeys("Project1");
			Thread.sleep(1000);	
			log.info("Saving Project Details");
			getbrowser.findElement(By.xpath("//div[@id='projectPopup_footer']//span[@class='buttonTitle']")).click();
			Thread.sleep(1000);	

		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}
	
	static void deleteProject()
	{
		try
		{
			log.info("Deleting Project");
			getbrowser.findElement(By.xpath("//div[@class='node projectNode selected']//div[@class='editButton available']")).click();
			Thread.sleep(2000);
			getbrowser.findElement(By.xpath("//div[@class='edit_project_sliding_panel sliding_panel']//div[@class='action']")).click();
			Thread.sleep(1000);
			getbrowser.findElement(By.xpath("//div[@class='edit_project_sliding_panel sliding_panel']//div[@class='deleteButton']")).click();
			Thread.sleep(1000);
			getbrowser.findElement(By.xpath("//span[@id='projectPanel_deleteConfirm_submitTitle']")).click();
			Thread.sleep(4000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	

}

