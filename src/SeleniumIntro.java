import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Invoking Browser
		//chromedriver.exe -> Chrome browser (Third Party Driver File)
		//webdriver.chrome.driver -> Value of path 
		//geckodriver - firefox
		//msedgedriver - Edge browser
		System.setProperty("webdriver.chrome.driver","C:/Users/Prem Sindhu/Desktop/ChromeDriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://ec2-3-144-136-111.us-east-2.compute.amazonaws.com:7002/PASJava/index.html");
	    System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		
	
		
	}

}
