package com.edelweiss.pattern.creational.singleton.serializable;

import java.io.Serial;
import java.io.Serializable;

// Serializable approach of Bill Pugh implementation of singleton pattern
public class Singleton implements Serializable
{
	@Serial
	private static final long serialVersionUID = -2342343423445645234L;

	private String data;

	private Singleton()
	{
	}

	private static final class SingletonHelper
	{
		private static final Singleton INSTANCE = new Singleton();
	}

	public static Singleton getInstance()
	{
		return SingletonHelper.INSTANCE;
	}
}
