package StepDefinitions;

import java.io.IOException;
import Login_PageFactory.signuppage;
import java.time.Duration;
import java.util.List;
import java.util.Map;
 
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Login_PageFactory.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login{

   WebDriver driver;
	

@Given("user on the home page")
public void user_on_the_home_page() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		driver = new EdgeDriver();
		driver.get("https://www.edureka.co/");
		//LoginPage l=new LoginPage(driver);
	}
@When("user click on signup")
public void user_click_on_signup() {
    // Write code here that turns the phrase above into concrete actions
    //throw new io.cucumber.java.PendingException();
	signuppage s=new signuppage(driver);
	s.signup();
}

@When("user enter email as {string}")
public void user_enter_email_as(String string) {
    // Write code here that turns the phrase above into concrete actions
    //throw new io.cucumber.java.PendingException();
	signuppage s=new signuppage(driver);
	s.EnterEmail(string);;
}

@When("user enter mobile number as {string}")
public void user_enter_mobile_number_as(String string) {
    // Write code here that turns the phrase above into concrete actions
    //throw new io.cucumber.java.PendingException();
	signuppage s=new signuppage(driver);
	s.EntermobNo(string);
}

@When("user click on the signup button")
public void user_click_on_the_signup_button() {
    // Write code here that turns the phrase above into concrete actions
    //throw new io.cucumber.java.PendingException();
	signuppage s=new signuppage(driver);
	s.signupButton();
}

@When("user create the password and click on startLearning button")
public void user_create_the_password_and_click_on_start_learning_button() {
    // Write code here that turns the phrase above into concrete actions
    //throw new io.cucumber.java.PendingException();
	signuppage s=new signuppage(driver);
	s.createPass("Bhindhu@");
}

@Then("user should be signup successfully")
public void user_should_be_signup_successfully() {
    // Write code here that turns the phrase above into concrete actions
    //throw new io.cucumber.java.PendingException();
	signuppage s=new signuppage(driver);
	s.newSignupButton();
}




	@When("user click on login1")
	public void user_click_on_login1() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		LoginPage l=new LoginPage(driver);
		l.login_icon();
		
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

	}

	@When("user enter valid login name as {string}")
	public void user_enter_valid_login_name_as(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		LoginPage l=new LoginPage(driver);
		l.Enterloginname(string);

	}

	@When("user enter valid password as {string}")
	public void user_enter_valid_password_as(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		LoginPage l=new LoginPage(driver);
		l.Enterpassword(string);
	}

	@When("user click on the login button")
	public void user_click_on_the_login_button()  {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		LoginPage l=new LoginPage(driver);
		l.clickLoginButton();
	}
	@Then("user should be logged in successfully")
	public void user_should_be_logged_in_successfully() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		

	}
	

	@When("user click on login2")
	public void user_click_on_login2() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		LoginPage l=new LoginPage(driver);
		l.login_icon();
		
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));


	}


	@When("user enter valid login name")
	public void user_enter_valid_login_name() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		LoginPage l=new LoginPage(driver);
		l.Enterloginname("chintaltanusha@gmail.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
	}

	@When("user enter invalid password")
	public void user_enter_invalid_password() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		LoginPage l=new LoginPage(driver);
		l.Enterpassword("thanusha");
		//driver.findElement(By.id("si_popup_passwd")).sendKeys("thanusha");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
	}

	@Then("user should see an error message indicating invalid credentials")
	public void user_should_see_an_error_message_indicating_invalid_credentials() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		LoginPage l=new LoginPage(driver);
		l.GetMsg();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
	}
	@When("user click on login5")
	public void user_click_on_login5() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		LoginPage l=new LoginPage(driver);
		l.login_icon();
		
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	@When("user enter invalid login name")
	public void user_enter_invalid_login_name() {
	    // Write code here that turns the phrase above into concrete actions
		LoginPage l=new LoginPage(driver);
		l.Enterloginname("chintalthanusha@gmail.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
	
	}
	@When("user enter valid password")
	public void user_enter_valid_password() {
	    // Write code here that turns the phrase above into concrete actions
		LoginPage l=new LoginPage(driver);
		l.Enterpassword("Thanusha@");
		//driver.findElement(By.id("si_popup_passwd")).sendKeys("thanusha");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
	}
	@Then("user should see an error message indicating invalid msg")
	public void user_should_see_an_error_message_indicating_invalid_msg() {
	    // Write code here that turns the phrase above into concrete actions
		LoginPage l=new LoginPage(driver);
		l.GetMsg();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
	}


//	@When("user click on login3")
//	public void user_click_on_login3() throws InterruptedException {
//	    // Write code here that turns the phrase above into concrete actions
//		LoginPage l=new LoginPage(driver);
//		l.login_icon();
//		
//       // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//	}
//
//	
//
//
//	@When("user click on the forget password button")
//	public void user_click_on_the_forget_password_button() {
//	    // Write code here that turns the phrase above into concrete actions
//	    //throw new io.cucumber.java.PendingException();
//		LoginPage l=new LoginPage(driver);
//		l.forgetpassword();
//		
//        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
//	}
//
//	@When("user enter my email address")
//	public void user_enter_my_email_address() throws InterruptedException {
//	    // Write code here that turns the phrase above into concrete actions
//	    //throw new io.cucumber.java.PendingException();
//		LoginPage l=new LoginPage(driver);
//		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
//		l.forgetemail("chintalatanusha@gmail.com");
//		
//		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
//		
//	}
//
//	@When("user click on send code")
//	public void user_click_on_send_code() {
//	    // Write code here that turns the phrase above into concrete actions
//	    //throw new io.cucumber.java.PendingException();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		LoginPage l=new LoginPage(driver);
//		l.EnterCaptcha();
//		l.sendcode();
//		
//        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
//	}
//
//	@When("user enter verification code and new password")
//	public void user_enter_verification_code_and_new_password() {
//	    // Write code here that turns the phrase above into concrete actions
//	   // throw new io.cucumber.java.PendingException();
//		LoginPage l=new LoginPage(driver);
//		l.getVercode();
//		l.setpass("Thanusha@");
//		
//     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
//		
//	}
//
//	@When("user click on reset password button")
//	public void user_click_on_reset_password_button() {
//	    // Write code here that turns the phrase above into concrete actions
//	    //throw new io.cucumber.java.PendingException();
//		LoginPage l=new LoginPage(driver);
//		l.clickResetPassbtn();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
//	}
//
//	@Then("user redirected to login page")
//	public void user_redirected_to_login_page() {
//	    // Write code here that turns the phrase above into concrete actions
//	    //throw new io.cucumber.java.PendingException();
//	
//	}
//
//
//	

@When("user click on login4")
public void user_click_on_login4() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
	LoginPage l=new LoginPage(driver);
	l.login_icon();
	
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

}
@When("user enter {string} and {string}")
public void user_enter_and(String username, String password) {
    // Write code here that turns the phrase above into concrete actions
	LoginPage l=new LoginPage(driver);
//	ExcelReader reader = new ExcelReader();
//	List<Map<String,String>> testdata = reader.getData(".\\src\\test\\resources\\login_file.xlsx",string);
//	String username = testdata.get(int1).get("username");
//	String pw = testdata.get(int1).get("password");
	l.Enterloginname(username);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
	l.Enterpassword(password);
}

@Then("I should be logged in successfully")
public void i_should_be_logged_in_successfully() {
    // Write code here that turns the phrase above into concrete actions
    //throw new io.cucumber.java.PendingException();
}


}