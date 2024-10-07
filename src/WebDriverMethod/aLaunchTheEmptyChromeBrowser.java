package WebDriverMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class aLaunchTheEmptyChromeBrowser
{
	public static void main(String[] args) {
	WebDriver driver = new ChromeDriver(); // constructor overloading
	driver.manage().window().maximize();  //  method chaining
	}
}
