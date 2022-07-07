import java.util.concurrent.TimeUnit;
//import org.openqa.selenium.support.ui.Select;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
	public static void main(String[] args) {
	
	// Locators - Address on HTML page 
	// ID Xpath CSS Selector name Class Name tag Name Link Text Partial Link Text
		  
		  //Web browser Invoke 
		  System.setProperty("webdriver.chrome.driver","C:/Users/Prem Sindhu/Desktop/ChromeDriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(75, TimeUnit.SECONDS);
		driver.get("http://ec2-3-144-136-111.us-east-2.compute.amazonaws.com:7002/PASJava/index.html");
		driver.manage().window().maximize();
		
		// Login 
		driver.findElement(By.id("userName")).sendKeys("prem");
		driver.findElement(By.id("password")).sendKeys("prem");
		driver.findElement(By.id("submit")).click();
		
		//Drop down selection client 
	    driver.findElement(By.id("oj-select-choice-Menu_CreateNew")).click();
	    driver.findElement(By.className("oj-listbox-input")).sendKeys("client");
	    driver.findElement(By.xpath("//div[@aria-label=\'Client']")).click();
	    driver.findElement(By.xpath("//span[@class=\"oj-button-icon oj-start oj-fwk-icon-caret-end oj-fwk-icon\"]")).click();
	    
	    //Client Creation
	    
	    driver.findElement(By.id("oj-select-choice-legalResidence")).click();
	    driver.findElement(By.className("oj-listbox-input")).sendKeys("South Africa");
	    driver.findElement(By.xpath("//div[@aria-label=\'South Africa']")).click();
	    driver.findElement(By.id("FirstName")).sendKeys("Ayesha");
	    driver.findElement(By.id("LastName")).sendKeys("Thakur");
	    driver.findElement(By.id("Sex_02")).click();
	    driver.findElement(By.id("oj-select-choice-MaritalStatus")).click();
	    driver.findElement(By.className("oj-listbox-input")).sendKeys("Single");
	    driver.findElement(By.xpath("//div[@aria-label=\'Single']")).click();
	    driver.findElement(By.id("TaxID")).sendKeys("439879");
	    driver.findElement(By.id("oj-select-choice-BirthCountryCode")).click();
	    driver.findElement(By.className("oj-listbox-input")).sendKeys("South Africa");
	    driver.findElement(By.xpath("//div[@aria-label='South Africa']")).click();
	    driver.findElement(By.id("oj-select-choice-CitizenshipCountryCode")).click();
	    driver.findElement(By.xpath("//input[@aria-labelledby='oj-select-label-CitizenshipCountryCode']")).sendKeys("South Africa");
	    driver.findElement(By.xpath("//div[@aria-label='South Africa']")).click();
	    driver.findElement(By.id("bottomSave")).click();    
	    
	    //tagname.classname is CSS Selector 
	    //tagname#id is CSS selector -> input#id
	    //tagname[attribute = 'value']is css selector when it does not have id or Class name
	    
		
}
}
