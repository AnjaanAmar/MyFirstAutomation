package WebElementsMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class gVerifyTheTextField {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.vtiger.com/vtigercrm/");
	WebElement Usrname = driver.findElement(By.id("username"));
	String Value = Usrname.getAttribute("value");
	System.out.println(Value);
}
}
