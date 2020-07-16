package com.Bitrix24.Utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {
    private static Properties properties= new Properties();

   static{

   try{
       String path= "Configuration.properties";
       FileInputStream file= new FileInputStream(path);
       properties.load(file);
       file.close();

    } catch(IOException e){
        System.out.println("Properties file not found");

    }
}
    public static String getProperty(String keyword){
      return   properties.getProperty(keyword);

    }
}
