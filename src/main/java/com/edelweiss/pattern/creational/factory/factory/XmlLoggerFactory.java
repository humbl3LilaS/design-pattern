package com.edelweiss.pattern.creational.factory.factory;

import com.edelweiss.pattern.creational.factory.logger.Logger;
import com.edelweiss.pattern.creational.factory.logger.XmlLogger;

public class XmlLoggerFactory extends LoggerFactory
{
	@Override
	public Logger getLogger()
	{
		return new XmlLogger();
	}
}
