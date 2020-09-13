package anubhavtrainings.apk.Backlinkbot;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Calendar;

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
	
	public static ArrayList<String> getName() throws IOException{
		String currentDirectory=System.getProperty("user.dir");
		BufferedReader br = new BufferedReader(new FileReader(currentDirectory + "\\files\\user.txt"));
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
	
	public static ArrayList<String> getpost() throws IOException{
		String currentDirectory=System.getProperty("user.dir");
		BufferedReader br = new BufferedReader(new FileReader(currentDirectory + "\\files\\post.txt"));
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

	    //Create a new fileTracker for backlink
	    public static String CreateFileForBacklinkTrack(String[] args ) {
	    	String currentDirectory=System.getProperty("user.dir");

	        // Get a Calendar and set it to the current time.
	        Calendar cal = Calendar.getInstance();
	        cal.setTime(Date.from(Instant.now()));

	        // Create a filename from a format string.
	        // ... Apply date formatting codes.
	        String fileformate = String.format(
	                currentDirectory + "\\LOG FILE\\Make Backlink-%1$tY-%1$tm-%1$td.txt", cal);
	        

	        // Display our result filename.
	        System.out.println("Filename:");
	        System.out.println(fileformate);
	        try {
	            File myObj = new File(fileformate);
	            if (myObj.createNewFile()) {
	              System.out.println("File created: " + myObj.getName());
	              System.out.println("Absolute path: " + myObj.getAbsolutePath());
	              
	            }
	            
	            else {
	              System.out.println("File already exists.");
	            }
	          } catch (IOException e) {
	            System.out.println("An error occurred.");
	            e.printStackTrace();
	            
	          }
			return fileformate ;
	    }

	    public static String CreateFileForYoutubeTrack(String[] args ) {
	    	String currentDirectory=System.getProperty("user.dir");

	        Calendar cal1 = Calendar.getInstance();
	        cal1.setTime(Date.from(Instant.now()));

	        String fileformateYou = String.format(
	                currentDirectory + "\\LOG FILE\\Youtube Playlist-%1$tY-%1$tm-%1$td.txt", cal1);
	       
	        // Display our result filename.
	        try {
	            File myObj1 = new File(fileformateYou);
	        } catch (Exception e) {
	            System.out.println("An error occurred.");
	            
	        }
			return fileformateYou ;
	    }
	    

	    public static String CreateFileForAnubhavSiteTrack(String[] args ) {
	    	String currentDirectory=System.getProperty("user.dir");

	        Calendar cal1 = Calendar.getInstance();
	        cal1.setTime(Date.from(Instant.now()));
	        String fileformateSite = String.format(
	                currentDirectory + "\\LOG FILE\\AnubhavSite-%1$tY-%1$tm-%1$td.txt", cal1);
	        
	        

	        // Display our result filename.
	        try {
	            File myObj1 = new File(fileformateSite);
	        } catch (Exception e) {
	            System.out.println("An error occurred.");
	            
	        }
			return fileformateSite ;
	    }
	    
	    public static String CreateFileonlywireTrack(String[] args ) {
	    	String currentDirectory=System.getProperty("user.dir");

	        Calendar cal1 = Calendar.getInstance();
	        cal1.setTime(Date.from(Instant.now()));
	        String fileformateSite = String.format(
	                currentDirectory + "\\LOG FILE\\Onlywire-%1$tY-%1$tm-%1$td.txt", cal1);
	        
	        

	        // Display our result filename.
	        try {
	            File myObj1 = new File(fileformateSite);
	        } catch (Exception e) {
	            System.out.println("An error occurred.");
	            
	        }
			return fileformateSite ;
	    }
	    
	    public static ArrayList<String> getAlldomain() throws IOException{
			String currentDirectory=System.getProperty("user.dir");
			BufferedReader br = new BufferedReader(new FileReader(currentDirectory + "\\files\\domains.txt"));
			  try {
			      StringBuilder sb = new StringBuilder();
			      String line = br.readLine();
			      ArrayList<String> domain = new ArrayList<String>();
			      while (line != null) {
			    	  domain.add(line);
			      line = br.readLine();
			      }
			      return domain;
			     
			  } finally {
			      br.close();
			  }
			}
	    
	    public static ArrayList<String> getkey() throws IOException{
			String currentDirectory=System.getProperty("user.dir");
			BufferedReader br = new BufferedReader(new FileReader(currentDirectory + "\\files\\ABAP on HANA.txt"));
			  try {
			      StringBuilder sb = new StringBuilder();
			      String line = br.readLine();
			      ArrayList<String> domain = new ArrayList<String>();
			      while (line != null) {
			    	  domain.add(line);
			      line = br.readLine();
			      }
			      return domain;
			     
			  } finally {
			      br.close();
			  }
			}
}


	  


