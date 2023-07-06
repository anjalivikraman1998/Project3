package Test1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Page1.Naveen;

public class NaveenTest {
	WebDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/");
		}
	@Test
	public void testing() throws InterruptedException
	{
		Naveen ob=new Naveen(driver);
		ob.myaccount();
		Thread.sleep(3000);
		ob.register();
		Thread.sleep(3000);
		ob.firstname("Anjali", "M V");
		Thread.sleep(3000);
		ob.emailid("anjalivikraman413@gmail.com");
		Thread.sleep(3000);
		ob.phone("8125467454");
		Thread.sleep(3000);
		ob.password("@anju123","@anju123");
		Thread.sleep(3000);
		ob.agree();
		Thread.sleep(3000);
		ob.contnue();
		Thread.sleep(3000);
		ob.account();
		
		
	}
}
