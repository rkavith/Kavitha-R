package Selenium.week1.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();//webdriver setup
		ChromeDriver driver= new ChromeDriver();// object instance for chromedriver; consructor 
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Leads')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Create Lead')]")).click();
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("Amz");
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Kavi");
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("R");		
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		driver.close();
			}

}
