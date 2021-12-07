package com.technoelevate.javalogger;

import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FileHandlerTest {

	public static void main(String[] args) {
		try {
			System.out.println("abc");
			Logger logger = Logger.getLogger(FileHandlerTest.class.getName());

			FileHandler fileHandler = new FileHandler("C:\\Users\\Pavan Kumar\\Desktop\\logs\\myLogs.log");
			fileHandler.setLevel(Level.ALL);
			fileHandler.setFilter(new MyFilter());

			fileHandler.setFormatter(new MyFormat());
			
			logger.addHandler(fileHandler);
			logger.setLevel(Level.ALL);
			logger.severe("severe msg");
			logger.warning("Warning msg");
			logger.info("Info msg");
			logger.config("config msg");
			logger.fine("fine msg");
			logger.finer("finer msg");
			logger.finest("finest msg");
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
}
