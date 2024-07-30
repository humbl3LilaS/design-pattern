package com.edelweiss.pattern.creational.abstractFactory.factory;

import com.edelweiss.pattern.creational.abstractFactory.buttons.Button;
import com.edelweiss.pattern.creational.abstractFactory.checkbox.Checkbox;

public interface GUIFactory
{
	Button createButton();
	Checkbox createCheckbox();
}
