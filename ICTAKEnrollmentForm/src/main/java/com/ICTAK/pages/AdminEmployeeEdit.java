package com.ICTAK.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ICTAK.TestBase.TestBase;



public class AdminEmployeeEdit extends TestBase {
	

	 /** 
	  * All WebElements are identified by @FindBy annotation
 */
      WebDriver driver;

	//locating elements
	@FindBy(xpath="//a[@href='/employees']")
	 private WebElement employees;
	 @FindBy(xpath="/html/body/app-root/app-employees/div/ul[211]/li/div[2]/button[1]")
	 private WebElement Edit;
	 @FindBy(xpath="/html/body/app-root/app-update-employee/div/div/form/div/div[2]/input")
	 private WebElement email;
	 @FindBy(xpath="/html/body/app-root/app-update-employee/div/div/form/div/div[4]/button")
	 private WebElement Update;
	 

	 public AdminEmployeeEdit(WebDriver driver){
	     this.driver = driver;
	     //This initElements method will create all WebElements
	     PageFactory.initElements(driver, this);
	 }
	 public void clickemployees() {
			employees.click();
		}
		public void clickEdit() {
			Edit.click();
		}
		public void setEmail(String strEmail) {
			email.clear();
			email.sendKeys(strEmail);
		}
		public void clickUpdate() {
			Update.click();
		}
	 
		 
}
