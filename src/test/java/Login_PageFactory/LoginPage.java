package Login_PageFactory;

import java.time.Duration;
import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="/html/body/header/nav/ul/li[4]/span")
	WebElement loginIcon;
	
	@FindBy(xpath="//*[@id=\"si_popup_email\"]")
	WebElement loginname;
	
	@FindBy(id="si_popup_passwd")
	WebElement password;
	
	@FindBy(xpath="//button[contains(text(),'Login')]")
	WebElement loginbutton;
	
	@FindBy(id="passwdErrorr")
	WebElement greeting;
	
	@FindBy(xpath="/html/body/div[6]/div/div/div[2]/div[3]/form/div[2]/span")
	WebElement frgtpass;
	
	@FindBy(xpath="//*[@id=\"forgot_email_new\"]")
	WebElement frgtemail;
	
	@FindBy(xpath="//span[@id=\"recaptcha-anchor\"]")
	WebElement captcha;
	@FindBy(xpath="//button[contains(text(),'Send Code')]")
	//*[@id=\"forgotpasswordForm\"]/button
	WebElement code;
	
	@FindBy(xpath="/html/body/div[6]/div/div/div[2]/div[5]/form/div[1]/input[1]")
	WebElement vercode;
	
	@FindBy(xpath="/html/body/div[6]/div/div/div[2]/div[5]/form/div[2]/input")
	WebElement NewPass;
	
	@FindBy(xpath="/html/body/div[6]/div/div/div[2]/div[5]/form/button")
	WebElement resetPassbtn;
	
	public void login_icon() {
		loginIcon.click();
		
	}
	public void Enterloginname(String email) {
		loginname.sendKeys(email);
		
	}
	public void Enterpassword(String int1) {
		password.sendKeys(int1);
		
	}
	public void clickLoginButton() {
		loginbutton.click();
		
	}
	public void GetMsg() {
		greeting.getAttribute("class");
	}
	public void forgetpassword() {
		frgtpass.click();
	}
	public void forgetemail(String email) {
		frgtemail.sendKeys(email);
	}
	public void EnterCaptcha() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		captcha.click();
      }
	public void sendcode() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		code.click();
	}
	public void getVercode() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter code");
		String ver=sc.next();
		vercode.sendKeys(ver);
	}
	public void setpass(String newpass) {
		NewPass.sendKeys(newpass);
	}
	public void clickResetPassbtn() {
		resetPassbtn.click();
	}
	 
}
