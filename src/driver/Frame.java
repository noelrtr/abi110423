package driver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Frame {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("Webdriver.chrome.driver","C:\\Users\\DELL\\Desktop\\alert\\src\\driver\\chromedriver.exe");
		
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.guru99.com/test/web-table-element.php");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        
        WebElement table = driver.findElement(By.xpath("//table[@class='dataTable']"));
        
        //to know the no of rows
        List<WebElement> tablerows = table.findElements(By.tagName("tr"));
        System.out.println(tablerows.size());
        
        //to know the no of column
        List<WebElement> column = table.findElements(By.tagName("th"));
        System.out.println(column.size());
        
        //to know the no of data
        List<WebElement> data = table.findElements(By.tagName("td"));
        System.out.println(data.size());
        
        //to print one row data
        WebElement webElement = tablerows.get(2);
        System.out.println(webElement.getText()); 
        
        //to print all the row data
        for (int i = 0; i < tablerows.size(); i++) {
        	System.out.println(tablerows.get(i).getText());
			
		}
        //to print row data one by one
        WebElement row1 = tablerows.get(3);
        List<WebElement> row1data = row1.findElements(By.tagName("td"));
        
        for (int i = 0; i < row1data.size(); i++) {
        	System.out.println(row1data.get(i).getText());
			
		}
        //to print all data one by one
        for (int i = 0; i < tablerows.size(); i++) {
        	List<WebElement> finalrowdata = tablerows.get(i).findElements(By.tagName("td"));
        	for (int j = 0; j < finalrowdata.size(); j++) {
        		System.out.println(finalrowdata.get(j).getText());
				
			}
			
		}
        
        
       
       
       
        
        
        
       
        
      
        
        
      
       
      
     
			
		}
			
		
        
      
     
       
        
       
	}


