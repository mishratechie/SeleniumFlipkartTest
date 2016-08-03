package com.trial;



import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FlipkartAllMobile {
 
	
	public static void main(String[] args) throws InterruptedException {
		
		
		 WebDriver driver;
		 String baseUrl;
		  
		   driver = new FirefoxDriver();
		   baseUrl = "http://www.flipkart.com/";
		   driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		 

		  
		    driver.get(baseUrl);
		    driver.findElement(By.id("fk-top-search-box")).clear();
		    driver.findElement(By.id("fk-top-search-box")).sendKeys("samsung");
		    driver.findElement(By.xpath("//input[@value='Search']")).click();
		    

		    driver.findElement(By.cssSelector("a.js-promo-cancel.promoCancel")).click();
		    driver.findElement(By.xpath("(//a[contains(text(),'Mobiles')])[2]")).click();
		    driver.findElement(By.cssSelector("a.parent.active")).click();
		    Thread.sleep(3000);
		    WebElement count =driver.findElement(By.xpath("//li[@class='store']/a/span"));
		    											   
		    String str=count.getText();
		    str = str.replaceAll("[^\\d.]", "");
		    System.out.println("total number of samsung mobiles are "+str);
		    
		    driver.findElement(By.xpath("//a[@type='products']")).click();
		  
		    ////div[@class='gd-row browse-grid-row']/div["+i+"]/div/div[2]/div/a/")).getText();
		    
		    Thread.sleep(3000);
		    for(WebElement e:driver.findElements(By.xpath("//a[@class='fk-display-block']"))){
		    	System.out.println(e.getText());
		    }
		   
		    Thread.sleep(10000);
		    	    
		    driver.quit();
		    	    
		 
	}
	

 
 

 
  
  }

