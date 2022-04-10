package utilityfile;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Readconfig {

	Properties pro;
public Readconfig(){
	    	
	   File src = new File("C:\\Users\\Admin\\eclipse-workspace\\loginfacebook\\config.properties");
	     	try {
	        			FileInputStream fis = new FileInputStream(src);
	        			Properties pro = new Properties();
	        			pro.load(fis);
	        		} catch (Exception e) {
	        			System.out.println("Exception is " + e.getMessage());
	        		}
	        	  	
	        	}
	
	
	          public String getApplicationURL()
	      	{
	        	  String url=pro.getProperty("url");
	      		return url;
	      	}
	          
	          
}    
	          