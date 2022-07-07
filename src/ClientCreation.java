import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClientCreation {
	public static void main(String[] args) throws Exception {
	
	// Locators - Address on HTML page 
	// ID Xpath CSS Selector name Class Name tag Name Link Text Partial Link Text
		  
		  //Web browser Invoke 
		  System.setProperty("webdriver.chrome.driver","C:/Users/Prem Sindhu/Desktop/ChromeDriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.get("http://ec2-3-144-136-111.us-east-2.compute.amazonaws.com:7002/PASJava/index.html");
		driver.manage().window().maximize();
		
		// Login 
		driver.findElement(By.id("userName")).sendKeys("prem");
		driver.findElement(By.id("password")).sendKeys("prem");
		driver.findElement(By.id("submit")).click();
		
		//Drop down selection client 
	    driver.findElement(By.id("oj-select-choice-Menu_CreateNew")).click();
	    driver.findElement(By.className("oj-listbox-input")).sendKeys("client");
	    try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	    driver.findElement(By.xpath("//div[@aria-label=\'Client']")).click();
	    driver.findElement(By.xpath("//span[@class=\"oj-button-icon oj-start oj-fwk-icon-caret-end oj-fwk-icon\"]")).click();
	    
	    //Client Creation
	    try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	    driver.findElement(By.id("oj-select-choice-legalResidence")).click();
	    driver.findElement(By.className("oj-listbox-input")).sendKeys("South Africa");
	    driver.findElement(By.xpath("//div[@aria-label=\'South Africa']")).click();
	    try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	    driver.findElement(By.id("FirstName")).sendKeys("Kareena");
	    try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	    driver.findElement(By.id("LastName")).sendKeys("Kapoor");
	    try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	    driver.findElement(By.id("Sex_02")).click();
	    try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	    driver.findElement(By.id("oj-select-choice-MaritalStatus")).click();
	    driver.findElement(By.className("oj-listbox-input")).sendKeys("Single");
	    driver.findElement(By.xpath("//div[@aria-label=\'Single']")).click();
	    try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	    Calendar calendar = Calendar.getInstance();
	    String DateofBirth = "06-07-1993";
	    SimpleDateFormat DateofBirth1 = new SimpleDateFormat("mm-dd-yyyy");
	  try {
		Date formatteddob = DateofBirth1.parse(DateofBirth);
		calendar.setTime(formatteddob);
		int targetDay = calendar.get(Calendar.DAY_OF_MONTH);
		int targetMonth = calendar.get(Calendar.MONTH);
		int targetYear = calendar.get(Calendar.YEAR);
		driver.findElement(By.id("DateOfBirth")).sendKeys("06/07/1993");
	} catch (ParseException e1) {
		// TODO Auto-generated catch block
		throw new Exception("Invalid date is provided, please check input date");
	}
	  try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		  
	    driver.findElement(By.id("TaxID")).sendKeys("458987");
	    try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	    driver.findElement(By.id("oj-select-choice-BirthCountryCode")).click();
	    driver.findElement(By.className("oj-listbox-input")).sendKeys("South Africa");
	    driver.findElement(By.xpath("//div[@aria-label='South Africa']")).click();
	    try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	    driver.findElement(By.id("oj-select-choice-CitizenshipCountryCode")).click();
	    driver.findElement(By.xpath("//input[@aria-labelledby='oj-select-label-CitizenshipCountryCode']")).sendKeys("South Africa");
	    driver.findElement(By.xpath("//div[@aria-label='South Africa']")).click();
	    try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	    driver.findElement(By.id("bottomSave")).click();    
	    
	   
		
}

	//public static void sendKeys(WebDriver driver, WebElement element, int timeout, String value)
	//{
		 //  new WebDriverWait(driver, timeout).
		  // until(ExpectedConditions.visibilityOf(element));
		   //element.sendKeys(value);
	   //}

	
}
