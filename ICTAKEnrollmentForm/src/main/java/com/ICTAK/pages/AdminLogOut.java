package com.ICTAK.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ICTAK.TestBase.TestBase;

public class AdminLogOut extends TestBase{
	
	
	/** 
	  * All WebElements are identified by @FindBy annotation
*/
WebDriver driver;


@FindBy(xpath="/html/body/app-root/app-header/section[2]/div/div[2]/ul[1]/li[7]/a")
private WebElement Logout;


public AdminLogOut(WebDriver driver){
	 this.driver = driver;
	 //This initElements method will create all WebElements
	 PageFactory.initElements(driver, this);
	}

public void clickLogout() {
	Logout.click();
}


}
