package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

public class Cmnk {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	WebElement N = driver.findElement(By.name("login"));
	String B = N.getCssValue("background-color");
	System.out.println(B);
	String Con = Color.fromString(B).asHex();
	System.out.println(Con);
}
}
