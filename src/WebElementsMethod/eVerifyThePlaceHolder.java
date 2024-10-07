package WebElementsMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class eVerifyThePlaceHolder {
public static void main(String[] args) {
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	WebElement Email = driver.findElement(By.id("email"));
	String plshlder = Email.getAttribute("placeholder");
	System.out.println(plshlder);
}
}
//It is used getting the name from the perticular place holder