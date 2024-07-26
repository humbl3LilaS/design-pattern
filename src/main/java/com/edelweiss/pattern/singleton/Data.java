package com.edelweiss.pattern.singleton;


// Bill Pugh Singleton design
public class Data
{
	private String stringData;
	private int intData;

	private Data()
	{
	}

	public String getStringData()
	{
		return stringData;
	}

	public void setStringData(String stringData)
	{
		this.stringData = stringData;
	}

	public int getIntData()
	{
		return intData;
	}

	public void setIntData(int intData)
	{
		this.intData = intData;
	}

	private static class SingletonHelper
	{
		private static Data INSTANCE = new Data();
	}

	public static Data getInstance()
	{
		return SingletonHelper.INSTANCE;
	}

}
