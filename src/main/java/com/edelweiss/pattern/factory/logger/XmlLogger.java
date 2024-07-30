package com.edelweiss.pattern.factory.logger;

public class XmlLogger implements Logger
{
	@Override
	public void log(String input)
	{
		System.out.println("Running XML logger: " + input);
	}
}
