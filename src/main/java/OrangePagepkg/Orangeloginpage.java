package OrangePagepkg;



import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;





public class Orangeloginpage {
WebDriver driver;

@FindBy(xpath="//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")
WebElement Loginbutton;
@FindBy(name="username")
WebElement Username;
@FindBy(name="password")
WebElement Pswd;
@FindBy(xpath="//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[1]/i")
List<WebElement> dashboardHeader;
@FindBy(xpath="//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a/span")
WebElement Admin;
@FindBy(xpath="//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[5]/a/span")
WebElement Recruitment;
@FindBy(xpath="//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[3]/ul/li/ul/li[4]/a")
WebElement LogoutButton;
public Orangeloginpage(WebDriver driver)
{
	this.driver=driver;
	
}
public void loginpage(String username,String Password)
{
	Username.sendKeys(username);
	Pswd.sendKeys(Password);
   Loginbutton.click();

}
public String Clickdashboard() {
    for (WebElement button : dashboardHeader) {
        button.click();
 
	 
 }
	return driver.getTitle();
}
public void clickAdmin() {
    Admin.click();
}

public void clickRecruitment() {
    Recruitment.click();
}


    
    public void logout() {
        LogoutButton.click();
}
}


    
     
    
    
    
    
    
    
    
    
    