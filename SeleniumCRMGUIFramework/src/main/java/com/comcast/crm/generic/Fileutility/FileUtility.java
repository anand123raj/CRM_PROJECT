package com.comcast.crm.generic.Fileutility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FileUtility {
	
	public String getDataFromPropertiesFile(String key) throws IOException {
		FileInputStream fis=new FileInputStream("./configData/CommonData.properties");
		Properties prop=new Properties();
		prop.load(fis);
		String value = prop.getProperty(key);
		
		return value;
		
	}

}
