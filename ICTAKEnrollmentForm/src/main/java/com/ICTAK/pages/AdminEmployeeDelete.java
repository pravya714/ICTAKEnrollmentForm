package com.ICTAK.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ICTAK.TestBase.TestBase;

public class AdminEmployeeDelete extends TestBase{
	
	
	 /** 
	  * All WebElements are identified by @FindBy annotation
*/
WebDriver driver;


@FindBy(xpath="//a[@routerlink='home']")
private WebElement home;
@FindBy(xpath="//a[@href='/employees']")
private WebElement employees;
@FindBy(xpath="/html/body/app-root/app-employees/div/ul[13]/li/div[2]/button[2]")
private WebElement Delete;

public AdminEmployeeDelete(WebDriver driver){
    this.driver = driver;
    //This initElements method will create all WebElements
    PageFactory.initElements(driver, this);
}
	
public void clickhome() {
	home.click();
}
public void clickemployees() {
	employees.click();
}
 public void clickDelete() {
	 Delete.click();
 }
 public String getAlertText1() throws Exception {
	 Thread.sleep(1000);
	 Alert alert=driver.switchTo().alert();
	 String alertText=alert.getText();
	 return alertText;
	 
}
 
 public void alertOK1() {
	 Alert alert=driver.switchTo().alert();
	 alert.accept();
}
}
