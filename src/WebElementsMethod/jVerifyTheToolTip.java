package WebElementsMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class jVerifyTheToolTip {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com/");
	WebElement Cart = driver.findElement(By.xpath("//a[text()='Cart']"));
	String ToolTip = Cart.getAttribute("title");
	System.out.println("ToolTip of Cart Icon ="+ToolTip);
}
}
