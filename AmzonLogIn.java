package postJobAssignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmzonLogIn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webDriver.driver.chromeDriver", "E:\\Selenium\\chromeDriver\\chrome-win64.exe");

		WebDriver driver = new ChromeDriver();

		driver.get(
				"https://www.amazon.in/ap/signin?openid.pape.max_auth_age=3600&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fhz5%2Fyourmembershipsandsubscriptions%3Fref_%3Dnav_AccountFlyout_digital_subscriptions&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=amzn_swa_in&openid.mode=checkid_setup&language=en_IN&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&pageId=amazon&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("ap_email")).sendKeys("debashissahoo372@gmail.com");
		
		driver.findElement(By.id("ap_password")).sendKeys("Raja@3013");
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.findElement(By.id("signInSubmit")).click();
	}

}
