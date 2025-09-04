package week2.day1assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Lead {

	public static void main(String[] args) {
		
		ChromeOptions options=new ChromeOptions();
		options.addArguments("guest");
		//Instantiate the browser driver
        ChromeDriver driver=new ChromeDriver(options);
        //EdgeDriver driver1=new EdgeDriver();
        driver.get("http://leaftaps.com/opentaps/control/main");
        //maximise
        driver.manage().window().maximize();
       
        
        driver.findElement(By.id("username")).sendKeys("demosalesmanager");
       
        driver.findElement(By.id("password")).sendKeys("crmsfa");
      
        driver.findElement(By.className("decorativeSubmit")).click();
       
        driver.findElement(By.partialLinkText("CRM")).click();	
        driver.findElement(By.linkText("Leads")).click();
        driver.findElement(By.linkText("Create Lead")).click();
        driver.findElement(By.id("createLeadForm_companyName")).sendKeys("DG Sofware solutions");
        driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Divya");
        driver.findElement(By.id("createLeadForm_lastName")).sendKeys("R");
        driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Testing");
        driver.findElement(By.className("smallSubmit")).click();
        String title=driver.getTitle();
	    System.out.println(title);
	    driver.close();
        


	}

}
