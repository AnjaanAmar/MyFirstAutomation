package WebDriverMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class eGetWindowHandleMethod {
public static void main(String[] args) {
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	String T = driver.getTitle();
	System.out.println(T);
	String U = driver.getCurrentUrl();
	System.out.println(U);
	String Id = driver.getWindowHandle(); // used to capture the window id
	System.out.println(Id);
}
}
