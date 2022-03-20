package com.ICTAK.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ICTAK.TestBase.TestBase;

public class AdminEmployeeApproval extends TestBase {
	
	 /** 
	  * All WebElements are identified by @FindBy annotation
*/
WebDriver driver;

@FindBy(xpath="//a[@routerlink='home']")
private WebElement home;

@FindBy(xpath="//a[@href='/employee-approval']")
private WebElement EmployeeApproval;
@FindBy(xpath="//div[@class='page']/ul[236]//descendant::button[1]")
private WebElement Approve;

public AdminEmployeeApproval(WebDriver driver){
    this.driver = driver;
    //This initElements method will create all WebElements
    PageFactory.initElements(driver, this);
}
    
public void clickhome() {
	home.click();
}
   public void clickEmployeeApproval() {
	EmployeeApproval.click();
    }
   
	public void clickApprove() {
		Approve.click();
	}
	
    public String getAlertText() throws Exception {
    	Thread.sleep(1000);
    	Alert alert=driver.switchTo().alert();
    	String alertText=alert.getText();
    	return alertText;
    }
    public void alertOK() {
    	Alert alert=driver.switchTo().alert();
    	alert.accept();
    }
   
}
