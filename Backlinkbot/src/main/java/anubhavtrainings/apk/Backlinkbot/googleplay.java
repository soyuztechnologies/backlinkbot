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
		static void googleabap() throws IOException
		  {
			
			try {

				   for(int x = 1; x < 4; x = x + 1) {
						ArrayList<String> readaohfile = readfile.readaohkey();
				         ThreadLocalRandom randomaoh = ThreadLocalRandom.current();
				         int aoh = randomaoh.nextInt(0, readaohfile.size()-1); 
					     System.out.print("value of x : " + x );
				         System.out.print("\n");
				         
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
							 for(int y1 = 1; y1 < 3; y1 = y1 + 1){
						    		System.out.println("125");
						    		System.out.print("value of y : " + y1 );
									 elem= driver.findElement(By.xpath("//h3[contains(text(),'ABAP on HANA cum S/4HANA with CDS Views and AMDP')]"));
									 elem.click();
									 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
									 //js.executeScript("window.scrollBy(0,100)");
									 driver.quit();
									 break;
									 
						    	}

							 //elem= driver.findElement(By.xpath("//h3[contains(text(),'ABAP on HANA cum S/4HANA with CDS Views and AMDP')]"));
							 //((org.openqa.selenium.WebElement) allInputElements).click();
							 }
						 one : { 
							 for(int j = 0; j < 5; j++) {
								 System.out.print("value of j : " + j );
								  
								  if(allInputElements.size() == 0){
									  for (int i = 0; i < 3; i++) {
										  System.out.println("hello");
										  System.out.print("value of i : " + i );
										  js.executeScript("window.scrollBy(0,100)");
										  List<WebElement> allInputElements1 = driver.findElements(By.xpath("//h3[contains(text(),'ABAP on HANA cum S/4HANA with CDS Views and AMDP')]"));
										  System.out.println(allInputElements1.size());
										  if(allInputElements1.size() == 0){
											  System.out.println("hello1");
											  System.out.println(allInputElements1.size());
											  nxtbtn= driver.findElement(By.xpath("//span[text()='Next']"));
											  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
											  nxtbtn.click();
											  //js.executeScript("window.scrollBy(0,100)");
											  //driver.quit();
											  break;
											  
											

										  }
										 
										  else {
											  elem= driver.findElement(By.xpath("//h3[contains(text(),'ABAP on HANA cum S/4HANA with CDS Views and AMDP')]"));
											  elem.click();
											  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
											  //js.executeScript("window.scrollBy(0,100)");
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
		static void googlerunui5() throws IOException
		  {
			
			
			try {

				   for(int x = 1; x < 4; x = x + 1) {
						ArrayList<String> readui5file = readfile.readui5key();
				         ThreadLocalRandom randomui5 = ThreadLocalRandom.current();
				         int ui5 = randomui5.nextInt(0, readui5file.size()-1); 
					     System.out.print("value of x : " + x );
				         System.out.print("\n");
				         
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
						 ele31.sendKeys(readui5file.get(ui5));
						 WebDriverWait w = new WebDriverWait(driver, 5);
						 w.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//ul")));
						 ele31.submit();
						 js.executeScript("window.scrollBy(0,100)");
						 List<WebElement> allInputElements = driver.findElements(By.xpath("//h3[contains(text(),'Ui5 & Fiori training with O-Data on Business Application studio')]"));
				         int y = 1;
						 if ( allInputElements.size() != 0) {
							 //System.out.println("121");
							 for(int y1 = 1; y1 < 3; y1 = y1 + 1){
						    		System.out.println("125");
						    		System.out.print("value of y : " + y1 );
									 elem= driver.findElement(By.xpath("//h3[contains(text(),'Ui5 & Fiori training with O-Data on Business Application studio')]"));
									 elem.click();
									 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
									 //js.executeScript("window.scrollBy(0,100)");
									 driver.quit();
									 break;
									 
						    	}

							 //elem= driver.findElement(By.xpath("//h3[contains(text(),'ABAP on HANA cum S/4HANA with CDS Views and AMDP')]"));
							 //((org.openqa.selenium.WebElement) allInputElements).click();
							 }
						 one : { 
							 for(int j = 0; j < 5; j++) {
								 System.out.print("value of j : " + j );
								  
								  if(allInputElements.size() == 0){
									  for (int i = 0; i < 3; i++) {
										  System.out.println("hello");
										  System.out.print("value of i : " + i );
										  js.executeScript("window.scrollBy(0,100)");
										  List<WebElement> allInputElements1 = driver.findElements(By.xpath("//h3[contains(text(),'Ui5 & Fiori training with O-Data on Business Application studio')]"));
										  System.out.println(allInputElements1.size());
										  if(allInputElements1.size() == 0){
											  System.out.println("hello1");
											  System.out.println(allInputElements1.size());
											  nxtbtn= driver.findElement(By.xpath("//span[text()='Next']"));
											  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
											  nxtbtn.click();
											  //js.executeScript("window.scrollBy(0,100)");
											  //driver.quit();
											  break;
											  
											

										  }
										 
										  else {
											  elem= driver.findElement(By.xpath("//h3[contains(text(),'Ui5 & Fiori training with O-Data on Business Application studio')]"));
											  elem.click();
											  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
											  //js.executeScript("window.scrollBy(0,100)");
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
		
		static void googlerunbtp() throws IOException
		  {
			
			
			try {

				   for(int x = 1; x < 4; x = x + 1) {
						ArrayList<String> readbtpfile = readfile.readbtpkey();
				         ThreadLocalRandom randombtp = ThreadLocalRandom.current();
				         int btp = randombtp.nextInt(0, readbtpfile.size()-1); 
					     System.out.print("value of x : " + x );
				         System.out.print("\n");
				         
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
						 ele31.sendKeys(readbtpfile.get(btp));
						 WebDriverWait w = new WebDriverWait(driver, 5);
						 w.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//ul")));
						 ele31.submit();
						 js.executeScript("window.scrollBy(0,100)");
						 List<WebElement> allInputElements = driver.findElements(By.xpath("//h3[contains(text(),'SAP Business Technology Platform Training | SAP CAPM')]"));
				         int y = 1;
						 if ( allInputElements.size() != 0) {
							 //System.out.println("121");
							 for(int y1 = 1; y1 < 3; y1 = y1 + 1){
						    		System.out.println("125");
						    		System.out.print("value of y : " + y1 );
									 elem= driver.findElement(By.xpath("//h3[contains(text(),'SAP Business Technology Platform Training | SAP CAPM')]"));
									 elem.click();
									 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
									 //js.executeScript("window.scrollBy(0,100)");
									 driver.quit();
									 break;
									 
						    	}

							 //elem= driver.findElement(By.xpath("//h3[contains(text(),'ABAP on HANA cum S/4HANA with CDS Views and AMDP')]"));
							 //((org.openqa.selenium.WebElement) allInputElements).click();
							 }
						 one : { 
							 for(int j = 0; j < 5; j++) {
								 System.out.print("value of j : " + j );
								  
								  if(allInputElements.size() == 0){
									  for (int i = 0; i < 3; i++) {
										  System.out.println("hello");
										  System.out.print("value of i : " + i );
										  js.executeScript("window.scrollBy(0,100)");
										  List<WebElement> allInputElements1 = driver.findElements(By.xpath("//h3[contains(text(),'SAP Business Technology Platform Training | SAP CAPM')]"));
										  System.out.println(allInputElements1.size());
										  if(allInputElements1.size() == 0){
											  System.out.println("hello1");
											  System.out.println(allInputElements1.size());
											  nxtbtn= driver.findElement(By.xpath("//span[text()='Next']"));
											  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
											  nxtbtn.click();
											  //js.executeScript("window.scrollBy(0,100)");
											  //driver.quit();
											  break;
											  
											

										  }
										 
										  else {
											  elem= driver.findElement(By.xpath("//h3[contains(text(),'SAP Business Technology Platform Training | SAP CAPM')]"));
											  elem.click();
											  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
											  //js.executeScript("window.scrollBy(0,100)");
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
		
		static void googlerunsac() throws IOException
		  {
			
			
			try {

				   for(int x = 1; x < 4; x = x + 1) {
						ArrayList<String> readsacfile = readfile.readsackey();
				         ThreadLocalRandom randomsac = ThreadLocalRandom.current();
				         int sac = randomsac.nextInt(0, readsacfile.size()-1); 
					     System.out.print("value of x : " + x );
				         System.out.print("\n");
				         
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
						 ele31.sendKeys(readsacfile.get(sac));
						 WebDriverWait w = new WebDriverWait(driver, 5);
						 w.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//ul")));
						 ele31.submit();
						 js.executeScript("window.scrollBy(0,100)");
						 List<WebElement> allInputElements = driver.findElements(By.xpath(" //h3[contains(text(),'SAP Analytics Cloud Training | BI, Planning, Predict and Design')]"));
				         int y = 1;
						 if ( allInputElements.size() != 0) {
							 //System.out.println("121");
							 for(int y1 = 1; y1 < 3; y1 = y1 + 1){
						    		System.out.println("125");
						    		System.out.print("value of y : " + y1 );
									 elem= driver.findElement(By.xpath(" //h3[contains(text(),'SAP Analytics Cloud Training | BI, Planning, Predict and Design')]"));
									 elem.click();
									 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
									 //js.executeScript("window.scrollBy(0,100)");
									 driver.quit();
									 break;
									 
						    	}

							 //elem= driver.findElement(By.xpath("//h3[contains(text(),'ABAP on HANA cum S/4HANA with CDS Views and AMDP')]"));
							 //((org.openqa.selenium.WebElement) allInputElements).click();
							 }
						 one : { 
							 for(int j = 0; j < 5; j++) {
								 System.out.print("value of j : " + j );
								  
								  if(allInputElements.size() == 0){
									  for (int i = 0; i < 3; i++) {
										  System.out.println("hello");
										  System.out.print("value of i : " + i );
										  js.executeScript("window.scrollBy(0,100)");
										  List<WebElement> allInputElements1 = driver.findElements(By.xpath(" //h3[contains(text(),'SAP Analytics Cloud Training | BI, Planning, Predict and Design')]"));
										  System.out.println(allInputElements1.size());
										  if(allInputElements1.size() == 0){
											  System.out.println("hello1");
											  System.out.println(allInputElements1.size());
											  nxtbtn= driver.findElement(By.xpath("//span[text()='Next']"));
											  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
											  nxtbtn.click();
											  //js.executeScript("window.scrollBy(0,100)");
											  //driver.quit();
											  break;
											  
											

										  }
										 
										  else {
											  elem= driver.findElement(By.xpath(" //h3[contains(text(),'SAP Analytics Cloud Training | BI, Planning, Predict and Design')]"));
											  elem.click();
											  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
											  //js.executeScript("window.scrollBy(0,100)");
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