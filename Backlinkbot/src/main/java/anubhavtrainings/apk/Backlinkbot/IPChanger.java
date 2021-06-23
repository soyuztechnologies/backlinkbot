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
	
}
