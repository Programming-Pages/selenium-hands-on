import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locatoridentifiers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "/Users/deepthyjayaraj/automation/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("deepthyjayaraj@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("mypassword");
		driver.findElement(By.name("login")).click();
		driver.findElement(By.linkText("Forgot Password?")).click();
		
		
		

	}

}
