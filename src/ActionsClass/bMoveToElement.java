package ActionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class bMoveToElement {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://www.firstcry.com/");
	WebElement Boy = driver.findElement(By.xpath("//a[text()=' BOY FASHION']"));
	WebElement Girl = driver.findElement(By.xpath("//a[text()=' GIRL FASHION']"));
	WebElement Foot = driver.findElement(By.xpath("//a[text()=' Footwear']"));
	WebElement Toys = driver.findElement(By.xpath("//a[text()=' Toys']"));
	WebElement Diaper = driver.findElement(By.xpath("//a[text()=' Diapering']"));
    WebElement Gear = driver.findElement(By.xpath("//a[text()=' Gear']"));
    WebElement Feeding = driver.findElement(By.xpath("//a[text()=' Feeding']"));
    WebElement Bath = driver.findElement(By.xpath("//a[text()=' Bath']"));
    WebElement Nursery = driver.findElement(By.xpath("//a[text()=' Nursery']"));
    WebElement Moms = driver.findElement(By.xpath("//a[text()=' Moms']"));
    WebElement Health = driver.findElement(By.xpath("//a[text()=' Health']"));
    WebElement Bouti = driver.findElement(By.xpath("//a[text()=' Boutiques']"));
    Actions Actions = new Actions(driver);
    Actions.moveToElement(Bouti).pause(1000).moveToElement(Health).pause(1000).moveToElement(Moms).pause(1000).moveToElement(Nursery).pause(1000).moveToElement(Bath).pause(1000).moveToElement(Feeding).pause(1000).moveToElement(Gear).pause(1000).moveToElement(Gear).pause(1000).moveToElement(Diaper).pause(1000).moveToElement(Toys).pause(1000).moveToElement(Foot).pause(1000).moveToElement(Girl).pause(1000).moveToElement(Boy).perform();
}
}
