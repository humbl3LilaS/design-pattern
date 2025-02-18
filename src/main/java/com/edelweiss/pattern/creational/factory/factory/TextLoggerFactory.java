package com.edelweiss.pattern.creational.factory.factory;

import com.edelweiss.pattern.creational.factory.logger.Logger;
import com.edelweiss.pattern.creational.factory.logger.TextLogger;

public class TextLoggerFactory extends LoggerFactory
{
	@Override
	public Logger getLogger()
	{
		return new TextLogger();
	}
}
