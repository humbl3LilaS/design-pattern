package com.edelweiss.pattern.abstractFactory;

import com.edelweiss.pattern.abstractFactory.buttons.Button;
import com.edelweiss.pattern.abstractFactory.checkbox.Checkbox;
import com.edelweiss.pattern.abstractFactory.factory.GUIFactory;
import com.edelweiss.pattern.abstractFactory.factory.MacGUI;

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
