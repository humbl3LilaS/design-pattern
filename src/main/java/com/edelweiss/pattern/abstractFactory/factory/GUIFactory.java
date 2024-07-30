package com.edelweiss.pattern.abstractFactory.factory;

import com.edelweiss.pattern.abstractFactory.buttons.Button;
import com.edelweiss.pattern.abstractFactory.checkbox.Checkbox;

public interface GUIFactory
{
	Button createButton();
	Checkbox createCheckbox();
}
