package StepDefinitions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
 
public class ExcelExec {
	WebDriver driver = new ChromeDriver();
	@Test(dataProvider = "loginData" , dataProviderClass = ExcelDataProvider.class)
	public  void TestExcel(String username,String password)
	{
	driver.get("https://www.edureka.co/");
    driver.findElement(By.xpath("//span[@data-button-name='Login']")).click();
	WebElement user = driver.findElement(By.id("si_popup_email"));
	user.sendKeys(username);
	WebElement pass = driver.findElement(By.id("si_popup_passwd"));
	pass.sendKeys(password);
	WebElement login = driver.findElement(By.xpath("//button[contains(text(),'Login')]"));
	login.click();
	}
}
