

package anubhavtrainings.apk.Backlinkbot;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.ThreadLocalRandom;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class App {
  public static void main(String[] args) throws InterruptedException, IOException {
	  myMethod1();
	  myMethod();
	  
  }
  static void myMethod1() throws IOException
  {
	  System.setProperty("webdriver.chrome.driver","C:\\developmenttools\\START\\webdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		try {
			  ArrayList<String> readfilealldata = readfile.getAllSites();
		      ThreadLocalRandom random = ThreadLocalRandom.current();

		      int rand = random.nextInt(1, 19);
		      driver.get("https://megritools.com/backlink-generator");
		      WebElement elet1, elt31;
		      elet1= driver.findElement(By.xpath("//input[@id='myurl']"));
		      elet1.click();
		      elet1.sendKeys(readfilealldata.get(rand));
		      elt31= driver.findElement(By.xpath("//a[@class='btn btn-info']"));
		      elt31.click();
			     
		  } finally {
			  System.out.println("first");
		  }
		try {
			  ArrayList<String> readfilealldata = readfile.getAllSites();
		      ThreadLocalRandom random = ThreadLocalRandom.current();

		      int rand = random.nextInt(1, 19);
		      ((JavascriptExecutor) driver).executeScript("window.open('https://www.site24x7.com/ping-test.html')");
			  Set<String> parent=driver.getWindowHandles();
			  Object[] child=parent.toArray();
			  driver.switchTo().window((String) child[1]);
	  	WebElement elementpt, elementpt1;
	  	elementpt = driver.findElement(By.xpath("//input[@class='hostnameonly']"));
	    elementpt.clear();
	    elementpt.click();
	    elementpt.sendKeys(readfilealldata.get(rand));
	    elementpt1 = driver.findElement(By.xpath("//div[@class='grbutton']"));
	    elementpt1.click();
		  } finally {
			  System.out.println("2nd");
		  }
		try {
			  String myText = "https://www.anubhavtrainings.com/abap-on-cloud-training\r\n" + 
			  		"https://www.anubhavtrainings.com/sap-technical-training\r\n" + 
			  		"https://www.anubhavtrainings.com/sap-ui5-and-fiori-training\r\n" + 
			  		"https://www.anubhavtrainings.com\r\n" + 
			  		"https://www.anubhavtrainings.com/abap-on-hana-training\r\n" + 
			  		"https://www.anubhavtrainings.com/hana-cloud-integration-training\r\n" + 
			  		"https://www.anubhavtrainings.com/sap-fiori-launchpad-training\r\n" + 
			  		"https://youtu.be/latyWmPssvw\r\n" + 
			  		"https://www.youtube.com/watch?v=QUJUUfZ-7sA&list=PLcxqFaocb9WIQJ-kptyPuiMSVWZVd2ff_\r\n" + 
			  		"https://youtu.be/latyWmPssvw";
			  myText = myText.replace("\n", Keys.chord(Keys.SHIFT, Keys.ENTER));	
			  ((JavascriptExecutor) driver).executeScript("window.open('http://www.indexkings.com/')");
			  Set<String> parent=driver.getWindowHandles();
			  Object[] child=parent.toArray();
			  driver.switchTo().window((String) child[2]);
		      WebElement ele21, ele31;
		      ele21= driver.findElement(By.xpath("//textarea[@name='urls']"));
		      ele21.click();
		      ele21.sendKeys( myText);
		      ele31= driver.findElement(By.xpath("//input[@value='RAPID INDEX!']"));
		      ele31.click();
			     
		  } finally {
			  System.out.println("3rd");
		  }
		try {
			  String myText = "https://www.anubhavtrainings.com/abap-on-cloud-training\r\n" + 
			  		"https://www.anubhavtrainings.com/sap-technical-training\r\n" + 
			  		"https://www.anubhavtrainings.com/sap-ui5-and-fiori-training\r\n" + 
			  		"https://www.anubhavtrainings.com\r\n" + 
			  		"https://www.anubhavtrainings.com/abap-on-hana-training\r\n" + 
			  		"https://www.anubhavtrainings.com/hana-cloud-integration-training\r\n" + 
			  		"https://www.anubhavtrainings.com/sap-fiori-launchpad-training\r\n" + 
			  		"https://youtu.be/latyWmPssvw\r\n" + 
			  		"https://www.youtube.com/watch?v=QUJUUfZ-7sA&list=PLcxqFaocb9WIQJ-kptyPuiMSVWZVd2ff_\r\n" + 
			  		"https://youtu.be/latyWmPssvw\r\n" + 
			  		"https://www.youtube.com/watch?v=QUJUUfZ-7sA&list=PLcxqFaocb9WIQJ-kptyPuiMSVWZVd2ff_\r\n" + 
			  		"https://youtu.be/7Axs-ZgCwuM\r\n" + 
			  		"https://www.youtube.com/watch?v=PX5EmTPExLM&list=PLcxqFaocb9WLtnq-rpXbRy5hnKECxr95G\r\n" + 
			  		"https://youtu.be/RvJ6J96w9IA\r\n" + 
			  		"https://www.youtube.com/watch?v=I0LJ29Yy2OI&list=PLcxqFaocb9WKT5jVLtxp7U6AKo5NJ50WY\r\n" + 
			  		"https://youtu.be/J-OKtJJDEeg\r\n" + 
			  		"https://www.youtube.com/watch?v=DqOsekdXDGQ&list=PLcxqFaocb9WIDbiT6Eck_LE5DO3q3v8pD\r\n" + 
			  		"https://www.anubhavtrainings.com/sap-fiori-launchpad-training\r\n" + 
			  		"https://youtu.be/6E3I__2Gj9Q\r\n";
			  myText = myText.replace("\n", Keys.chord(Keys.SHIFT, Keys.ENTER));	
			  ((JavascriptExecutor) driver).executeScript("window.open('http://pingfarm.com/')");
			  Set<String> parent=driver.getWindowHandles();
			  Object[] child=parent.toArray();
			  driver.switchTo().window((String) child[3]);
		      WebElement ele21, ele31;
		      ele21= driver.findElement(By.xpath("//textarea[@name='urls']"));
		      ele21.click();
		      ele21.sendKeys( myText);
		      ele31= driver.findElement(By.xpath("//input[@type='submit']"));
		      ele31.click();
		  } finally {
			  System.out.println("4th");
		  }
		  }
		
 
  private static void myMethod()throws InterruptedException, IOException{
		System.setProperty("webdriver.chrome.driver","C:\\developmenttools\\START\\webdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	  try {
		  ArrayList<String> readfilealldata = readfile.getAllSites();
	      ThreadLocalRandom random = ThreadLocalRandom.current();

	      int rand = random.nextInt(1, 19);
	      System.out.println(rand);
		 
  	driver.get("https://www.site24x7.com/ping-test.html");
  	WebElement elementpt, elementpt1;
  	elementpt = driver.findElement(By.xpath("//input[@class='hostnameonly']"));
    elementpt.clear();
    elementpt.click();
    elementpt.sendKeys(readfilealldata.get(rand));
    elementpt1 = driver.findElement(By.xpath("//div[@class='grbutton']"));
    elementpt1.click();
	  } finally {
		  System.out.println("first");
	  }
	  try {
		  ArrayList<String> readfilealldata = readfile.getAllSites();
	      ThreadLocalRandom random = ThreadLocalRandom.current();

	      int rand = random.nextInt(1, 19);
	      System.out.println(rand);
		  ((JavascriptExecutor) driver).executeScript("window.open('https://us.mysiteslink.com/index.php')");
		  Set<String> parent=driver.getWindowHandles();
		  Object[] child=parent.toArray();
		  driver.switchTo().window((String) child[1]);
	      WebElement elementpt11, elementpt2;
	      elementpt11= driver.findElement(By.xpath("//input[@id='sn']"));
	      elementpt11.click();
	      elementpt11.sendKeys(readfilealldata.get(rand));
	      elementpt2= driver.findElement(By.xpath("//input[@id='ss']"));
	      elementpt2.click();
		  
		  		  } finally {
		  			System.out.println("second");
		     
	  }
	  try {
		  ArrayList<String> readfilealldata = readfile.getAllSites();
	      ThreadLocalRandom random = ThreadLocalRandom.current();

	      int rand = random.nextInt(1, 19);
	      System.out.println(rand);
		  ((JavascriptExecutor) driver).executeScript("window.open('https://feedburner.google.com/fb/a/ping')");
		  Set<String> parent=driver.getWindowHandles();
		  Object[] child=parent.toArray();
		  driver.switchTo().window((String) child[2]);
	      WebElement elementpt21, elementpt31;
	      elementpt21= driver.findElement(By.xpath("//input[@name='bloglink']"));
	      elementpt21.click();
	      elementpt21.sendKeys(readfilealldata.get(rand));
	      elementpt31= driver.findElement(By.xpath("//input[@class='button']"));
	      elementpt31.click();
		     
	  } finally {
		  System.out.println("3rd");
	  }
	  try {
		  String myText = "https://www.anubhavtrainings.com/abap-on-cloud-training\r\n" + 
		  		"https://www.anubhavtrainings.com/sap-technical-training\r\n" + 
		  		"https://www.anubhavtrainings.com/sap-ui5-and-fiori-training\r\n" + 
		  		"https://www.anubhavtrainings.com\r\n" + 
		  		"https://www.anubhavtrainings.com/abap-on-hana-training\r\n" + 
		  		"https://www.anubhavtrainings.com/hana-cloud-integration-training\r\n" + 
		  		"https://www.anubhavtrainings.com/sap-fiori-launchpad-training\r\n" + 
		  		"https://youtu.be/latyWmPssvw\r\n" + 
		  		"https://www.youtube.com/watch?v=QUJUUfZ-7sA&list=PLcxqFaocb9WIQJ-kptyPuiMSVWZVd2ff_\r\n" + 
		  		"https://youtu.be/latyWmPssvw";
		  myText = myText.replace("\n", Keys.chord(Keys.SHIFT, Keys.ENTER));	
		  ((JavascriptExecutor) driver).executeScript("window.open('http://www.indexkings.com/')");
		  Set<String> parent=driver.getWindowHandles();
		  Object[] child=parent.toArray();
		  driver.switchTo().window((String) child[3]);
	      WebElement ele21, ele31;
	      ele21= driver.findElement(By.xpath("//textarea[@name='urls']"));
	      ele21.click();
	      ele21.sendKeys( myText);
	      ele31= driver.findElement(By.xpath("//input[@value='RAPID INDEX!']"));
	      ele31.click();
		     
	  } finally {
		  System.out.println("4th");
	  }
	  try {
		  ArrayList<String> readfilealldata = readfile.getAllSites();
	      ThreadLocalRandom random = ThreadLocalRandom.current();

	      int rand = random.nextInt(1, 19);
	      System.out.println(rand);
		  ((JavascriptExecutor) driver).executeScript("window.open('http://seowagon.com/backlink-maker')");
		  Set<String> parent=driver.getWindowHandles();
		  Object[] child=parent.toArray();
		  driver.switchTo().window((String) child[4]);
	      WebElement elet1, elt31;
	      elet1= driver.findElement(By.xpath("//input[@id='myurl']"));
	      elet1.click();
	      elet1.sendKeys(readfilealldata.get(rand));
	      elt31= driver.findElement(By.xpath("//a[@class='btn btn-info']"));
	      elt31.click();
		     
	  } finally {
		  System.out.println("5th");
	  }
	  try {
		  ArrayList<String> readfilealldata = readfile.getAllSites();
	      ThreadLocalRandom random = ThreadLocalRandom.current();

	      int rand = random.nextInt(1, 19);
	      System.out.println(rand);
		  ((JavascriptExecutor) driver).executeScript("window.open('https://megritools.com/backlink-generator')");
		  Set<String> parent=driver.getWindowHandles();
		  Object[] child=parent.toArray();
		  driver.switchTo().window((String) child[5]);
	      WebElement elet1, elt31;
	      elet1= driver.findElement(By.xpath("//input[@id='myurl']"));
	      elet1.click();
	      elet1.sendKeys(readfilealldata.get(rand));
	      elt31= driver.findElement(By.xpath("//a[@class='btn btn-info']"));
	      elt31.click();
		     
	  } finally {
		  System.out.println("6th");
	  }
	  try {
		  ArrayList<String> readfilealldata = readfile.getAllSites();
	      ThreadLocalRandom random = ThreadLocalRandom.current();

	      int rand = random.nextInt(1, 19);
	      System.out.println(rand);
		  ((JavascriptExecutor) driver).executeScript("window.open('https://tools.pingdom.com/#5b6be158c0800000')");
		  Set<String> parent=driver.getWindowHandles();
		  Object[] child=parent.toArray();
		  driver.switchTo().window((String) child[6]);
	      WebElement elt32;
	      elt32= driver.findElement(By.xpath("//input[@class='button cta-button test-button']"));
	      elt32.click();
		     
	  } finally {
		  System.out.println("7th");
	  }
	  try {
		  ArrayList<String> readfilealldata = readfile.getAllSites();
	      ThreadLocalRandom random = ThreadLocalRandom.current();

	      int rand = random.nextInt(1, 19);
	      System.out.println(rand);
		  ((JavascriptExecutor) driver).executeScript("window.open('https://www.pingmylinks.com/addurl/')");
		  Set<String> parent=driver.getWindowHandles();
		  Object[] child=parent.toArray();
		  driver.switchTo().window((String) child[7]);
	      WebElement elet1, elt31;
	      elet1= driver.findElement(By.xpath("//input[@name='furl']"));
	      elet1.click();
	      elet1.sendKeys(readfilealldata.get(rand));
	      elt31= driver.findElement(By.xpath("//input[@onclick='fAjaxReg();this.blur();']"));
	      elt31.click();
		     
	  } finally {
		  System.out.println("8th");
	  }
	  try {
		  ArrayList<String> readfilealldata = readfile.getAllSites();
	      ThreadLocalRandom random = ThreadLocalRandom.current();

	      int rand = random.nextInt(1, 19);
	      System.out.println(rand);
		  ((JavascriptExecutor) driver).executeScript("window.open('http://pingsitemap.com/')");
		  Set<String> parent=driver.getWindowHandles();
		  Object[] child=parent.toArray();
		  driver.switchTo().window((String) child[8]);
	      WebElement elet1, elt31;
	      elet1= driver.findElement(By.xpath("//input[@class='textfield']"));
	      elet1.click();
	      elet1.sendKeys(readfilealldata.get(rand));
	      elt31= driver.findElement(By.xpath("//input[@type='submit']"));
	      elt31.click();
		     
	  } finally {
		  System.out.println("9th");
	  }
	  
	  try {
		  ArrayList<String> readfilealldata = readfile.getAllSites();
	      ThreadLocalRandom random = ThreadLocalRandom.current();

	      int rand = random.nextInt(1, 19);
	      System.out.println(rand);
		  ((JavascriptExecutor) driver).executeScript("window.open('https://excitesubmit.com/')");
		  Set<String> parent=driver.getWindowHandles();
		  Object[] child=parent.toArray();
		  driver.switchTo().window((String) child[9]);
	      WebElement elet1, elt31;
	      elet1= driver.findElement(By.xpath("//input[@id='furl']"));
	      elet1.click();
	      elet1.sendKeys(readfilealldata.get(rand));
	      elt31= driver.findElement(By.xpath("//input[@name='button']"));
	      elt31.click();
		     
	  } finally {
		  System.out.println("10th");
	  }
	  
  }
 
}

