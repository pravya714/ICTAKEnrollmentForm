package com.ICTAK.scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.ICTAK.TestBase.TestBase;
import com.ICTAK.constants.AutomationConstants;
import com.ICTAK.pages.AdminEmployeeApproval;
import com.ICTAK.pages.AdminEmployeeDelete;
import com.ICTAK.pages.AdminEmployeeEdit;
import com.ICTAK.pages.AdminEmployeeReject;
import com.ICTAK.pages.AdminLogOut;
import com.ICTAK.pages.AdminLoginPage;
import com.ICTAK.pages.HomePageCourses;
import com.ICTAK.utilities.ExcelUtility;

public class TestClass1 extends TestBase{
	
	AdminEmployeeEdit objedit;
	AdminLoginPage objLogin;
	AdminEmployeeApproval objapprove;
	AdminLogOut objlogout;
	AdminEmployeeReject objereject;
	AdminEmployeeDelete objedelete;
	HomePageCourses objCourses;
	
	@Test(priority=7)
	public void VerifyAdminEmployeeEdit() throws Throwable {
		objedit=new AdminEmployeeEdit(driver);
		
		 String email=ExcelUtility.getCellData(0,5);
		 
		    objedit.clickemployees();
		    Thread.sleep(1000);
		   
		  //  driver.manage().window().fullscreen();
		   
		    
		    Thread.sleep(500);
		    objedit.clickEdit();
		    Thread.sleep(2000);
		    objedit.setEmail(email);
		    Thread.sleep(2000);
		    objedit.clickUpdate();
		    Thread.sleep(1000);
		   
		    
		    String expectedTitle =AutomationConstants.HOMEPAGETITLE;
		    String actualTitle =driver.getTitle();
		    Assert.assertEquals(expectedTitle,actualTitle);
	}	
	
	
	 @Test(priority=8)
		public void VerifyAdminEmployeeApproval() throws Throwable {
			
			objapprove= new AdminEmployeeApproval(driver);
			objapprove.clickhome();
			Thread.sleep(2000);
			objapprove.clickEmployeeApproval();
			Thread.sleep(500);
			driver.manage().window().fullscreen();
			objapprove.clickApprove();
			objapprove.getAlertText();
			objapprove.alertOK();
			


}
	 @Test(priority=9)
		public void VerifyAdminLogOut3() throws Exception {
			
			objlogout=new AdminLogOut(driver);
			objlogout.clickLogout();
			Thread.sleep(2000);
			driver.manage().window().maximize();
			Thread.sleep(1000);
			   
		}
	 @Test(priority=10)
		public void VerifyAdminLoginPage2() throws Exception {
			
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

	 @Test(priority=11)
	 public void VerifyAdminEmployeeReject() throws Exception {
		 
		 objereject=new AdminEmployeeReject(driver);
		 
		 objereject.clickEmployeeApproval();
		 Thread.sleep(1000);
		 objereject.clickReject();
		 objereject.getAlertText();
		 objereject.alertOK();
		 
		 
		 
	 }
	 @Test(priority=12)
	 public void VerifyAdminEmployeeDelete() throws Exception {
		 objedelete=new AdminEmployeeDelete(driver);
		 
		 objedelete.clickhome();
		 Thread.sleep(1000);
		 objedelete.clickemployees();
		 Thread.sleep(500);
		 objedelete.clickDelete();
		 objedelete.getAlertText1();
		 objedelete.alertOK1();
		 
	 }
	 @Test(priority=13)
		public void VerifyAdminLogOut4() throws Exception {
			
			objlogout=new AdminLogOut(driver);
			objlogout.clickLogout();
			Thread.sleep(2000);
			driver.manage().window().maximize();
			Thread.sleep(1000);
			   
		}
	 @Test(priority=14)
		public void VerifyHomePageCourses() throws Throwable {
			
			//create HomePageCourse object
			objCourses=new HomePageCourses(driver);
			objCourses.clickhome1();
			Thread.sleep(1000);
			
			objCourses.clickCourses();
			Thread.sleep(1000);
			objCourses.clickScroll();
			Thread.sleep(1000);
			
			
			objCourses.clickKnowMore();
			Thread.sleep(500);
			objCourses.clickhome();
			
			String expectedTitle =AutomationConstants.HOMEPAGETITLE;
		    String actualTitle =driver.getTitle();
		    Assert.assertEquals(expectedTitle,actualTitle);
		}

	 
}
