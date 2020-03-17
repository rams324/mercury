package com.page;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MercuryTours_Register_page {
	WebDriver driver;
	By firstname=By.name("firstName");
	By lastname=By.name("lastName");
	By phonenumber=By.name("phone");
	By email=By.id("userName");
	By address=By.name("address1");
	By city=By.name("city");
	By state=By.name("state");
	By pincode=By.name("postalCode");
	By country=By.name("country");
	By username=By.id("email");
	By password=By.name("password");
	By confirm_password = By.name("confirmPassword");
	By submit=By.name("register");
	 public void url() {
		 System.setProperty("webdriver.chrome.driver","D:\\Selenium Jars\\Selenium Java\\Google Chrome Driver\\chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		 driver.get("https://www.google.com/");
		 System.out.println(driver.getTitle());
	 }
	 public void login() {
			driver.get("http://newtours.demoaut.com/index.php");
			driver.findElement(By.linkText("REGISTER")).click();//xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[2]/a")).click();
			System.out.println(driver.getTitle());
			
		}
	public void register() {
		driver.findElement(firstname).sendKeys("ram");
		driver.findElement(lastname).sendKeys("prasad");
		driver.findElement(phonenumber).sendKeys("7894652455");
		driver.findElement(email).sendKeys("ravimana74@gmail.com");
		driver.findElement(address).sendKeys("village road, 11 th cross road");
		driver.findElement(city).sendKeys("shollingnallure");
		driver.findElement(state).sendKeys("Tamilnadu");
		
		WebElement we=driver.findElement(country);
		Select sel=new Select(we);
		
         sel.selectByIndex(3);
		driver.findElement(username).sendKeys("ravimana74@gmail.com");
		driver.findElement(password).sendKeys("Mteja1998@");
		driver.findElement(confirm_password).sendKeys("Mteja1998@");
	}
	public void submit() {
		driver.findElement(submit).click();
	}

}
