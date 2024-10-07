package ActiveElement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSugession {
public static void main(String[] args) {
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.com/");
	driver.switchTo().activeElement().sendKeys("World cup 2024");
    List<WebElement> Cricket = driver.findElements(By.xpath("//ul[@role='listbox']//li"));
}
}
