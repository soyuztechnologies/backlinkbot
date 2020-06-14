package anubhavtrainings.apk.Backlinkbot;

import java.io.IOException;
import java.lang.reflect.Proxy;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class IPChanger {
	static void proxy() throws IOException
	  {
		Proxy socksProxy 
		  = new Proxy(Proxy.Type.SOCKS, new InetSocketAddress("127.0.0.1", 1080));
		HttpURLConnection socksConnection 
		  = (HttpURLConnection) weburl.openConnection(socksProxy);
	}

}	
