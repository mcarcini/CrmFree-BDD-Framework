package stepsDefinitions;

import java.util.concurrent.TimeUnit;

import junit.framework.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDefinition {
	
	WebDriver driver;
		
	@Given("^User is already on login page.$")
	public void user_is_already_on_login_page() {	    		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://freecrm.com");
		driver.findElement(By.xpath("/html/body/div[1]/header/div/nav/div[2]/div/div[2]/ul/a")).click();
	}

	@When("^title of login page is Free CRM$")
	public void title_of_login_page_is_Free_CRM() {
		String title = driver.getTitle();		
		Assert.assertEquals("El titulo de la pagina es incorrecto","CRM", title);
	}

	@Then("^User enter username$")
	public void user_enter_username() {
		driver.findElement(By.name("email")).sendKeys("marco.carcini@hotmail.com");
	}

	@Then("^User enter password$")
	public void user_enter_password() {
		driver.findElement(By.name("password")).sendKeys("A123456789a");
	}

	@Then("^User clicks on login button$")
	public void user_clicks_on_login_button() {
		driver.findElement(By.xpath("//*[@id=\"ui\"]/div/div/form/div/div[3]")).click();
	}
	
	@Then("^User is on home page$")
	public void user_is_on_home_page() {
		String title = driver.getTitle();		
		Assert.assertEquals("El titulo del home page es incorrecto","CRM", title);
	}

	

}
