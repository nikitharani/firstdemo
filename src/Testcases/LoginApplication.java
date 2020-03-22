package Testcases;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;

import Objectrepository.Guru99Loginpage;
import Objectrepository.Managerpage;

public class LoginApplication {
@Test
public void login()
{
	System.setProperty("webdriver.chrome.driver","C:\\nikitha\\Java project\\selenium\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://demo.guru99.com/V1/");
	


Guru99Loginpage obj1=new Guru99Loginpage(driver);
obj1.emailId().sendKeys("mngr250027");
obj1.password().sendKeys("adEmUvE");
obj1.log().click();

	Managerpage obj2=new Managerpage(driver);
	obj2.newcustomer().click();
	obj2.customerName().sendKeys("Nikitha");
	obj2.city().sendKeys("Birmingham");
	obj2.state().sendKeys("WestMidlands");
	obj2.pinNO().sendKeys("900000");
	obj2.tele().sendKeys("07776217748");
	
	
}




}
