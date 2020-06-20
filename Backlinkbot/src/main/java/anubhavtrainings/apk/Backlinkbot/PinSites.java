package anubhavtrainings.apk.Backlinkbot;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class PinSites {
	public static String currentDirectory=System.getProperty("user.dir");
	static void mypin() throws IOException
	  {
		  String currentDirectory=System.getProperty("user.dir");
			System.out.println(currentDirectory);

			WebDriver driver = BrowserFactory.getBrowserInstance(currentDirectory ,"chrome");;
			JavascriptExecutor js = (JavascriptExecutor) driver;
			driver.manage().window().maximize();
			driver.get("https://www.scoop.it/login");
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			WebElement elet1,  elt31, elt41, elt51, elt61, elt71,  elt81, elt91 ;
			elet1= driver.findElement(By.xpath("//input[@name='email']"));
		    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();",    elet1);
		    elet1.click();
		    elet1.sendKeys("rahulevosolutions@gmail.com");
		    elt31= driver.findElement(By.xpath("//input[@name='password']"));
		    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();",    elt31);
		    elt31.click();
	        elt31.sendKeys("rahul@123");
		    elt41= driver.findElement(By.xpath("//button[@class='button button-blue']"));
		    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();",    elt31);
		    elt41.click();
		    WebDriverWait wait = new WebDriverWait(driver, 10);
		    elt51 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='urlChooserField']")));
		    elt51.click();
		    elt51= driver.findElement(By.xpath("//input[@id='urlChooserField']"));
		    elt51.sendKeys("https://www.anubhavtrainings.com/");
		    elt61 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='urlChooserButton']")));
		    elt61.click();
		    WebDriverWait wait1 = new WebDriverWait(driver, 30);
		    elt71 = wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class=\"button button-small\"]")));
		    elt71.click();
		    elt91 = wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@class='tagsEditorInput tagsEditor-input ui-autocomplete-input']")));
		    elt91.click();
		    elt71.sendKeys("#abap #anubhavtrainings #sap #onlinetraining");
		    elt81 = wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='button button-green']")));
		    elt81.click();
		    
	  }
	static void Onlywire(final String[] args) throws IOException
	  {
		WebDriver driver = BrowserFactory.getBrowserInstance(currentDirectory ,"chrome");;
		JavascriptExecutor js = (JavascriptExecutor) driver;
		

		try {
			ArrayList<String> readfilelink = readfile.getpost();
		      ThreadLocalRandom random = ThreadLocalRandom.current();

		      int rand = random.nextInt(0, readfilelink.size()-1);
		      readfile  obj1=new readfile ();
		      String fileformate =obj1.CreateFileonlywireTrack(args);
		    	System.out.println(fileformate);
				FileWriter myWriter = new FileWriter(fileformate, true);
			      myWriter.write(readfilelink.get(rand));
			      myWriter.write("\r\n");
			      myWriter.close();
		        driver.get("https://www.onlywire.com/");
			    driver.manage().window().maximize();
			    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		        WebElement ele31, ele, ele1, ele12, ele13, ele14, ele15,ele16;
		        ele31= driver.findElement(By.xpath("//div[@class='header-link login']"));
		        ele31.click();
		        ele= driver.findElement(By.xpath("//input[@placeholder='Enter Email or Username']"));
		        ele.click();
		        ele.sendKeys("sonia.bajaj22f@gmail.com");
		        ele1= driver.findElement(By.xpath("//input[@placeholder='Enter Password']"));
		        ele1.click();
		        ele1.sendKeys("Anubhav123");
		        ele12= driver.findElement(By.xpath("//a[@name='submit']"));
		        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", ele12);
		        ele12.click();
		        ele13= driver.findElement(By.xpath("//a[@id=\"hero-new-post\"]"));
		        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", ele13);
		        ele13.click();
		        ele14= driver.findElement(By.xpath("//input[@id='new-post-url']"));
		        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", ele14);
		        ele14.click();
		        ele14.sendKeys(readfilelink.get(rand));
		        ele15= driver.findElement(By.xpath("//textarea[@id='create-post-description']"));
		        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", ele15);
		        ele15.click();
		        driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		        ele16= driver.findElement(By.xpath("//a[@class='ow-button share-post orange medium']"));
		        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", ele16);
		        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		        System.out.println("site23");
		        ele16.click(); 
		        
		  } catch(Exception e) {
			  System.out.println("g");
		  }
		 
	  }

	
	

}
