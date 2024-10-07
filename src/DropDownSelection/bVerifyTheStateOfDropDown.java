package DropDownSelection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class bVerifyTheStateOfDropDown {
public static void main(String[] args) {
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/reg/");
	WebElement Year = driver.findElement(By.id("year"));
	Select YY = new Select(Year);
	if(YY.isMultiple())
	{
		System.out.println("Drop down is Multiselect");
	}
	else
	{
		YY.selectByValue("1998");
	}
}
}
