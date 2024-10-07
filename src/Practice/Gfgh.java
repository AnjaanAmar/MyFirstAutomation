package Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Gfgh {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://jqueryui.com/droppable/");
	driver.switchTo().frame(0);
	WebElement Drg = driver.findElement(By.id("draggable"));
	WebElement Drp = driver.findElement(By.id("droppable"));
	Actions Action = new Actions(driver);
	Action.clickAndHold(Drg).pause(10).release(Drp).perform();
}
}
