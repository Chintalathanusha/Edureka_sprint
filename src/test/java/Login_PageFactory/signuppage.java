package Login_PageFactory;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class signuppage {
	WebDriver driver;
	public signuppage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//span[@class='signup_click signup-vd giTrackElementHeader ']")
	WebElement signupIcon;
	
	@FindBy(xpath="/html/body/div[6]/div/div/div[2]/div[1]/form/div[1]/input")
	WebElement email;
	
	@FindBy(xpath="/html/body/div[6]/div/div/div[2]/div[1]/form/div[2]/input")
	WebElement mobile;
	
	@FindBy(xpath="//button[contains(text(),'Sign Up')]")
	WebElement signupbutton;
	@FindBy(xpath="//input[@class='control_place pwd2_new']")
	WebElement pass;
	@FindBy(xpath="//button[contains(text(),'Start Learning')]")
	WebElement newSignup;
//	@FindBy(xpath="//button[contains(text(),'Start Learning')]")
//	WebElement start;
	public void signup() {
		signupIcon.click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	public void EnterEmail(String e) {
		email.sendKeys(e);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	public void EntermobNo(String m) {
		mobile.sendKeys(m);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	public void signupButton() {
		signupbutton.click();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	}
	public void createPass(String p) {
		pass.sendKeys(p);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	public void newSignupButton() {
		newSignup.click();
	}
	
}
