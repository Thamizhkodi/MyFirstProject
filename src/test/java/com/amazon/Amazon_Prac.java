package com.amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_Prac {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\thami\\Java_Practice\\Selenium\\Chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		WebElement sn = driver.findElement(By.xpath("//span[text()='Account & Lists']"));
		sn.click();
		WebElement create = driver.findElement(By.xpath("//a[normalize-space()='Create your Amazon account']"));
		create.click();
		WebElement name = driver.findElement(By.name("customerName"));
		name.sendKeys("thamizh");
		WebElement mobile = driver.findElement(By.xpath("//input[@placeholder='Mobile number']"));
		mobile.sendKeys("9786879065");
		WebElement mail = driver.findElement(By.id("ap_email"));
	mail.sendKeys("thamizhkodi@gmail.com");
	WebElement pwd = driver.findElement(By.name("password"));
	pwd.sendKeys("Thamizh@23");
	WebElement verify = driver.findElement(By.xpath("//input[@type='submit']"));
	verify.click();
	}

}
