package Page1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Naveen {
	WebDriver driver;
	By myaccount=By.xpath("/html/body/nav/div/div[2]/ul/li[2]/a/span[1]");
	By register=By.xpath("/html/body/nav/div/div[2]/ul/li[2]/ul/li[1]/a");
	By fstname=By.xpath("//*[@id=\"input-firstname\"]");
	By lstname=By.xpath("//*[@id=\"input-lastname\"]");
	By email=By.xpath("/html/body/div[2]/div/div/form/fieldset[1]/div[4]/div/input");
	By phonenumber=By.xpath("//*[@id=\"input-telephone\"]");
	By passwrd=By.xpath("//*[@id=\"input-password\"]");
	By confpass=By.xpath("//*[@id=\"input-confirm\"]");
	By checked=By.xpath("//*[@id=\"content\"]/form/div/div/input[1]");
	By cont=By.xpath("//*[@id=\"content\"]/form/div/div/input[2]");
	By cont2=By.xpath("//*[@id=\"content\"]/div/div/a");
	By myaccount2=By.xpath("/html/body/nav/div/div[2]/ul/li[2]/a/span[1]");
	By logout=By.xpath("/html/body/nav/div/div[2]/ul/li[2]/ul/li[5]/a");

	
	public Naveen(WebDriver driver) {
		this.driver=driver;
		// TODO Auto-generated constructor stub
	}
	public void myaccount()
	{
		driver.findElement(myaccount).click();
	}
	public void register()
	{
		driver.findElement(register).click();
	}
	public void firstname(String fname,String lname)
	{
		driver.findElement(fstname).sendKeys(fname);
		driver.findElement(lstname).sendKeys(lname);
	}
	public void emailid(String e)
	{
		driver.findElement(email).sendKeys(e);
	}
	public void phone(String ph)
	{
		driver.findElement(phonenumber).sendKeys(ph);
	}
	public void password(String pass,String pass2)
	{
		driver.findElement(passwrd).sendKeys(pass);
		driver.findElement(confpass).sendKeys(pass2);
	}
	public void agree()
	{
		driver.findElement(checked).click();
	}
	public void contnue()
	{
		driver.findElement(cont).click();
		driver.findElement(cont2).click();
	}
	public void account()
	{
		driver.findElement(myaccount2).click();
		driver.findElement(logout).click();
	}

}
