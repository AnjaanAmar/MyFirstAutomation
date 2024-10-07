package WebElementsMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class aScrollMethod {
public static void main(String[] args) {
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://sandbox.abdm.gov.in/applications/cowin/home/cowin_signup_form");
	WebElement Accept = driver.findElement(By.xpath("//button[text()='Accept Terms of Service']"));
	Accept.click();
}
}
