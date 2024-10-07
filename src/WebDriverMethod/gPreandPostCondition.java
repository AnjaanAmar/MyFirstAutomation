package WebDriverMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class gPreandPostCondition {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();  // pre condition
	driver.get("https://www.instagram.com/");
	driver.switchTo().newWindow(WindowType.TAB);
	driver.get("https://www.facebook.com/");
	driver.manage().window().minimize();  // post condition	
}
}
