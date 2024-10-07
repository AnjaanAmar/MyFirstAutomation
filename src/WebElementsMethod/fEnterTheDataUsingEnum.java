package WebElementsMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class fEnterTheDataUsingEnum {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.vtiger.com/vtigercrm/");
	WebElement Usrname = driver.findElement(By.id("username"));
	Usrname.sendKeys(Keys.CONTROL+"a");
	Usrname.sendKeys(Keys.DELETE);
	Usrname.sendKeys(Keys.chord("Amar"));
}
}
