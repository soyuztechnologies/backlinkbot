package anubhavtrainings.apk.Backlinkbot;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class readfile {
	public static ArrayList<String> getAllSites() throws IOException{
		BufferedReader br = new BufferedReader(new FileReader("C:\\\\Users\\\\sc\\\\automationtool\\\\site.txt"));
		  try {
		      StringBuilder sb = new StringBuilder();
		      String line = br.readLine();
		      ArrayList<String> websites = new ArrayList<String>();
		      while (line != null) {
		      websites.add(line);
		      line = br.readLine();
		      }
		      return websites;
		     
		  } finally {
		      br.close();
		  }
		}
}
