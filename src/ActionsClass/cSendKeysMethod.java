package ActionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class cSendKeysMethod {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://www.facebook.com/");
	WebElement Email = driver.findElement(By.id("email"));
	WebElement Password = driver.findElement(By.id("pass"));
	WebElement Login = driver.findElement(By.name("login"));
	Actions Action = new Actions(driver);
	Action.sendKeys(Email,"amar@gmail.com").pause(1000).sendKeys(Password,"123456").pause(1000).click(Login).perform();
}
}
