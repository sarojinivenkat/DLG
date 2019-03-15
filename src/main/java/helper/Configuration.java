package helper;

import util.PropertyReader;

public class Configuration {

		

		public static String getBrowserName(){

			return PropertyReader.getProperty("browser");

		}

		

		public static String getURL(){

			return PropertyReader.getProperty("url");

		}

		

		
		

		
	

}
