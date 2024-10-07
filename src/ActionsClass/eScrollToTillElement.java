package ActionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class eScrollToTillElement {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://www.cowin.gov.in/");
	WebElement Search = driver.findElement(By.xpath("//button[text()='Search']"));
	Actions Action = new Actions(driver);
	Action.scrollToElement(Search).pause(2000).click(Search).perform();
}
}
