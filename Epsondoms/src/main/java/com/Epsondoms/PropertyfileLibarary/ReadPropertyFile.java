package com.Epsondoms.PropertyfileLibarary;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import net.bytebuddy.asm.Advice.OffsetMapping.ForOrigin.Renderer.ForReturnTypeName;

public class ReadPropertyFile {
	public static FileInputStream fis=null;
	public static FileOutputStream fos=null;
	public static Properties property=null;
	public static String readData(String key)
	{
	//1. convert the physical file in java readable file
				try {
				fis= new FileInputStream("./src/test/resources/TestData/commondata.properties");
				
				}
				catch(FileNotFoundException e) {
					e.printStackTrace();
				
				}
				
				//2 Create an object for properties class
				
				 property=new Properties();
				
				//3 load all the keys/data
				try {
					property.load(fis);
				}catch(IOException e) {
					e.printStackTrace();
				}
				//4 Fetch the data 
				
				String data =property.getProperty(key);
				return data;
				
	}
	
	
	
	public static void writedata(String Key, String value)
	{
		//1. convert the physical file in java readable file
		try {
		FileInputStream fis= new FileInputStream("./src/test/resources/TestData/commondata.properties");
		
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		
		}
		
		//2 Create an object for properties class
		
		 property=new Properties();
		
		//3 load all the keys/data
		try {
			property.load(fis);
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		//4 Write the data
		property.put(Key, value);
		
		//5 Convert java readable into Physical File
		
	
		try {
			fos=new FileOutputStream("./src/test/resources/TestData/commondata.properties");
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		
		//6.store the data
				try {
					property.store(fos, "Latest key updated sucessfully");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				
	}}
}
