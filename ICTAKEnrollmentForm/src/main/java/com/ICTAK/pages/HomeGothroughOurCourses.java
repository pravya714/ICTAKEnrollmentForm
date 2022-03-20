package com.ICTAK.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ICTAK.TestBase.TestBase;

public class HomeGothroughOurCourses extends TestBase {
	
WebDriver driver;
	
	//locating elements
 @FindBy(xpath="//*[@id=\"home\"]/div/div/div/div/div/div/a")
 private WebElement Gothroughourcourses;
 @FindBy(xpath="//div[@class='team-hover']")
 private WebElement scroll;
 @FindBy(xpath="//a[contains(text(),'Know More')]")
 private WebElement KnowMore;

 public HomeGothroughOurCourses(WebDriver driver){
      this.driver = driver;
      //This initElements method will create all WebElements
      PageFactory.initElements(driver, this);
  }
 //clicking go through our courses button
 public void clickGothroughourcourses() {
	Gothroughourcourses.click();
 }
 //setting scrolling for clicking knowmore button from image
 public void clickScroll() {
	 Actions action=new Actions(driver);
	 action.moveToElement(scroll).perform();
	 scroll.click();
 }
 //clicking know more button
public void clickKnowMore() {
	 KnowMore.click();
}

}
