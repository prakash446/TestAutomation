package com.sgtesting.testscriptsassignments;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Create3Users {
	public static WebDriver Browser=null;

	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		minimizeFlyer();
		createUser1();
		createUser2();
		createUser3();
		logout();
		loginUser1();
		logout();
		loginUser2();
		logout();
		loginUser3();
		logout();
		login();
		minimizeFlyer();
		deleteuser1();
		deleteuser2();
		deleteuser3();
		logout();
		closeApplication();

	}
	static void launchBrowser()
	{
		String path=null;
		try
		{
			path=System.getProperty("user.dir");
			System.setProperty("webdriver.chrome.driver", path+"\\Library\\drivers\\chromedriver.exe");
			Browser=new ChromeDriver();
			Browser.manage().window().maximize();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void navigate()
	{
		try
		{
			Browser.get("http://localhost:81/login.do");
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void login()
	{
		try
		{
			Browser.findElement(By.id("username")).sendKeys("admin");
			Thread.sleep(1000);
			Browser.findElement(By.name("pwd")).sendKeys("manager");
			Thread.sleep(1000);
			Browser.findElement(By.xpath("//*[@id=\"loginButton\"]/div")).click();
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void loginUser1()
	{
		try
		{
			Browser.findElement(By.id("username")).sendKeys("user1");
			Thread.sleep(1000);
			Browser.findElement(By.name("pwd")).sendKeys("1234");
			Thread.sleep(1000);
			Browser.findElement(By.xpath("//*[@id=\"loginButton\"]/div")).click();
			Thread.sleep(1000);
			Browser.findElement(By.xpath("//*[@id=\"welcomeScreenBoxId\"]/div[3]/div/span[1]")).click();
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void loginUser2()
	{
		try
		{
			Browser.findElement(By.id("username")).sendKeys("user2");
			Thread.sleep(1000);
			Browser.findElement(By.name("pwd")).sendKeys("1234");
			Thread.sleep(1000);
			Browser.findElement(By.xpath("//*[@id=\"loginButton\"]/div")).click();
			Thread.sleep(1000);
			Browser.findElement(By.xpath("//*[@id=\"welcomeScreenBoxId\"]/div[3]/div/span[1]")).click();
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void loginUser3()
	{
		try
		{
			Browser.findElement(By.id("username")).sendKeys("user3");
			Thread.sleep(1000);
			Browser.findElement(By.name("pwd")).sendKeys("1234");
			Thread.sleep(1000);
			Browser.findElement(By.xpath("//*[@id=\"loginButton\"]/div")).click();
			Thread.sleep(1000);
			Browser.findElement(By.xpath("//*[@id=\"welcomeScreenBoxId\"]/div[3]/div/span[1]")).click();
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void minimizeFlyer()
	{
		try
		{
			Browser.findElement(By.xpath("//*[@id=\"gettingStartedShortcutsMenuCloseId\"]")).click();
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void logout()
	{
		try
		{
			Browser.findElement(By.id("logoutLink")).click();
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	
	
	static void closeApplication()
	{
		try
		{
			Browser.close();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void createUser1()
	{
		try
		{
			Browser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a/div[1]")).click();
			Thread.sleep(1000);
			Browser.findElement(By.xpath("//*[@id=\"createUserDiv\"]/div/div[2]")).click();
			Thread.sleep(1000);
			Browser.findElement(By.id("userDataLightBox_firstNameField")).sendKeys("FN1");
			Thread.sleep(1000);
			Browser.findElement(By.id("userDataLightBox_lastNameField")).sendKeys("LN1");
			Thread.sleep(1000);
			Browser.findElement(By.id("userDataLightBox_emailField")).sendKeys("first@gmail.com");
			Thread.sleep(1000);
			Browser.findElement(By.id("userDataLightBox_usernameField")).sendKeys("user1");
			Thread.sleep(1000);
			Browser.findElement(By.id("userDataLightBox_passwordField")).sendKeys("1234");
			Thread.sleep(1000);
			Browser.findElement(By.id("userDataLightBox_passwordCopyField")).sendKeys("1234");
			Thread.sleep(1000);
			Browser.findElement(By.xpath("//*[@id=\"userDataLightBox_commitBtn\"]/div/span")).click();
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void createUser2()
	{
		try
		{
			Browser.findElement(By.xpath("//*[@id=\"createUserDiv\"]/div/div[2]")).click();
			Thread.sleep(1000);
			Browser.findElement(By.id("userDataLightBox_firstNameField")).sendKeys("FN2");
			Thread.sleep(1000);
			Browser.findElement(By.id("userDataLightBox_lastNameField")).sendKeys("LN2");
			Thread.sleep(1000);
			Browser.findElement(By.id("userDataLightBox_emailField")).sendKeys("second@gmail.com");
			Thread.sleep(1000);
			Browser.findElement(By.id("userDataLightBox_usernameField")).sendKeys("user2");
			Thread.sleep(1000);
			Browser.findElement(By.id("userDataLightBox_passwordField")).sendKeys("1234");
			Thread.sleep(1000);
			Browser.findElement(By.id("userDataLightBox_passwordCopyField")).sendKeys("1234");
			Thread.sleep(1000);
			Browser.findElement(By.xpath("//*[@id=\"userDataLightBox_commitBtn\"]/div/span")).click();
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void createUser3()
	{
		try
		{
			Browser.findElement(By.xpath("//*[@id=\"createUserDiv\"]/div/div[2]")).click();
			Thread.sleep(1000);
			Browser.findElement(By.id("userDataLightBox_firstNameField")).sendKeys("FN3");
			Thread.sleep(1000);
			Browser.findElement(By.id("userDataLightBox_lastNameField")).sendKeys("LN3");
			Thread.sleep(1000);
			Browser.findElement(By.id("userDataLightBox_emailField")).sendKeys("third@gmail.com");
			Thread.sleep(1000);
			Browser.findElement(By.id("userDataLightBox_usernameField")).sendKeys("user3");
			Thread.sleep(1000);
			Browser.findElement(By.id("userDataLightBox_passwordField")).sendKeys("1234");
			Thread.sleep(1000);
			Browser.findElement(By.id("userDataLightBox_passwordCopyField")).sendKeys("1234");
			Thread.sleep(1000);
			Browser.findElement(By.xpath("//*[@id=\"userDataLightBox_commitBtn\"]/div/span")).click();
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void deleteuser1()
	{
		try
		{
			Browser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a/div[1]")).click();
			Thread.sleep(1000);
			Browser.findElement(By.xpath("//*[@id=\"userListTableContainer\"]/table/tbody/tr[1]/td[1]/div/table/tbody/tr/td/div[1]/span[2]")).click();
			Thread.sleep(1000);
			Browser.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Thread.sleep(1000);
			Alert oAlert=Browser.switchTo().alert();
			oAlert.accept();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void deleteuser2()
	{
		try
		{
			Browser.findElement(By.xpath("//*[@id=\"userListTableContainer\"]/table/tbody/tr[1]/td[1]/div/table/tbody/tr/td/div[1]/span[2]")).click();
			Thread.sleep(1000);
			Browser.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Thread.sleep(1000);
			Alert oAlert=Browser.switchTo().alert();
			oAlert.accept();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void deleteuser3()
	{
		try
		{
			Browser.findElement(By.xpath("//*[@id=\"userListTableContainer\"]/table/tbody/tr[1]/td[1]/div/table/tbody/tr/td/div[1]/span[2]")).click();
			Thread.sleep(1000);
			Browser.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Thread.sleep(1000);
			Alert oAlert=Browser.switchTo().alert();
			oAlert.accept();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
		
}
