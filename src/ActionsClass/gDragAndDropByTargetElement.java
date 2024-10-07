package ActionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class gDragAndDropByTargetElement {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://jqueryui.com/droppable/");
	driver.switchTo().frame(0);
	WebElement Drag = driver.findElement(By.id("draggable"));
	WebElement Drop = driver.findElement(By.id("droppable"));
	Actions Action = new Actions(driver);
	Action.dragAndDrop(Drag, Drop).perform();
}
}
