package WebElementsMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

public class iVerifytheColorofLoginButton {
public static void main(String[] args) {
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	WebElement CreateButton = driver.findElement(By.xpath("//a[text()='Create new account']"));
	String BgndColor = CreateButton.getCssValue("background-color");
	System.out.println("CreateNewAccountBackgroundColor ="+ BgndColor);
	String ConvertedValue = Color.fromString(BgndColor).asHex();
	System.out.println("ConvertedValue ="+ConvertedValue);
	
}
}




