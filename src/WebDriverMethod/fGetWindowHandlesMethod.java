package WebDriverMethod;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class fGetWindowHandlesMethod {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	String t = driver.getTitle();
	System.out.println(t);
	String u = driver.getCurrentUrl();
	System.out.println(u);
	driver.switchTo().newWindow(WindowType.TAB);
	driver.get("https://www.instagram.com/");
     Set<String> AllWinID = driver.getWindowHandles();// used to capture the all windows id
     System.out.println(AllWinID);
}
}
 