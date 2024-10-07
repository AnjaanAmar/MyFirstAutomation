package WebElementsMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dWrongUsageOfSubmit {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://shop-global.malaicha.com/login");
	WebElement Reg = driver.findElement(By.xpath("//button[text()='Register']"));
	Reg.submit();//unsupportedOperationException because of form tag and type=submit is not there
}
}
