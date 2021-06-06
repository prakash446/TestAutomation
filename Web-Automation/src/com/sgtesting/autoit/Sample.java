package com.sgtesting.autoit;

public class Sample {

	public static void main(String[] args) {

		executeAutoITScript();
	}

	static void executeAutoITScript()
	{
		try
		{
			Runtime.getRuntime().exec("D:\\sai\\COURSES\\Java Course\\AutoIT\\Sample.exe");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}

