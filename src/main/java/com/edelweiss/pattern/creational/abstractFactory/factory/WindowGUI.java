package com.edelweiss.pattern.creational.abstractFactory.factory;

import com.edelweiss.pattern.creational.abstractFactory.buttons.Button;
import com.edelweiss.pattern.creational.abstractFactory.buttons.WinButton;
import com.edelweiss.pattern.creational.abstractFactory.checkbox.Checkbox;
import com.edelweiss.pattern.creational.abstractFactory.checkbox.WinCheckbox;

public class WindowGUI implements GUIFactory
{
	@Override
	public Button createButton()
	{
		return new WinButton();
	}

	@Override
	public Checkbox createCheckbox()
	{
		return new WinCheckbox();
	}
}
