package anubhavtrainings.apk.Backlinkbot;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class IPChanger {
	private static final java.net.Proxy socksProxy = null;
	public static String currentDirectory=System.getProperty("user.dir");
	static void proxy() throws IOException
	  {
		String str1="192.168.0.201";
		String str2="255.255.255.0";
		String[] command1 = { "netsh", "interface", "ip", "set", "address",
		"name=", "Local Area Connection" ,"source=static", "addr=",str1,
		"mask=", str2};
		Process pp = java.lang.Runtime.getRuntime().exec(command1);
		 System.out.println(pp);
		 WebDriver driver = BrowserFactory.getBrowserInstance(currentDirectory ,"chrome");
			JavascriptExecutor js = (JavascriptExecutor) driver;
			driver.get("https://whatismyipaddress.com/");
	}

}	
