package com.ICTAK.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ICTAK.TestBase.TestBase;

public class HomePageCourses extends TestBase{
	
	WebDriver driver;
	
	/**
	All WebElements are identified By @FindBy annotation
	 
	 */
	//locating elements
	@FindBy(xpath="//a[@href='/home']")
	private WebElement home1;
	@FindBy(xpath="//a[@href='/courses']")
	private WebElement courses;
	@FindBy(xpath="//div[@class='team-hover']")
	private WebElement scroll;
	@FindBy(xpath="//a[contains(text(),'Know More')]")
	private WebElement KnowMore;
	@FindBy(xpath="//a[@href='/home']")
	private WebElement home;
	
	//Initialize constructor and passing driver
	
	public HomePageCourses(WebDriver driver){
	      this.driver = driver;
	      //This initElements method will create all WebElements
	      PageFactory.initElements(driver, this);
	  }
	  
	public void clickhome1() {
		home.click();
	}

	//clicking courses button
	public void clickCourses() {
		courses.click();
	}
	//setting scroll for clicking knowmore button 
public void clickScroll() {
	 Actions action=new Actions(driver);
	 action.moveToElement(scroll).perform();
	 scroll.click();
}
//clicking knowmore button
public void clickKnowMore() {
	 KnowMore.click();
}
//clicking home button for return to home page
public void clickhome() {
	home.click();
}


}
