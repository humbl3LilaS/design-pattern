package com.edelweiss.pattern.creational.abstractFactory.factory;

import com.edelweiss.pattern.creational.abstractFactory.buttons.Button;
import com.edelweiss.pattern.creational.abstractFactory.buttons.MacButton;
import com.edelweiss.pattern.creational.abstractFactory.checkbox.Checkbox;
import com.edelweiss.pattern.creational.abstractFactory.checkbox.MacCheckbox;

public class MacGUI implements GUIFactory
{
	@Override
	public Button createButton()
	{
		return new MacButton();
	}

	@Override
	public Checkbox createCheckbox()
	{
		return new MacCheckbox();
	}
}
