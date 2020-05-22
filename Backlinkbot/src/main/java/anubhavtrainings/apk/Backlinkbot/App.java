

package anubhavtrainings.apk.Backlinkbot;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class App {
	public static ArrayList<String> readfilealldata1;
	public static ArrayList<String> readfilealldata;
	public static String allText ="";
  public static void main(String[] args) throws InterruptedException, IOException {
	  //readfilealldata = readfile.getAllSites();
	  myMethod1();
	  myMethod();
	  myMethod2();
	  
  }
  static void myMethod1() throws IOException
  {
	  String currentDirectory=System.getProperty("user.dir");
		System.out.println(currentDirectory);

	  System.setProperty("webdriver.chrome.driver",currentDirectory + "\\files\\webdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		try {
			  readfilealldata = readfile.getAllSites();
			  allText = "";
				for (String linebyline : readfilealldata) {
					allText = allText + linebyline + "\r\n";
				}
		      ThreadLocalRandom random = ThreadLocalRandom.current();

		      int rand = random.nextInt(1, 20);
		      //System.out.println(rand);
		      driver.get("https://megritools.com/backlink-generator");
		      driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		      WebElement elet1, elt31;
		      elet1= driver.findElement(By.xpath("//input[@id='myurl']"));
		      ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();",    elet1);
		      elet1.click();
		      elet1.sendKeys(readfilealldata.get(rand));
		      elt31= driver.findElement(By.xpath("//a[@class='btn btn-info']"));
		      ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();",    elt31);
		      elt31.click();
			     
		  } catch(Exception e) {
			  System.out.println("site1");
		  }
		try {
			  ArrayList<String> readfilealldata = readfile.getAllSites();
		      ThreadLocalRandom random = ThreadLocalRandom.current();

		      int rand = random.nextInt(1, 20);
		      ((JavascriptExecutor) driver).executeScript("window.open('https://www.site24x7.com/ping-test.html')");
		      driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			  Set<String> parent=driver.getWindowHandles();
			  Object[] child=parent.toArray();
			  driver.switchTo().window((String) child[1]);
	  	WebElement elementpt, elementpt1;
	  	elementpt = driver.findElement(By.xpath("//input[@class='hostnameonly']"));
	  	((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();",    elementpt);
	    elementpt.clear();
	    elementpt.click();
	    elementpt.sendKeys(readfilealldata.get(rand));
	    elementpt1 = driver.findElement(By.xpath("//div[@class='grbutton']"));
	    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();",    elementpt1);
	    elementpt1.click();
		  } catch(Exception e) {
			  System.out.println("site2");
		  }
		try {
			((JavascriptExecutor) driver).executeScript("window.open('http://www.indexkings.com/')");
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			Set<String> parent=driver.getWindowHandles();
			Object[] child=parent.toArray();
			driver.switchTo().window((String) child[2]);
			WebElement ele21, ele31;
			ele21= driver.findElement(By.xpath("//textarea[@name='urls']"));
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();",     ele21);
			ele21.click();
			ele21.sendKeys(allText);
			ele31= driver.findElement(By.xpath("//input[@value='RAPID INDEX!']"));
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();",    ele31);
			ele31.click();

		  } catch(Exception e) {
			  System.out.println("site3");
		  }
		try {
			  String myText = allText;
			  myText = myText.replace("\n", Keys.chord(Keys.SHIFT, Keys.ENTER));	
			  ((JavascriptExecutor) driver).executeScript("window.open('http://pingfarm.com/')");
			  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			  Set<String> parent=driver.getWindowHandles();
			  Object[] child=parent.toArray();
			  driver.switchTo().window((String) child[3]);
		      WebElement ele21, ele31;
		      ele21= driver.findElement(By.xpath("//textarea[@name='urls']"));
		      ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();",     ele21);
		      ele21.click();
		      ele21.sendKeys( myText);
		      ele31= driver.findElement(By.xpath("//input[@type='submit']"));
		      ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();",     ele31);
		      ele31.click();
		  } catch(Exception e) {
			  System.out.println("site4");
		  }
		
		try {
			  ArrayList<String> readfilealldata = readfile.getAllSites();
		      ThreadLocalRandom random = ThreadLocalRandom.current();

		      int rand = random.nextInt(1, 20);
		      ((JavascriptExecutor) driver).executeScript("window.open('http://pingomatic.com/')");
		      driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			  Set<String> parent=driver.getWindowHandles();
			  Object[] child=parent.toArray();
			  driver.switchTo().window((String) child[4]);
	  	WebElement elementpt, elementpt1, elementpt2;
	  	elementpt = driver.findElement(By.xpath("//input[@id='title']"));
	    elementpt.clear();
	    elementpt.click();
	    elementpt.sendKeys(readfilealldata.get(rand));
	    elementpt1 = driver.findElement(By.xpath("//input[@id='blogurl']"));
	    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();",     elementpt1);
	    elementpt1.clear();
	    elementpt1.click();
	    elementpt1.sendKeys(readfilealldata.get(rand));
	    elementpt2= driver.findElement(By.xpath("//a[@class='bigbutton']"));
	    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();",     elementpt2);
	    elementpt2.click();
		  } catch(Exception e) {
			  System.out.println("site5");
		  }
		
		try {
			ArrayList<String> readfilealldata = readfile.getAllSites();
		      ThreadLocalRandom random = ThreadLocalRandom.current();

		      int rand = random.nextInt(1, 20);	
			  ((JavascriptExecutor) driver).executeScript("window.open('https://megritools.com/backlink-generator')");
			  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			  Set<String> parent=driver.getWindowHandles();
			  Object[] child=parent.toArray();
			  driver.switchTo().window((String) child[5]);
		      WebElement ele21, ele31;
		      ele21= driver.findElement(By.xpath("//input[@id='myurl']"));
		      ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();",     ele21);
		      ele21.click();
		      ele21.sendKeys(readfilealldata.get(rand));
		      ele31= driver.findElement(By.xpath("//a[@id='checkButton']"));
		      ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();",     ele31);
		      ele31.click();
			     
		  } catch(Exception e) {
			  System.out.println("site6");
		  }
		
		try {
			  ArrayList<String> readfilealldata = readfile.getAllSites();
		      ThreadLocalRandom random = ThreadLocalRandom.current();

		      int rand = random.nextInt(1, 20);
			  ((JavascriptExecutor) driver).executeScript("window.open('http://cleverstat.com/backlink-maker')");
			  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			  Set<String> parent=driver.getWindowHandles();
			  Object[] child=parent.toArray();
			  driver.switchTo().window((String) child[6]);
		      WebElement elet1, elt32;
		      elet1= driver.findElement(By.xpath("//input[@id='myurl']"));
		      ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();",     elet1);
		      elet1.click();
		      elet1.sendKeys(readfilealldata.get(rand));
		      elt32= driver.findElement(By.xpath("//a[@id='checkButton']"));
		      ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();",     elt32);
		      elt32.click();

		      
			     
		  } catch(Exception e) {
			  System.out.println("site7");
		  }
		try {
			ArrayList<String> readfilealldata = readfile.getAllSites();
		      ThreadLocalRandom random = ThreadLocalRandom.current();

		      int rand = random.nextInt(1, 20);
			  ArrayList<String> readfilealldata1 = readfile.readMail();
		      ThreadLocalRandom random1 = ThreadLocalRandom.current();
		      int rand1 = random1.nextInt(1, 15);
		      System.out.println(rand1);
		      ((JavascriptExecutor) driver).executeScript("window.open('https://www.addme.com/submission/free-submission-start.php')");
		      driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			  Set<String> parent=driver.getWindowHandles();
			  Object[] child=parent.toArray();
			  driver.switchTo().window((String) child[7]);
	  	WebElement elementpt, elementpt1, elementpt2, elementpt3;
	  	elementpt = driver.findElement(By.xpath("//input[@id='url']"));
	    elementpt.click();
	    elementpt.sendKeys(readfilealldata.get(rand));
	    System.out.println(readfilealldata.get(rand));
	    elementpt1 = driver.findElement(By.xpath("//input[@id='email']"));
	    elementpt1.click();
	    elementpt1.sendKeys(readfilealldata1.get(rand1));
	    elementpt2 = driver.findElement(By.xpath("//input[@id='fname']"));
	    elementpt2.click();
	    elementpt2.sendKeys("sunda");
	    elementpt3 = driver.findElement(By.xpath("//input[@type='Submit']"));
	    elementpt3.click();
	    
		  } catch(Exception e) {
			  System.out.println("site8");
		  }
		try {
			  String myText = allText;
			  myText = myText.replace("\n", Keys.chord(Keys.SHIFT, Keys.ENTER));	
			  ((JavascriptExecutor) driver).executeScript("window.open('http://pingfarm.com/')");
			  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			  Set<String> parent=driver.getWindowHandles();
			  Object[] child=parent.toArray();
			  driver.switchTo().window((String) child[8]);
		      WebElement ele21, ele31;
		      ele21= driver.findElement(By.xpath("//textarea[@name='urls']"));
		      ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();",     ele21);
		      ele21.click();
		      ele21.sendKeys( myText);
		      ele31= driver.findElement(By.xpath("//input[@type='submit']"));
		      ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();",     ele31);
		      ele31.click();
		  } catch(Exception e) {
			  System.out.println("site9");
		  }
		  try {
			  ArrayList<String> readfilealldata = readfile.getAllSites();
		      ThreadLocalRandom random = ThreadLocalRandom.current();

		      int rand = random.nextInt(1, 20);
			  ((JavascriptExecutor) driver).executeScript("window.open('https://megritools.com/backlink-generator')");
			  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			  Set<String> parent=driver.getWindowHandles();
			  Object[] child=parent.toArray();
			  driver.switchTo().window((String) child[9]);
		      WebElement elet1, elt31;
		      elet1= driver.findElement(By.xpath("//input[@id='myurl']"));
		      ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();",     elet1);
		      elet1.click();
		      elet1.sendKeys(readfilealldata.get(rand));
		      elt31= driver.findElement(By.xpath("//a[@class='btn btn-info']"));
		      ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();",     elt31);
		      elt31.click();
			     
		  } catch(Exception e) {
			  System.out.println("site10");
		  }
		  }
		
 
  private static void myMethod()throws InterruptedException, IOException{
		System.setProperty("webdriver.chrome.driver","C:\\developmenttools\\START\\webdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	  try {
		  ArrayList<String> readfilealldata = readfile.getAllSites();
	      ThreadLocalRandom random = ThreadLocalRandom.current();

	      int rand = random.nextInt(1, 20);	 
  	driver.get("https://www.site24x7.com/ping-test.html");
  	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
  	WebElement elementpt, elementpt1;
  	elementpt = driver.findElement(By.xpath("//input[@class='hostnameonly']"));
  	((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();",     elementpt);
    elementpt.clear();
    elementpt.click();
    elementpt.sendKeys(readfilealldata.get(rand));
    elementpt1 = driver.findElement(By.xpath("//div[@class='grbutton']"));
    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();",     elementpt1);
    elementpt1.click();
	  } catch(Exception e) {
		  System.out.println("site11");
	  }
	  try {
		  ArrayList<String> readfilealldata = readfile.getAllSites();
	      ThreadLocalRandom random = ThreadLocalRandom.current();

	      int rand = random.nextInt(1, 20);
		  ((JavascriptExecutor) driver).executeScript("window.open('https://us.mysiteslink.com/index.php')");
		  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		  Set<String> parent=driver.getWindowHandles();
		  Object[] child=parent.toArray();
		  driver.switchTo().window((String) child[1]);
	      WebElement elementpt11, elementpt2;
	      elementpt11= driver.findElement(By.xpath("//input[@id='sn']"));
	      ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();",     elementpt11);
	      elementpt11.click();
	      elementpt11.sendKeys(readfilealldata.get(rand));
	      elementpt2= driver.findElement(By.xpath("//input[@id='ss']"));
	      ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();",     elementpt2);
	      elementpt2.click();
		  
		  		  } catch(Exception e) {
		  			System.out.println("site12");
		     
	  }
	  try {
		  ArrayList<String> readfilealldata = readfile.getAllSites();
	      ThreadLocalRandom random = ThreadLocalRandom.current();

	      int rand = random.nextInt(1, 20);
		  ((JavascriptExecutor) driver).executeScript("window.open('https://feedburner.google.com/fb/a/ping')");
		  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		  Set<String> parent=driver.getWindowHandles();
		  Object[] child=parent.toArray();
		  driver.switchTo().window((String) child[2]);
	      WebElement elementpt21, elementpt31;
	      elementpt21= driver.findElement(By.xpath("//input[@name='bloglink']"));
	      ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();",    elementpt21);
	      elementpt21.click();
	      elementpt21.sendKeys(readfilealldata.get(rand));
	      elementpt31= driver.findElement(By.xpath("//input[@class='button']"));
	      ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();",    elementpt31);
	      elementpt31.click();
		     
	  } catch(Exception e) {
		  System.out.println("site13");
	  }
	  try {
		  String myText = allText;
		  myText = myText.replace("\n", Keys.chord(Keys.SHIFT, Keys.ENTER));	
		  ((JavascriptExecutor) driver).executeScript("window.open('http://www.indexkings.com/')");
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  Set<String> parent=driver.getWindowHandles();
		  Object[] child=parent.toArray();
		  driver.switchTo().window((String) child[3]);
	      WebElement ele21, ele31;
	      ele21= driver.findElement(By.xpath("//textarea[@name='urls']"));
	      ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();",   ele21);
	      ele21.click();
	      ele21.sendKeys( myText);
	      ele31= driver.findElement(By.xpath("//input[@value='RAPID INDEX!']"));
	      ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();",   ele31);
	      ele31.click();
		     
	  } catch(Exception e) {
		  System.out.println("site14");
	  }
	  try {
		  ArrayList<String> readfilealldata = readfile.getAllSites();
	      ThreadLocalRandom random = ThreadLocalRandom.current();

	      int rand = random.nextInt(1, 20);
		  ((JavascriptExecutor) driver).executeScript("window.open('http://seowagon.com/backlink-maker')");
		  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		  Set<String> parent=driver.getWindowHandles();
		  Object[] child=parent.toArray();
		  driver.switchTo().window((String) child[4]);
	      WebElement elet1, elt31;
	      elet1= driver.findElement(By.xpath("//input[@id='myurl']"));
	      ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();",   elet1);
	      elet1.click();
	      elet1.sendKeys(readfilealldata.get(rand));
	      elt31= driver.findElement(By.xpath("//a[@class='btn btn-info']"));
	      ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();",   elt31);
	      elt31.click();
		     
	  } catch(Exception e) {
		  System.out.println("site15");
	  }
	  try {
		  ArrayList<String> readfilealldata = readfile.getAllSites();
	      ThreadLocalRandom random = ThreadLocalRandom.current();

	      int rand = random.nextInt(1, 20);
		  ((JavascriptExecutor) driver).executeScript("window.open('https://megritools.com/backlink-generator')");
		  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		  Set<String> parent=driver.getWindowHandles();
		  Object[] child=parent.toArray();
		  driver.switchTo().window((String) child[5]);
	      WebElement elet1, elt31;
	      elet1= driver.findElement(By.xpath("//input[@id='myurl']"));
	      ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();",   elet1);
	      elet1.click();
	      elet1.sendKeys(readfilealldata.get(rand));
	      elt31= driver.findElement(By.xpath("//a[@class='btn btn-info']"));
	      ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();",   elt31);
	      elt31.click();
		     
	  } catch(Exception e) {
		  System.out.println("site16");
	  }
	  try {
		  ArrayList<String> readfilealldata = readfile.getAllSites();
	      ThreadLocalRandom random = ThreadLocalRandom.current();

	      int rand = random.nextInt(1, 20);
		  ((JavascriptExecutor) driver).executeScript("window.open('https://tools.pingdom.com/#5b6be158c0800000')");
		  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		  Set<String> parent=driver.getWindowHandles();
		  Object[] child=parent.toArray();
		  driver.switchTo().window((String) child[6]);
	      WebElement elt32, ele21;
	      ele21= driver.findElement(By.xpath("//input[@class='test-url-input ng-pristine ng-valid ng-touched']"));
	      ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();",  ele21);
	      ele21.click();
	      ele21.sendKeys(readfilealldata.get(rand));
	      elt32= driver.findElement(By.xpath("//input[@class='button cta-button test-button']"));
	      ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();",  elt32);
	      elt32.click();
		     
	  } catch(Exception e) {
		  System.out.println("site17");
	  }
	  try {
		  ArrayList<String> readfilealldata = readfile.getAllSites();
	      ThreadLocalRandom random = ThreadLocalRandom.current();

	      int rand = random.nextInt(1, 20);
		  ((JavascriptExecutor) driver).executeScript("window.open('https://www.pingmylinks.com/addurl/')");
		  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		  Set<String> parent=driver.getWindowHandles();
		  Object[] child=parent.toArray();
		  driver.switchTo().window((String) child[7]);
	      WebElement elet1, elt31;
	      elet1= driver.findElement(By.xpath("//input[@name='furl']"));
	      ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();",   elet1);
	      elet1.click();
	      elet1.sendKeys(readfilealldata.get(rand));
	      elt31= driver.findElement(By.xpath("//input[@onclick='fAjaxReg();this.blur();']"));
	      ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();",   elt31);
	      elt31.click();
		     
	  } catch(Exception e) {
		  System.out.println("site18");
	  }
	  try {
		  ArrayList<String> readfilealldata = readfile.getAllSites();
	      ThreadLocalRandom random = ThreadLocalRandom.current();

	      int rand = random.nextInt(1, 20);
		  ((JavascriptExecutor) driver).executeScript("window.open('http://pingsitemap.com/')");
		  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		  Set<String> parent=driver.getWindowHandles();
		  Object[] child=parent.toArray();
		  driver.switchTo().window((String) child[8]);
	      WebElement elet1, elt31;
	      elet1= driver.findElement(By.xpath("//input[@class='textfield']"));
	      ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();",   elet1);
	      elet1.click();
	      elet1.sendKeys(readfilealldata.get(rand));
	      elt31= driver.findElement(By.xpath("//input[@type='submit']"));
	      ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();",   elt31);
	      elt31.click();
		     
	  } catch(Exception e) {
		  System.out.println("site19");
	  }
	  
	  try {
		  ArrayList<String> readfilealldata = readfile.getAllSites();
	      ThreadLocalRandom random = ThreadLocalRandom.current();

	      int rand = random.nextInt(1, 20);
		  ((JavascriptExecutor) driver).executeScript("window.open('https://excitesubmit.com/')");
		  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		  Set<String> parent=driver.getWindowHandles();
		  Object[] child=parent.toArray();
		  driver.switchTo().window((String) child[9]);
	      WebElement elet1, elt31;
	      elet1= driver.findElement(By.xpath("//input[@id='furl']"));
	      ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();",   elet1);
	      elet1.click();
	      elet1.sendKeys(readfilealldata.get(rand));
	      elt31= driver.findElement(By.xpath("//input[@name='button']"));
	      ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();",   elt31);
	      elt31.click();
		     
	  } catch(Exception e) {
		  System.out.println("site20");
	  }
	  
  }
  
  static void myMethod2() throws IOException
  {
	  System.setProperty("webdriver.chrome.driver","C:\\developmenttools\\START\\webdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		try {
			  String myText = allText;
			  myText = myText.replace("\n", Keys.chord(Keys.SHIFT, Keys.ENTER));
			  driver.get("http://www.indexkings.com/");
			  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		      WebElement ele21, ele31;
		      ele21= driver.findElement(By.xpath("//textarea[@name='urls']"));
		      ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();",   ele21);
		      ele21.click();
		      ele21.sendKeys( myText);
		      ele31= driver.findElement(By.xpath("//input[@value='RAPID INDEX!']"));
		      ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();",   ele31);
		      ele31.click();
			     
		  } catch(Exception e) {
			  System.out.println("site21");
		  }
		try {
			  ArrayList<String> readfilealldata = readfile.getAllSites();
		      ThreadLocalRandom random = ThreadLocalRandom.current();

		      int rand = random.nextInt(1, 20);
			  ((JavascriptExecutor) driver).executeScript("window.open('http://seowagon.com/backlink-maker')");
			  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			  Set<String> parent=driver.getWindowHandles();
			  Object[] child=parent.toArray();
			  driver.switchTo().window((String) child[1]);
		      WebElement elet1, elt31;
		      elet1= driver.findElement(By.xpath("//input[@id='myurl']"));
		      ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();",   elet1);
		      elet1.click();
		      elet1.sendKeys(readfilealldata.get(rand));
		      elt31= driver.findElement(By.xpath("//a[@class='btn btn-info']"));
		      ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();",   elt31);
		      elt31.click();
			     
		  } catch(Exception e) {
			  System.out.println("site22");
		  }
		try {
			  ArrayList<String> readfilealldata = readfile.getAllSites();
		      ThreadLocalRandom random = ThreadLocalRandom.current();

		      int rand = random.nextInt(1, 20);
			  ((JavascriptExecutor) driver).executeScript("window.open('http://cleverstat.com/backlink-maker')");
			  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			  Set<String> parent=driver.getWindowHandles();
			  Object[] child=parent.toArray();
			  driver.switchTo().window((String) child[2]);
		      WebElement elet1, elt32;
		      elet1= driver.findElement(By.xpath("//input[@id='myurl']"));
		      ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();",   elet1);
		      elet1.click();
		      elet1.sendKeys(readfilealldata.get(rand));
		      elt32= driver.findElement(By.xpath("//a[@id='checkButton']"));
		      ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();",   elt32);
		      elt32.click(); 
			     
		  } catch(Exception e) {
			  System.out.println("site23");
		  }
		
		try {
			 ArrayList<String> readfilealldata = readfile.getAllSites();
		      ThreadLocalRandom random = ThreadLocalRandom.current();

		      int rand = random.nextInt(1, 20);
			((JavascriptExecutor) driver).executeScript("window.open('https://www.duplichecker.com/backlink-maker.php')");
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			Set<String> parent=driver.getWindowHandles();
			Object[] child=parent.toArray();
			driver.switchTo().window((String) child[3]);
			WebElement ele21, ele31;
			ele21= driver.findElement(By.xpath("//input[@class='form-control input_style']"));
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", ele21);
			ele21.click();
			ele21.sendKeys(readfilealldata.get(rand));
			ele31= driver.findElement(By.xpath("//input[@value='Make BackLinks']"));
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", ele31);
			ele31.click();

		  } catch(Exception e) {
			  System.out.println("site24");
		  }

		 try {
			  ArrayList<String> readfilealldata = readfile.getAllSites();
		      ThreadLocalRandom random = ThreadLocalRandom.current();

		      int rand = random.nextInt(1, 20);
			  ((JavascriptExecutor) driver).executeScript("window.open('http://pingsitemap.com/')");
			  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			  Set<String> parent=driver.getWindowHandles();
			  Object[] child=parent.toArray();
			  driver.switchTo().window((String) child[4]);
		      WebElement elet1, elt31;
		      elet1= driver.findElement(By.xpath("//input[@class='textfield']"));
		      ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();",  elet1);
		      elet1.click();
		      elet1.sendKeys(readfilealldata.get(rand));
		      elt31= driver.findElement(By.xpath("//input[@type='submit']"));
		      ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();",   elt31);
		      elt31.click();
			     
		  } catch(Exception e) {
			  System.out.println("site25");
		  }
		try {
			ArrayList<String> readfilealldata = readfile.getAllSites();
		      ThreadLocalRandom random = ThreadLocalRandom.current();

		      int rand = random.nextInt(1, 20);	
			  ((JavascriptExecutor) driver).executeScript("window.open('https://megritools.com/backlink-generator')");
			  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			  Set<String> parent=driver.getWindowHandles();
			  Object[] child=parent.toArray();
			  driver.switchTo().window((String) child[5]);
		      WebElement ele21, ele31;
		      ele21= driver.findElement(By.xpath("//input[@id='myurl']"));
		      ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();",  ele21);
		      ele21.click();
		      ele21.sendKeys(readfilealldata.get(rand));
		      ele31= driver.findElement(By.xpath("//a[@id='checkButton']"));
		      ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();",  ele31);
		      ele31.click();
			     
		  } catch(Exception e) {
			  System.out.println("site26");
		  }
		
		try {
			  String myText = allText;
			  myText = myText.replace("\n", Keys.chord(Keys.SHIFT, Keys.ENTER));	
			  ((JavascriptExecutor) driver).executeScript("window.open('http://pingfarm.com/')");
			  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			  Set<String> parent=driver.getWindowHandles();
			  Object[] child=parent.toArray();
			  driver.switchTo().window((String) child[6]);
		      WebElement ele21, ele31;
		      ele21= driver.findElement(By.xpath("//textarea[@name='urls']"));
		      ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();",  ele21);
		      ele21.click();
		      ele21.sendKeys( myText);
		      ele31= driver.findElement(By.xpath("//input[@type='submit']"));
		      ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();",  ele31);
		      ele31.click();
		  } catch(Exception e) {
			  System.out.println("site27");
		  }
		  try {
			  ArrayList<String> readfilealldata = readfile.getAllSites();
		      ThreadLocalRandom random = ThreadLocalRandom.current();

		      int rand = random.nextInt(1, 20);
			  ((JavascriptExecutor) driver).executeScript("window.open('https://megritools.com/backlink-generator')");
			  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			  Set<String> parent=driver.getWindowHandles();
			  Object[] child=parent.toArray();
			  driver.switchTo().window((String) child[7]);
		      WebElement elet1, elt31;
		      elet1= driver.findElement(By.xpath("//input[@id='myurl']"));
		      ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();",  elet1);
		      elet1.click();
		      elet1.sendKeys(readfilealldata.get(rand));
		      elt31= driver.findElement(By.xpath("//a[@class='btn btn-info']"));
		      ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();",  elt31);
		      elt31.click();
			     
		  } catch(Exception e) {
			  System.out.println("site28");
		  }
		  try {
			  readfilealldata = readfile.getAllSites();
			  allText = "";
				for (String linebyline : readfilealldata) {
					allText = allText + linebyline + "\r\n";
				}
		      ThreadLocalRandom random = ThreadLocalRandom.current();

		      int rand = random.nextInt(1, 20);
		      ((JavascriptExecutor) driver).executeScript("window.open('https://www.prepostseo.com/backlinks-maker')");
			  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			  Set<String> parent=driver.getWindowHandles();
			  Object[] child=parent.toArray();
			  driver.switchTo().window((String) child[8]);
		      WebElement elet1, elt31;
		      elet1= driver.findElement(By.xpath("//input[@id='inputURL']"));
		      ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();",  elet1);
		      elet1.click();
		      elet1.sendKeys(readfilealldata.get(rand));
		      elt31= driver.findElement(By.xpath("//input[@type='submit']"));
		      ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();",  elt31);
		      elt31.click();
			     
		  } catch(Exception e) {
			  System.out.println("site29");
		  }
		  try {
			  ArrayList<String> readfilealldata = readfile.getAllSites();
		      ThreadLocalRandom random = ThreadLocalRandom.current();

		      int rand = random.nextInt(1, 20);
			  ((JavascriptExecutor) driver).executeScript("window.open('https://totalping.com/')");
			  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			  Set<String> parent=driver.getWindowHandles();
			  Object[] child=parent.toArray();
			  driver.switchTo().window((String) child[9]);
		      WebElement ele21, ele31, ele22, ele23;
		      ele21= driver.findElement(By.xpath("//input[@alt='Blog Name:']"));
		      ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();",  ele21);
		      ele21.click();
		      ele21.sendKeys("SAP Online Training");
		      ele22= driver.findElement(By.xpath("//input[@alt='Blog Home Page:']"));
		      ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();",  ele22);
		      ele22.click();
		      ele22.sendKeys(readfilealldata.get(rand));
		      ele23= driver.findElement(By.xpath("//input[@alt='RSS URL:']"));
		      ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();",  ele23);
		      ele23.click();
		      ele23.sendKeys(readfilealldata.get(rand));
		      ele31= driver.findElement(By.xpath("//input[@type='submit']"));
		      ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();",  ele31);
		      ele31.click();
		  } catch(Exception e) {
			  System.out.println("site30");
		  }
		  }
 
}

