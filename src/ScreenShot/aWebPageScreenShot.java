package ScreenShot;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class aWebPageScreenShot {
public static void main(String[] args) throws IOException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	String StampTime = LocalDateTime.now().toString().replace(":","-");
	driver.get("https://www.facebook.com/");
	TakesScreenshot TS = (TakesScreenshot)driver;
	File tempScreenshot = TS.getScreenshotAs(OutputType.FILE);
	File PermanentScreenshot = new File("./errorshot/"+StampTime+"facebook.png");
	FileUtils.copyFile(tempScreenshot, PermanentScreenshot);
	
}
}
