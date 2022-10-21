package anubhavtrainings.apk.Backlinkbot;
import java.util.ArrayList;
import java.util.List;
import java.io.IOException;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class googleplay {
	public static ArrayList<String> readaohfile;
	private static final int WebElement = 0;
	public static String currentDirectory=System.getProperty("user.dir");
		static void google() throws IOException
		  {
			
			try {
				ArrayList<String> readaohfile = readfile.readaohkey();
		         ThreadLocalRandom randomaoh = ThreadLocalRandom.current();
		         int aoh = randomaoh.nextInt(0, readaohfile.size()-1);
			     
				   for(int x = 10; x < 13; x = x + 1) {
					     //System.out.print("value of x : " + x );
				         //System.out.print("\n");
				         
				         WebDriver driver = BrowserFactory.getBrowserInstance(currentDirectory ,"chrome");
				         JavascriptExecutor js = (JavascriptExecutor) driver;
				         driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
						 driver.get("https://www.google.com/");
						 driver.manage().window().maximize();
						 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
						 // This  will scroll down the page by  1000 pixel vertical
						 js.executeScript("window.scrollBy(0,500)");
						 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
						 WebElement ele31, elem,nxtbtn;
						 ele31= driver.findElement(By.xpath("//input[contains(@aria-label,'Search')]"));
						 ele31.clear();
						 //ele31.sendKeys("abap on hana training");
						 ele31.sendKeys(readaohfile.get(aoh));
						 WebDriverWait w = new WebDriverWait(driver, 5);
						 w.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//ul")));
						 ele31.submit();
						 js.executeScript("window.scrollBy(0,100)");
						 List<WebElement> allInputElements = driver.findElements(By.xpath("//h3[contains(text(),'ABAP on HANA cum S/4HANA with CDS Views and AMDP')]"));
				         int y = 1;
						 if ( allInputElements.size() != 0) {
							 //System.out.println("121");
							 for(int y1 = 1; y1 < 4; y1 = y1 + 1){
						    		//System.out.println("125");
									 
									 elem= driver.findElement(By.xpath("//h3[contains(text(),'ABAP on HANA cum S/4HANA with CDS Views and AMDP')]"));
									 elem.click();
									 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
									 js.executeScript("window.scrollBy(0,100)");
									 driver.quit();
									 break;
									 
						    	}

							 //elem= driver.findElement(By.xpath("//h3[contains(text(),'ABAP on HANA cum S/4HANA with CDS Views and AMDP')]"));
							 //((org.openqa.selenium.WebElement) allInputElements).click();
							 }
						 one : { 
							 for(int j = 0; j < 5; j++) {
								  
								  if(allInputElements.size() == 0){
									  for (int i = 0; i < 5; i++) {
										  //System.out.println("hello");
										  js.executeScript("window.scrollBy(0,100)");
										  List<WebElement> allInputElements1 = driver.findElements(By.xpath("//h3[contains(text(),'ABAP on HANA cum S/4HANA with CDS Views and AMDP')]"));
										  System.out.println(allInputElements1.size());
										  if(allInputElements1.size() == 0){
											  //System.out.println("hello1");
											  System.out.println(allInputElements1.size());
											  nxtbtn= driver.findElement(By.xpath("//span[text()='Next']"));
											  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
											  nxtbtn.click();
											  js.executeScript("window.scrollBy(0,100)");
											  
											  break;
											

										  }
										 
										  else {
											  elem= driver.findElement(By.xpath("//h3[contains(text(),'ABAP on HANA cum S/4HANA with CDS Views and AMDP')]"));
											  elem.click();
											  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
											  js.executeScript("window.scrollBy(0,100)");
											  driver.quit();
											  break one; // break to label one
											  
										  }
										  
									  }
									  
									  
									    
									}
								  
								 
							 }
							 driver.quit();
							 // label one
							 
						 }

						 
							 

							  
							

					}
			  } catch(Exception e) {
				  System.out.println("error");			  }
			 
		  }
				
}