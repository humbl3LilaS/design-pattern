package com.edelweiss.pattern.factory.factory;

import com.edelweiss.pattern.factory.logger.Logger;
import com.edelweiss.pattern.factory.logger.TextLogger;

public class TextLoggerFactory extends LoggerFactory
{
	@Override
	public Logger getLogger()
	{
		return new TextLogger();
	}
}
