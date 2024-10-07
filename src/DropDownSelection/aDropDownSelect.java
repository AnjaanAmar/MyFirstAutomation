package DropDownSelection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class aDropDownSelect {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/reg/");
		//select by index
		WebElement Date = driver.findElement(By.id("day"));
		Select DD = new Select(Date);
		DD.selectByIndex(24);
		//select by value
		WebElement Month = driver.findElement(By.id("month"));
	    Select MM = new Select(Month);
	    MM.selectByValue("5");
	    //select by Visible text
	    WebElement Year = driver.findElement(By.id("year"));
	    Select YY = new Select(Year);
	    YY.selectByVisibleText("1998");
	    }

}
