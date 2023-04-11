package driver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Aler {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("Webdriver.chrome.driver","C:\\Users\\DELL\\Desktop\\alert\\src\\driver\\chromedriver.exe");
		
          WebDriver driver = new ChromeDriver();
          driver.get("http://demoqa.com/automation-practice-form/");
          driver.manage().window().maximize();
          Thread.sleep(1000);
          
         WebElement element = driver.findElement(By.xpath("//div[text()='Select State']"));
			
			Select select = new Select(element);
			List<WebElement> options = select.getOptions();
			System.out.println(options.size());
			
			for (int i = 0; i < options.size(); i++) {
				if (i%2==0) {
					System.out.println(options.get(i).getText());
					
				}
				
			}			
			
	}         
          
}        	  
        	  
			
		
			
		
       
          
		
          
     
		
   	 
   	 
   	  
   	   
    	   
		
	
				
			
			
		
          
 
        		  
				
			
			
		
          
         
         

	


