package com.org.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyReader {

	String path = getFilePath();

	public String getFilePath() {
		File f = new File("");
		String absFilePath = f.getAbsolutePath();
		String filePath = absFilePath.replace("\\\\+", "/");
		return filePath;
	}

	public String readTedtData(String key) {
		String value = "";
		try {
			Properties p = new Properties();
			File f = new File(path + "//TestData//TestData.properties");
			if (f.exists()) {
				p.load(new FileInputStream(f));
				value = p.getProperty(key);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return value;
	}

}
