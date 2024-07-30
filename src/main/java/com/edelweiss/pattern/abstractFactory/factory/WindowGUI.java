package com.edelweiss.pattern.abstractFactory.factory;

import com.edelweiss.pattern.abstractFactory.buttons.Button;
import com.edelweiss.pattern.abstractFactory.buttons.WinButton;
import com.edelweiss.pattern.abstractFactory.checkbox.Checkbox;
import com.edelweiss.pattern.abstractFactory.checkbox.WinCheckbox;

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
