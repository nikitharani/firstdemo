package Objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Managerpage {
	WebDriver driver;

	public Managerpage(WebDriver driver) {//CONSTRUCTOR
	this.driver=driver;	// TODO Auto-generated constructor stub
	}


	By newcustomer=By.linkText("New Customer");
	
	By customerName=By.name("name");
	
			By city=By.name("city");
	
					By state=By.name("state");

							By pinNO=By.name("pinno");
	
									By tele=By.name("telephoneno");
	//By submit=By.name("Submit");
	
	public WebElement newcustomer(){
		return driver.findElement(newcustomer);
	}
	public WebElement customerName(){
		return driver.findElement(customerName);
	}
	public WebElement city(){
		return driver.findElement(city);
	}
	public WebElement state(){
		return driver.findElement(state);
	}
	public WebElement pinNO(){
		return driver.findElement(pinNO);
}
	public WebElement tele(){
		return driver.findElement(tele);
	
	//public WebElement submit(){
		//return driver.findElement(submit);
	}
}
