package com.ICTAK.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.ICTAK.TestBase.TestBase;

public class AdminLoginUsingInvalidPwd extends TestBase {
	
	 /** 
	  * All WebElements are identified by @FindBy annotation
*/
WebDriver driver;

//locating elements
@FindBy(xpath="/html/body/app-root/app-header/section[2]/div/div[2]/ul[2]/li/button/a")
private WebElement  login;

@FindBy(name="email")
private WebElement email;
@FindBy(name="password")
private WebElement password;
@FindBy(name="role")
private WebElement role;

@FindBy(name="admin")
private WebElement admin;

@FindBy(name="sign-in")
private WebElement SignIn;


public AdminLoginUsingInvalidPwd(WebDriver driver){
   this.driver = driver;
   //This initElements method will create all WebElements
   PageFactory.initElements(driver, this);
}

//clicking login button
public void clicklogin() {
	  login.click();
}
//setting email
public void setEmail(String strEmail) {
	email.sendKeys(strEmail); 
}
//setting password
public void setPassword(String strPassword) {
	 password.sendKeys(strPassword);
}

//select admin from list

public void setRole(String strRole) {
role.click();
Select category=new Select(role);
category.selectByValue(strRole);

}

//clicking sign in button
public void clickSignIn(){
	 SignIn.click();
}
//setting alert box
public String getAlertText() throws Exception {
	 Thread.sleep(1000);
	 Alert alert=driver.switchTo().alert();
	 String alertText=alert.getText();
	 return alertText;
	 
}
//accepting alert
public void alertOK() {
	 Alert alert=driver.switchTo().alert();
	 alert.accept();
}
public void clear() {
	email.clear();
	password.clear();
}

}
