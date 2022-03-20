package com.ICTAK.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ICTAK.TestBase.TestBase;

public class AdminSearch extends TestBase {
	
	/** 
	  * All WebElements are identified by @FindBy annotation
*/
   WebDriver driver;

  @FindBy(xpath="//a[@href='/search']")
  private WebElement search;
  @FindBy(id="listSearch")
  private WebElement listSearch;

   public AdminSearch(WebDriver driver){
   this.driver = driver;
   //This initElements method will create all WebElements
  PageFactory.initElements(driver, this);
  }
   
public void clicksearch() {
	search.click();
}

public void setlistSearch(String strlistSearch) {
	listSearch.sendKeys(strlistSearch);
}


}
