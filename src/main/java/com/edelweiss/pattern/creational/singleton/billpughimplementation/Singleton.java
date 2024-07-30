package com.edelweiss.pattern.creational.singleton.billpughimplementation;


// Bill Pugh Singleton design
public class Singleton
{
	private String stringData;
	private int intData;

	private Singleton()
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
		private static Singleton INSTANCE = new Singleton();
	}

	public static Singleton getInstance()
	{
		return SingletonHelper.INSTANCE;
	}

}
