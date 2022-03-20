package com.ICTAK.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ICTAK.TestBase.TestBase;

public class AdminAllStudents extends TestBase {
	

	 /** 
	  * All WebElements are identified by @FindBy annotation
 */
WebDriver driver;

@FindBy(xpath="//a[@href='/students']")
private WebElement students;
@FindBy(id="listSearch")
private WebElement listSearch;
@FindBy(xpath="//button[text()='Show Details']")
private WebElement ShowDetails;

public AdminAllStudents(WebDriver driver){
    this.driver = driver;
    //This initElements method will create all WebElements
    PageFactory.initElements(driver, this);
}

//clicking  all students button
public void clickstudents() {
	students.click();
}

//setting the textbox for searching
public void setlistSearch(String strlistSearch) {
	listSearch.sendKeys(strlistSearch);
}
//clicking  show details button
public void  clickShowDetails() {
	ShowDetails.click();
}



}
