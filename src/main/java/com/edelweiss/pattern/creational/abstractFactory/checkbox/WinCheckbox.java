package com.edelweiss.pattern.creational.abstractFactory.checkbox;

public class WinCheckbox implements Checkbox
{
	@Override
	public void paint()
	{
		System.out.println("Window checkbox created");
	}
}
