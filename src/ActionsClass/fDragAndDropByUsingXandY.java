package ActionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class fDragAndDropByUsingXandY 
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));	
		driver.get("https://jqueryui.com/draggable/");
		driver.switchTo().frame(0);
		WebElement draggable = driver.findElement(By.id("draggable"));
		Actions action = new Actions(driver);
		action.scrollByAmount(0, 100).dragAndDropBy(draggable, 123, 120).perform();
	}
}