package driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ICICI {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
System.setProperty("Webdriver.chrome.driver","C:\\Users\\DELL\\Desktop\\alert\\src\\driver\\chromedriver.exe");
		
        WebDriver driver = new ChromeDriver();
        driver.get("https://infinity.icicibank.com/corp/AuthenticationController?FORMSGROUP_ID__=AuthenticationFG&__START_TRAN_FLAG__=Y&FG_BUTTONS__=LOAD&ACTION.LOAD=Y&AuthenticationFG.LOGIN_FLAG=1&BANK_ID=ICI");
        driver.manage().window().maximize();
        Thread.sleep(1000);
        
        WebElement findElement = driver.findElement(By.id("Revamp_Banner_ID"));
        
        WebElement userid = driver.findElement(By.id("HDisplayDefault.Rb14"));
        userid.sendKeys("green123");
        
        

	}

}
