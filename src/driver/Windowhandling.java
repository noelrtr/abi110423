package driver;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Windowhandling {

	
		
	public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
			
		System.setProperty("Webdriver.chrome.driver","C:\\Users\\DELL\\Desktop\\alert\\src\\driver\\chromedriver.exe");
			
	      WebDriver driver = new ChromeDriver();
	      driver.get("http://greenstech.in/selenium-course-content.html");
	      driver.manage().window().maximize();
	      Thread.sleep(1000);
	      
	      WebElement selenium = driver.findElement(By.xpath("(//i[@class='fas fa-plus'])[8]"));
	      selenium.click();
	      
	      Thread.sleep(1000);
	      WebElement task = driver.findElement(By.xpath("//a[text()=' TESTNG']"));
	      task.click();
	     
	      String parent = driver.getWindowHandle();
	      System.out.println(parent);
	      
	      Set<String> all = driver.getWindowHandles();
	      System.out.println(all);
	      
	      List<String>window=new ArrayList<String>();
	      window.addAll(all);
	      
	      String child = window.get(1);
	      System.out.println(child);
	      
	      driver.switchTo().window(child);
	      
	      Thread.sleep(1000);
	      WebElement practical = driver.findElement(By.xpath("//pre[@style='word-wrap: break-word; white-space: pre-wrap;']"));
	      System.out.println("Practicalqn1:"+"QUESTION 4\r\n" + 
	      		"----------\r\n" + 
	      		"URL : https://www.flipkart.com/account/login\r\n" + 
	      		"\r\n" + 
	      		"NOTE: Enter the email and password and verify whether the input are correct or not by using Testng framework,POM framework.\r\n");  
	      		
	      		
	      
	 
	      
	    
	      
	    
	     
	      
	      
	      
	     
        	  
		}
	}


