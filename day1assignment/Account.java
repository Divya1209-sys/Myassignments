package week2.day1assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Account {

	public static void main(String[] args) {
		
		ChromeOptions option=new ChromeOptions();
		option.addArguments("guest");
		ChromeDriver dri = new ChromeDriver(option);
		dri.get("http://leaftaps.com/opentaps/");
		dri.manage().window().maximize();
		dri.findElement(By.id("username")).sendKeys("demosalesmanager");
		dri.findElement(By.id("password")).sendKeys("crmsfa");
		dri.findElement(By.className("decorativeSubmit")).click();
		dri.findElement(By.partialLinkText("CRM/SFA")).click();
		dri.findElement(By.linkText("Accounts")).click();
		dri.findElement(By.linkText("Create Account")).click();
		dri.findElement(By.id("accountName")).sendKeys("DG System");
		dri.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		dri.findElement(By.id("numberEmployees")).sendKeys("5");
		dri.findElement(By.id("officeSiteName")).sendKeys("LeafTaps");
		dri.findElement(By.className("smallSubmit")).click();
		String title=dri.getTitle();
		System.out.println(title);
		//dri.close();
		
		
		
	}

}
