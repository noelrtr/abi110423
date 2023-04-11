package driver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Windowtable {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.chrome.driver","C:\\Users\\DELL\\Desktop\\alert\\src\\driver\\chromedriver.exe");
		
	      WebDriver driver = new ChromeDriver();
	      driver.get(" http://www.amazon.in");
	      driver.manage().window().maximize();
	      Thread.sleep(1000);
	      
	      WebElement prime = driver.findElement(By.id("nav-link-amazonprime"));
	      
	      Actions action = new Actions(driver);
	      
	      action.moveToElement(prime).perform();
	      
	      WebElement ck = driver.findElement(By.id("multiasins-img-link"));
	      ck.click();
	      
	    
        
       
			
		}

	}

