package com.ICTAK.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ICTAK.TestBase.TestBase;

public class AdminAllStudentsDelete extends TestBase {
	

	 /** 
	  * All WebElements are identified by @FindBy annotation
*/
WebDriver driver;

@FindBy(xpath="//a[@routerlink='home']")
private WebElement home;
@FindBy(xpath="//a[@href='/students']")
private WebElement students;
@FindBy(id="listSearch")
private WebElement listSearch;
@FindBy(xpath="/html/body/app-root/app-students/div/ul/li/div/div[2]/button[1]")
private WebElement  Delete;

public AdminAllStudentsDelete(WebDriver driver){
    this.driver = driver;
    //This initElements method will create all WebElements
    PageFactory.initElements(driver, this);
}
public void clickhome() {
	home.click();
}

public void clickstudents() {
	students.click();
}

public void setlistSearch(String strlistSearch) {
	listSearch.sendKeys(strlistSearch);
}

public void clickDelete() {
	 Delete.click();
}

}
