package com.ICTAK.scripts;

import com.ICTAK.TestBase.TestBase;
import com.ICTAK.constants.AutomationConstants;
import com.ICTAK.pages.AdminAllStudents;
import com.ICTAK.pages.AdminAllStudentsDelete;
import com.ICTAK.pages.AdminEmployeeApproval;
//import com.ICTAK.pages.AdminEmployeeEdit;
import com.ICTAK.pages.AdminLogOut;
import com.ICTAK.pages.AdminLoginPage;
import com.ICTAK.pages.AdminLoginUsingInvalidPwd;
import com.ICTAK.pages.AdminSearch;
//import com.ICTAK.pages.HomePageCourses;
//import com.ICTAK.pages.HomePageGothrough;
import com.ICTAK.utilities.ExcelUtility;


import org.testng.Assert;
import org.testng.annotations.Test;


public class TestClass extends TestBase{
	
	
	//HomePageGothrough objGothrough;
	AdminLoginPage objLogin;
	AdminAllStudents objstudents;
	AdminAllStudentsDelete objstuddel;
	AdminEmployeeApproval objapprove;
	
	AdminSearch objsearch;
	AdminLogOut objlogout;
	AdminLoginUsingInvalidPwd objilogin;
	//AdminEmployeeEdit objedit;
	
	
	
	@Test(priority=1)
	public void VerifyAdminLoginPage() throws Exception {
		
		//create AdminLoginPage object
		objLogin=new AdminLoginPage(driver);
		
		objLogin.clicklogin();
		Thread.sleep(1000);
		
		String Email=ExcelUtility.getCellData(0,0);
		String Password=ExcelUtility.getCellData(0,1);
		String Role=ExcelUtility.getCellData(0,2);
	    objLogin.setEmail(Email);
	    Thread.sleep(1000);
	    objLogin.setPassword(Password);
	    Thread.sleep(500);
	    objLogin.setRole(Role);
	    Thread.sleep(500);
	    objLogin.clickSignIn();
	    Thread.sleep(500);
	    objLogin.getAlertText();
	    Thread.sleep(500);
	    objLogin.alertOK();
	    Thread.sleep(1000);
	    
	    String expectedTitle =AutomationConstants.HOMEPAGETITLE;
	    String actualTitle =driver.getTitle();
	    Assert.assertEquals(expectedTitle,actualTitle);
	}
	
	@Test(priority=2)
	public void VerifyAdminAllStudents() throws Exception {
		//create AdminAllStudents object
		objstudents=new AdminAllStudents(driver);
		driver.manage().window().maximize();
		objstudents.clickstudents();
		
		 String listSearch=ExcelUtility.getCellData(0,3);
		objstudents.setlistSearch(listSearch);
		Thread.sleep(1000);
		objstudents.clickShowDetails();
		Thread.sleep(500);
		
		
		String expectedTitle =AutomationConstants.HOMEPAGETITLE;
	    String actualTitle =driver.getTitle();
	    Assert.assertEquals(expectedTitle,actualTitle);
	
		
	}
	@Test(priority=3)
	public void VerifyAdminAllStudentsDelete() throws InterruptedException, Exception {
		 
		objstuddel=new AdminAllStudentsDelete(driver);
		objstuddel.clickhome();
		Thread.sleep(500);
		objstuddel.clickstudents();
		
		String listSearch=ExcelUtility.getCellData(0,4);
		objstuddel.setlistSearch(listSearch);
		
		objstuddel.clickDelete();
		Thread.sleep(500);
		
	}
  
	
	
	@Test(priority=4)
	public void VerifyAdminSearch() throws Exception {
		objsearch=new AdminSearch(driver);
		
		objsearch.clicksearch();
		driver.manage().window().maximize();
		   
		Thread.sleep(1000);
		String listSearch=ExcelUtility.getCellData(0,6);
		objsearch.setlistSearch(listSearch);
		Thread.sleep(2000);
	}
	@Test(priority=5)
	public void VerifyAdminLogOut() throws Exception {
		
		objlogout=new AdminLogOut(driver);
		objlogout.clickLogout();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		   
	}
	
	@Test(priority=6)
	public void VerifyAdminLoginUsingInvalidPwd() throws Exception {
		
		//create AdminLoginPage object
		objilogin=new AdminLoginUsingInvalidPwd(driver);
		
		objilogin.clicklogin();
		 driver.manage().window().maximize();
		Thread.sleep(1000);
		
		String Email=ExcelUtility.getCellData(1,0);
		String Password=ExcelUtility.getCellData(1,1);
		String Role=ExcelUtility.getCellData(1,2);
		
		String Email1=ExcelUtility.getCellData(0,0);
		String Password1=ExcelUtility.getCellData(0,1);
		String Role1=ExcelUtility.getCellData(0,2);
		
	    objilogin.setEmail(Email);
	    Thread.sleep(1000);
	    objilogin.setPassword(Password);
	    Thread.sleep(500);
	    objilogin.setRole(Role);
	    Thread.sleep(500);
	    objilogin.clickSignIn();
	    Thread.sleep(500);
	    objilogin.getAlertText();
	    Thread.sleep(500);
	    objilogin.alertOK();
	    Thread.sleep(2000);
	    driver.manage().window().maximize();
	    Thread.sleep(1000);
	    
	    objilogin.clear();
	    //then login with valid credentials
	    objilogin.setEmail(Email1);
	    Thread.sleep(1000);
	    objilogin.setPassword(Password1);
	    Thread.sleep(500);
	    objilogin.setRole(Role1);
	    Thread.sleep(500);
	    objilogin.clickSignIn();
	    Thread.sleep(500);
	    objilogin.getAlertText();
	    Thread.sleep(500);
	    objilogin.alertOK();
	    Thread.sleep(2000);
	    
		   
	    
	    String expectedTitle =AutomationConstants.HOMEPAGETITLE;
	    String actualTitle =driver.getTitle();
	    Assert.assertEquals(expectedTitle,actualTitle);
	}
	
	

		   
		   
	
}
