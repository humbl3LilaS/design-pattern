package com.edelweiss.pattern.abstractFactory.checkbox;

public class MacCheckbox implements Checkbox
{
	@Override
	public void paint()
	{
		System.out.println("MacOS checkbox created");
	}
}
