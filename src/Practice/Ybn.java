package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Ybn {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/reg/");
	WebElement Y = driver.findElement(By.id("year"));
	Select YY = new Select(Y);
	if(YY.isMultiple())
	{
		System.out.println("It is MulSe");
	}
	else
	{
		YY.selectByValue("1998");
	}
}
}
