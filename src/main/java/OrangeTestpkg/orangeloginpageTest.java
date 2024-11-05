package OrangeTestpkg;


import org.testng.Assert;
import org.testng.annotations.Test;

import OrangeBasepkg.OrangeBaseclass;
import OrangePagepkg.Orangeloginpage;

import utilities.OrangeExcelutils;


public class orangeloginpageTest extends OrangeBaseclass {


@Test
public void login()
{
	Orangeloginpage p1=new Orangeloginpage(driver);
	String xl="C:\\Users\\ATHIRA\\OneDrive\\Desktop\\OrangeHRM1.xlsx";
String sheet= "sheet1";
int rowcount=OrangeExcelutils.getRowCount(xl,sheet);
for(int i=1; i<=rowcount;i++) {
	String Username =OrangeExcelutils.getCellValue(xl,sheet,i,0);
	String Password =OrangeExcelutils.getCellValue(xl,sheet,i,1);
	System.out.println("Attempting login with Username: " + Username + " and Password: " + Password);
	
	p1.loginpage(Username, Password);
	
	try {
        Thread.sleep(2000); 
	}
        catch (Exception e) {
        e.printStackTrace();
    }
	
	
	String dashboardText = p1.Clickdashboard();
    System.out.println("Dashboard Header: " + dashboardText);
    Assert.assertNotNull(dashboardText, "Dashboard text is null, login may have failed.");
	p1.clickAdmin();
	p1.clickRecruitment();
	p1.logout();
	
}
 
}
}
