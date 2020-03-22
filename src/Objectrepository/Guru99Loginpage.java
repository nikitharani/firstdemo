package Objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Guru99Loginpage {
	WebDriver driver;

public Guru99Loginpage(WebDriver driver) {//CONSTRUCTOR
this.driver=driver;	// TODO Auto-generated constructor stub
}
By username=By.name("uid");
By password=By.name("password");
By login=By.name("btnLogin");


public WebElement emailId() {
	// TODO Auto-generated method stub
	return driver.findElement(username);
}
public WebElement password() {
	// TODO Auto-generated method stub
	return driver.findElement(password);
}
public WebElement log() {
	// TODO Auto-generated method stub
	return driver.findElement(login);
}

}
