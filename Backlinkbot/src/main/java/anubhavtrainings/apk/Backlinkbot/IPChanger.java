package anubhavtrainings.apk.Backlinkbot;

import java.io.IOException;
public class IPChanger {
	//public static String currentDirectory=System.getProperty("user.dir");
	static void closeall() throws IOException
	  {
		
		
		try {
			
			Runtime.getRuntime().exec("taskkill /F /IM chrome.exe /T");
			  } catch(Exception e) {
				  System.out.println("error");
			  }
			  
			
	  }
	static void closejava() throws IOException
	  {
		
		
		try {
			
			Runtime.getRuntime().exec("taskkill /im javaw.exe");
			  } catch(Exception e1) {
				  System.out.println("error");
			  }
			  
			
	  }
	
}
