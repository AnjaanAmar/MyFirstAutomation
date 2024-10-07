package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class bWrongIdUsage {
		public static void main(String[] args) {
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.facebook.com/");
			WebElement Login = driver.findElement(By.id("u_0_5_1E"));//No such element exception
			Login.click();
		}
		}
