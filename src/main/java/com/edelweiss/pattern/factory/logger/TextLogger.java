package com.edelweiss.pattern.factory.logger;

public class TextLogger implements Logger
{
	@Override
	public void log(String input)
	{
		System.out.println("Running text logger: " + input);
	}
}
