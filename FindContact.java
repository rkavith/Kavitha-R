package Selenium.week1.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindContact {
public static void main(String[] args) throws InterruptedException {
	//Webdriver for interacting with browser- chrome specific
	WebDriverManager.chromedriver().setup();
	
	ChromeDriver driver = new ChromeDriver();
	driver.get("http://leaftaps.com/opentaps/control/login");
	driver.manage().window().maximize();
	driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
	driver.findElement(By.id("password")).sendKeys("crmsfa");
	driver.findElement(By.className("decorativeSubmit")).click();
	driver.findElement(By.partialLinkText("CRM/SFA")).click();
	driver.findElement(By.xpath("//a[@href='/crmsfa/control/contactsMain']")).click();
	driver.findElement(By.xpath("//a[@href='/crmsfa/control/findContacts']")).click();
	driver.findElement(By.xpath("//span[text()='Email']")).click();
	driver.findElement(By.name("emailAddress")).sendKeys("babu@testleaf.com");
	driver.findElement(By.id("ext-gen212")).click();
	driver.close();
	
	
}
}
