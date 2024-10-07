package WebDriverMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class iGetClosesndQuitMethod {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.instagram.com/");
	driver.switchTo().newWindow(WindowType.WINDOW);
	driver.get("https://www.facebook.com/");
	driver.manage().window().minimize();
//	driver.close();  It will terminate where the driver control is present
	driver.quit(); // It will terminate all the windows
}
}
