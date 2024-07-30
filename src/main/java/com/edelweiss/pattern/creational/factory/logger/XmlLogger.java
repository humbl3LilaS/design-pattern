package com.edelweiss.pattern.creational.factory.logger;

public class XmlLogger implements Logger
{
	@Override
	public void log(String input)
	{
		System.out.println("Running XML logger: " + input);
	}
}
