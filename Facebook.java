package Selenium.week1.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {
public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver= new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a [text()='Create New Account']")).click();
	Thread.sleep(2000);
	//Whenever we interact with a new drop down, a select 
	//object should be created and to pass args, we need webelement defined abive it
	WebElement day = driver.findElement(By.name("birthday_day"));
	Select first_dropdown = new Select(day);
	first_dropdown.selectByVisibleText("9");
	WebElement month = driver.findElement(By.name("birthday_month"));
	Select second_dropdown= new Select(month);
	second_dropdown.selectByValue("5");
	WebElement year = driver.findElement(By.name("birthday_year"));
	Select third_dropdown = new Select(year);
	third_dropdown.selectByValue("2000");
	driver.findElement(By.name("sex")).click();
	driver.findElement(By.name("firstname")).sendKeys("Kavitha");
	driver.findElement(By.name("lastname")).sendKeys("R");
	driver.findElement(By.name("reg_email__")).sendKeys("kavitha@gmail.com");
	driver.findElement(By.name("reg_email_confirmation__")).sendKeys("kavitha@gmail.com");
	driver.findElement(By.id("password_step_input")).sendKeys("testtest");
	driver.findElement(By.name("websubmit")).click();
	
	
	
}
}
