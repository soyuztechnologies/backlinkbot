package anubhavtrainings.apk.Backlinkbot;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class IPChanger {
	public static String currentDirectory=System.getProperty("user.dir");
	static void googlerun() throws IOException
	  {
		WebDriver driver = BrowserFactory.getBrowserInstance(currentDirectory ,"chrome");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		try {
			ArrayList<String> readfiledomain = readfile.getAlldomain();
		      ThreadLocalRandom random11 = ThreadLocalRandom.current();
		      int rand11 = random11.nextInt(0, readfiledomain.size()-1);
              
			for (int i = 0; i <= readfiledomain.size()-1; i++) {
				   
				      System.out.println(rand11);
				      System.out.println(readfiledomain.get(rand11));
				      ArrayList<String> readkey = readfile.getkey();
				      ThreadLocalRandom randkeyindex = ThreadLocalRandom.current();
				      int randk = randkeyindex.nextInt(0, readkey.size()-1);
				      System.out.println(randk);
				      System.out.println(readkey.get(randk));
				      driver.get("http://www." + readfiledomain.get(rand11));
					  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
					  WebElement elet1, elt31;
					  elet1= driver.findElement(By.xpath("//input[contains(@aria-label,'Search')]"));
					  ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();",    elet1);
					  elet1.clear();
					  elet1.sendKeys(readkey.get(randk));
					  elt31= driver.findElement(By.xpath("//input[contains(@aria-label,'Google Search')]"));
					  ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();",    elt31);
					  elt31.click();
					  List<WebElement> links = driver.findElements(By.xpath("//div[contains(text(),'Anubhav Oberoy')]"));
					  int linkCount = links.size();
					  System.out.println("Total Number of link count on webpage = "  + linkCount);
					  TimeUnit.SECONDS.sleep(5);
					  if(linkCount>0){  
						  try {
							  WebElement elm;
					    	  elm= driver.findElement(By.xpath("//span[contains(text(),'ABAP on HANA Training - Anubhav Trainings')]"));
					    	  js.executeScript("arguments[0].click();",elm);
					    	  js.executeScript("window.scrollBy(0,1000)");
					    	  driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
					    	  } catch (Exception e) {
					    		  System.out.println("An error occurred.");
					    		  } 
						  } 
			}
			     
		        // This  will scroll down the page by  1000 pixel vertical		
		        js.executeScript("window.scrollBy(0,1000)");
		 } catch(Exception e) {
			  System.out.println("site1");
		  }
		
	  }
	
	
}
