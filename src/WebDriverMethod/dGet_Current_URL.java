package WebDriverMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class dGet_Current_URL {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	String Title = driver.getTitle();
	String URL = driver.getCurrentUrl();
	System.out.println(URL + Title);
}
}
