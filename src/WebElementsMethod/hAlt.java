package WebElementsMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class hAlt {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com/");
	WebElement Groceryimg = driver.findElement(By.xpath("//span[text()='Grocery']/../..//img                        [@class='_2puWtW _3a3qyb']"));
	String Attr = Groceryimg.getAttribute("alt");
	System.out.println("Alt ="+Attr);
}
}
