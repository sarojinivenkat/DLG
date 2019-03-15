package util;

import java.io.File;

	import java.io.FileInputStream;

	import java.io.FileNotFoundException;

	import java.io.IOException;

	import java.io.InputStream;

	import java.util.Properties;




	public class PropertyReader {

		public static String getProperty(String key) {




			File file = new File("src/main/resources/config.properties");




			InputStream is = null;

			try {

				is = new FileInputStream(file);

			} catch (FileNotFoundException e) {

				e.printStackTrace();

			}

			Properties prop = new Properties();

			try {

				prop.load(is);

			} catch (IOException e) {

				e.printStackTrace();

			}

			return prop.getProperty(key);

		}

		

		public static String getProperty(String propertyFilePath, String key) {




			File file = new File(propertyFilePath);




			InputStream is = null;

			try {

				is = new FileInputStream(file);

			} catch (FileNotFoundException e) {

				e.printStackTrace();

			}

			Properties prop = new Properties();

			try {

				prop.load(is);

			} catch (IOException e) {

				e.printStackTrace();

			}

			return prop.getProperty(key);

		}




	}


