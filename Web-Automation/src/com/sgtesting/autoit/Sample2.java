package com.sgtesting.autoit;

public class Sample2 {

	public static void main(String[] args) {

		executeAutoITScript();
	}

	static void executeAutoITScript()
	{
		try
		{
			Runtime.getRuntime().exec("D:\\sai\\COURSES\\Java Course\\AutoIT\\Sample2.exe");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}

