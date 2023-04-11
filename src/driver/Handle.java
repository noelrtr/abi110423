package driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("Webdriver.chrome.driver","C:\\Users\\DELL\\Desktop\\alert\\src\\driver\\chromedriver.exe");
		
	      WebDriver driver = new ChromeDriver();
	      driver.get("http://www.greenstechnologys.com/python-training.html");
	      driver.manage().window().maximize();
	      Thread.sleep(1000);
	      
	      driver.switchTo().frame("iframe3");
	      
	      WebElement clk = driver.findElement(By.xpath("(//button[@type='button'])[1]"));
	      clk.click();
	      
	      driver.switchTo().defaultContent();
	      
	      WebElement element = driver.findElement(By.xpath("//a[@href='#Curriculum']"));
          element.click();
	}

}
