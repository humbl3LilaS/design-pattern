package com.edelweiss.pattern.abstractFactory.buttons;

public class WinButton implements Button
{
	@Override
	public void paint()
	{
		System.out.println("Window Button Created");
	}
}
