  package Ohrmstepdefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Ohrm {
	WebDriver driver=null;
	int a=3000;
	@Given("open browser")
	public void open_browser() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(a);
		}

	@And("valid {string} and {string}")
	public void valid_and(String uid, String pwd) throws InterruptedException {
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(uid);
		Thread.sleep(a);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(pwd);
		Thread.sleep(a);
		
	}

	@Then("click on login")
	public void click_on_login() throws InterruptedException {
		driver.findElement(By.xpath("//button[text()=' Login ']")).click();
		Thread.sleep(a);
		
		driver.close();
	}


}
