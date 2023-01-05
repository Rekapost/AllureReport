package login_Allure;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LoginAllure {
	@Test
	@Parameters({"username","password"})
	public void loginWithBothCorrect(String userName,String  passWord) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Reka\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://practice.automationtesting.in/my-account/");
		WebElement UsernameBox=driver.findElement(By.id("username"));
		UsernameBox.sendKeys(userName);
		WebElement passwordBox=driver.findElement(By.id("password"));
		passwordBox.sendKeys(passWord);
		WebElement login=driver.findElement(By.xpath("//*[@id=\'customer_login\']/div[1]/form/p[3]/input[3]"));
		login.click();
		driver.quit();
	}
}
//cmd    allure serve C:\Users\Reka\eclipse-workspace\AllureReport\allure-results(pathof the allure-results folder) 