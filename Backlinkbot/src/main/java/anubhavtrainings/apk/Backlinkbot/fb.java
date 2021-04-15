package anubhavtrainings.apk.Backlinkbot;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class fb {
	public static void main( String[] args ) throws  IOException, InterruptedException
    {
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\sc\\Desktop\\all files\\backlinkBot\\files\\webdrivers\\chromedriver.exe");
    	ChromeOptions options= new ChromeOptions();
        options.addArguments("incognito");
        options.addArguments("disable-popup-blocking");
        
        WebDriver driver = new ChromeDriver(options);
        
        //FileReader fr =new FileReader("D:\\Desktop\\automation\\links.txt");
       // @SuppressWarnings("resource")
		//BufferedReader br = new BufferedReader(fr);
        //String links[]= new String[100];
        //int i=0;
        //while(br.readLine()!=null) {
        	//links[i]=br.readLine();
        	//i+=1;
        //}
        //Random rad= new Random();
        //int intRandom =rad.nextInt(i);
        //String s=links[intRandom];
        
        WebElement mail,pass,login ;
        driver.get("https://www.facebook.com/1");
        driver.manage().window().maximize();
        mail=driver.findElement(By.id("email"));
        mail.sendKeys("8619874672");
        
        pass=driver.findElement(By.id("pass"));
        pass.sendKeys("123456#");
        
        login=driver.findElement(By.id("loginbutton"));
        login.click();
        Thread.sleep(10000);
        Posting(driver);
        Thread.sleep(5000);
        searchOption(driver);
        Thread.sleep(5000);
        entering(driver);
        Thread.sleep(5000);
        texting(driver);
        Thread.sleep(5000);
        close(driver);
        Thread.sleep(5000);
        
        
    }
	public static void Posting(WebDriver driver)  {
		WebElement home;
		home= driver.findElement(By.xpath("//a[@aria-label='Home']"));
		home.click();
	}
	public static void searchOption(WebDriver driver) {
		WebElement search;
		search = driver.findElement(By.xpath("//input[@aria-label='Search Facebook']"));
		search.click();
		search.sendKeys("SAP ABAP Solutions");
		search.sendKeys(Keys.ENTER);
	}
	public static void entering(WebDriver driver) {
		WebElement enter;
		enter=driver.findElement(By.xpath("//a[@aria-label='View Group']"));
		enter.click();
	}
	public static void texting(WebDriver driver ) throws InterruptedException {
		
		try {
			
			WebElement text;
			text = driver.findElement(By.xpath("//div[@class='m9osqain a5q79mjw jm1wdb64 k4urcfbm']"));
			Thread.sleep(10000);
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();",  text);
		text.click();
		     
		  } catch(Exception e) {
			  System.out.println("site21");
		  }
		
		
		
	}
	public static void close(WebDriver driver) {
		WebElement enter;
		enter=driver.findElement(By.xpath("//a[@aria-labjel='View Group']"));
		enter.click();
	}

}
