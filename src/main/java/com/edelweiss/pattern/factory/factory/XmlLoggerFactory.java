package com.edelweiss.pattern.factory.factory;

import com.edelweiss.pattern.factory.logger.Logger;
import com.edelweiss.pattern.factory.logger.XmlLogger;

public class XmlLoggerFactory extends LoggerFactory
{
	@Override
	public Logger getLogger()
	{
		return new XmlLogger();
	}
}
