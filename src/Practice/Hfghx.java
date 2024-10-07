package Practice;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hfghx {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	driver.switchTo().activeElement().sendKeys("Amar");
	driver.switchTo().activeElement().sendKeys(Keys.TAB);
	driver.switchTo().activeElement().sendKeys("12345");
	driver.switchTo().activeElement().sendKeys(Keys.TAB);
	driver.switchTo().activeElement().sendKeys(Keys.TAB);
	driver.switchTo().activeElement().sendKeys(Keys.ENTER);
}
}
