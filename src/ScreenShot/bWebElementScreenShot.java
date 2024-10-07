package ScreenShot;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class bWebElementScreenShot {
public static void main(String[] args) throws IOException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	String Timestamp = LocalDateTime.now().toString().replace(":","-");
	driver.get("https://www.facebook.com/");
	WebElement PWDTextField = driver.findElement(By.id("passContainer"));
    File TempScreenshot = PWDTextField.getScreenshotAs(OutputType.FILE);
    File PermanentSS = new File("./errorshot/"+Timestamp+"Pwd.png");
    FileUtils.copyFile(TempScreenshot, PermanentSS);
}
}
