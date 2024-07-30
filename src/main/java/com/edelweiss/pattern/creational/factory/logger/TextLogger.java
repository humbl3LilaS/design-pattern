package com.edelweiss.pattern.creational.factory.logger;

public class TextLogger implements Logger
{
	@Override
	public void log(String input)
	{
		System.out.println("Running text logger: " + input);
	}
}
