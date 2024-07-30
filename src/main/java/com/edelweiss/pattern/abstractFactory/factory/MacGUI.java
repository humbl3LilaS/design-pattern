package com.edelweiss.pattern.abstractFactory.factory;

import com.edelweiss.pattern.abstractFactory.buttons.Button;
import com.edelweiss.pattern.abstractFactory.buttons.MacButton;
import com.edelweiss.pattern.abstractFactory.checkbox.Checkbox;
import com.edelweiss.pattern.abstractFactory.checkbox.MacCheckbox;

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
