package anubhavtrainings.apk.Backlinkbot;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;

public class IPChanger {
	private static final java.net.Proxy socksProxy = null;

	static void proxy() throws IOException
	  {

		Socket proxySocket = new Socket(socksProxy);
		InetSocketAddress socketHost 
		  = new InetSocketAddress("127.0.0.1", 3128);
		proxySocket.connect(socketHost);
	}

}	
