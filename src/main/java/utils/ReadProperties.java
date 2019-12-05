package utils;

import java.util.*;
import java.io.*;
public class ReadProperties {
public static String URL;
public static String Browser;
        public static void readProperties()throws Exception{
            FileReader reader=new FileReader("env/default.properties");

            Properties p=new Properties();
            p.load(reader);
            Browser=p.getProperty("Browser");
           URL = p.getProperty("URL");
        }

}
