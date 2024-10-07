package WebElementsMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class cClearAndEnterTheData {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.vtiger.com/vtigercrm/");
	WebElement Clear = driver.findElement(By.id("username"));
	Clear.clear();
	Clear.sendKeys("Amar");
	WebElement Pass = driver.findElement(By.id("password"));
	Pass.clear();
	Pass.sendKeys("123");
}
}
