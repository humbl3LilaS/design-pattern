package com.edelweiss.pattern.creational.abstractFactory;

import com.edelweiss.pattern.creational.abstractFactory.buttons.Button;
import com.edelweiss.pattern.creational.abstractFactory.checkbox.Checkbox;
import com.edelweiss.pattern.creational.abstractFactory.factory.GUIFactory;
import com.edelweiss.pattern.creational.abstractFactory.factory.MacGUI;

public class Test
{
	public static void main(String[] args)
	{
		GUIFactory GUI = new MacGUI();
		Button btn = GUI.createButton();
		Checkbox checkbox = GUI.createCheckbox();
		btn.paint();
		checkbox.paint();
	}
}
