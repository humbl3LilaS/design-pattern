package com.edelweiss.pattern.creational.abstractFactory.buttons;

public class MacButton implements Button
{
	@Override
	public void paint()
	{
		System.out.println("MacOS button created");
	}
}
