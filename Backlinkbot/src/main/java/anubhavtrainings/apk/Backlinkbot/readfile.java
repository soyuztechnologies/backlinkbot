package anubhavtrainings.apk.Backlinkbot;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class readfile {
	public static ArrayList<String> getAllSites() throws IOException{
		String currentDirectory=System.getProperty("user.dir");
		BufferedReader br = new BufferedReader(new FileReader(currentDirectory + "\\files\\site.txt"));
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
	public static ArrayList<String> readMail() throws IOException{
		String currentDirectory=System.getProperty("user.dir");
		BufferedReader br = new BufferedReader(new FileReader(currentDirectory + "\\files\\email.txt"));
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
	public static ArrayList<String> readplaylist() throws IOException{
		String currentDirectory=System.getProperty("user.dir");
		BufferedReader br = new BufferedReader(new FileReader(currentDirectory + "\\files\\site_learning_series.txt"));
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
	public static ArrayList<String> readsiteurl() throws IOException{
		String currentDirectory=System.getProperty("user.dir");
		BufferedReader br = new BufferedReader(new FileReader(currentDirectory + "\\files\\siteurl.txt"));
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
