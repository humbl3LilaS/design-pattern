package com.edelweiss.pattern.abstractFactory.checkbox;

public class WinCheckbox implements Checkbox
{
	@Override
	public void paint()
	{
		System.out.println("Window checkbox created");
	}
}
