package com.edelweiss.pattern.factory;

import com.edelweiss.pattern.factory.factory.LoggerFactory;
import com.edelweiss.pattern.factory.factory.TextLoggerFactory;
import com.edelweiss.pattern.factory.factory.XmlLoggerFactory;
import com.edelweiss.pattern.factory.logger.Logger;


enum Mode
{
	TEXT, XML
}

public class Test
{
	public static LoggerFactory loggerFactory;

	public static void configure(Mode mode)
	{
		if (mode == Mode.TEXT)
		{
			loggerFactory = new TextLoggerFactory();
		} else
		{
			loggerFactory = new XmlLoggerFactory();
		}
	}

	public static void main(String[] args)
	{
		configure(Mode.XML);
		Logger logger = loggerFactory.getLogger();
		logger.log("super");
	}
}
